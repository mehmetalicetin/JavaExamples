package chapter2.memoryLeak;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/*
strong reference:
The strong reference is the most common type of Reference that we use in our day to day programming:

soft reference:
Simply put, an object that has a SoftReference pointing to
it won't be garbage collected until the JVM absolutely needs memory.

weak reference:
The objects that are referenced only by weak references are garbage collected eagerly;
the GC won't wait until it needs memory in that case.
*/
public class WeakReferences {
    public static void main(String[] args) {
        Integer prime = 1;//Strong reference.
        WeakReference<Integer> weak = new WeakReference<Integer>(prime);//changed as weak reference.
        prime = null;

        Integer primeSoft = 1;
        SoftReference<Integer> soft = new SoftReference<Integer>(primeSoft);
        prime = null;
    }
}
