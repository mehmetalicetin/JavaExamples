import chapter2.memoryLeak.BigImage;
import chapter2.memoryLeak.UniqueImageName;
import org.awaitility.Awaitility;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static org.junit.Assert.assertTrue;

public class WeakReferencesTest {

    @Test
    public void test(){

        Map<UniqueImageName, BigImage> map = new WeakHashMap<>();
        BigImage bigImage = new BigImage("image_id");
        UniqueImageName imageName = new UniqueImageName("name_of_big_image");

        map.put(imageName, bigImage);
        assertTrue(map.containsKey(imageName));

        imageName = null;
        System.gc();

        await().atMost(10, TimeUnit.SECONDS).until(map::isEmpty);
    }

    @Test
    public void test2(){
        WeakHashMap<UniqueImageName, BigImage> map = new WeakHashMap<>();
        BigImage bigImageFirst = new BigImage("foo");
        UniqueImageName imageNameFirst = new UniqueImageName("name_of_big_image");

        BigImage bigImageSecond = new BigImage("foo_2");
        UniqueImageName imageNameSecond = new UniqueImageName("name_of_big_image_2");

        map.put(imageNameFirst, bigImageFirst);
        map.put(imageNameSecond, bigImageSecond);

        assertTrue(map.containsKey(imageNameFirst));
        assertTrue(map.containsKey(imageNameSecond));

        imageNameFirst = null;
        System.gc();

        await().atMost(10, TimeUnit.SECONDS)
                .until(() -> map.size() == 1);
        await().atMost(10, TimeUnit.SECONDS)
                .until(() -> map.containsKey(imageNameSecond));
    }

    @Test
    public void test3(){
        WeakHashMap<Integer, String> map = new WeakHashMap<>();

        Integer id1 = 1;
        Integer id2 = 2;
        map.put(id1, "bigImageFirst");
        map.put(id2, "bigImageSecond");

        assertTrue(map.containsKey(1));
        assertTrue(map.containsKey(2));

        id1 = null;
        System.gc();

        await().atMost(10, TimeUnit.SECONDS)
                .until(() -> map.size() == 1);
        await().atMost(10, TimeUnit.SECONDS)
                .until(() -> map.containsKey(id2));
    }
}
