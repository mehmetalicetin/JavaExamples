package com.cetin.stream;

import java.util.HashMap;
import java.util.Map;

public class CumputeAbsent {
    /*
     * The computeIfAbsent method takes two parameters. The first parameter is the key and the second parameter is the mappingFunction.
     * It's important to know that mapping function is only called if the mapping is not present.
     * */
    public static void main(String[] args) {
        // create a HashMap and add some values
        HashMap<String, Integer> map
                = new HashMap<>();
        map.put("key1", 10000);
        map.put("key2", 55000);
        map.put("key3", 44300);
        map.put("key4", 53200);

        // print map details
        System.out.println("HashMap:\n "
                + map.toString());

        // provide value for new key which is absent
        // using computeIfAbsent method
        map.computeIfAbsent("key5", k -> 2000 + 33000);
        map.computeIfAbsent("key6", k -> 2000 * 34);

        map.computeIfAbsent("key5", k -> 2000 *2);

        // print new mapping
        System.out.println("New HashMap:\n "
                + map);
    }
}
