package main.java.collectionspractice.identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created by mj on 19/6/16.
 */
public class IHMExample {
    public IHMExample() {
        Map<String, Integer> stringIntegerMap = new IdentityHashMap<String, Integer>();
        stringIntegerMap = fillMap(stringIntegerMap);
        Map<String, Integer> stringIntegerMap2 = new IdentityHashMap<String, Integer>();
        stringIntegerMap2 = fillMap(stringIntegerMap2);
//        stringIntegerMap.put("a", 1);
        System.out.println("Two maps are equal ? : " + stringIntegerMap.equals(stringIntegerMap2));
    }

    private Map<String, Integer> fillMap(Map<String, Integer> mapExample) {
//        mapExample.put(new String("key0"), 0);
        mapExample.put("key1", 1);
        mapExample.put("key2", 2);
        mapExample.put("key3", 3);
        mapExample.put("key4", 4);
        mapExample.put("key5", 5);
        mapExample.put("key6", 6);
        mapExample.put("key7", 7);
        mapExample.put("key8", 8);
        mapExample.put("key9", 9);
        mapExample.put("key10", 10);
        mapExample.put("key11", 11);
        return mapExample;
    }
}
