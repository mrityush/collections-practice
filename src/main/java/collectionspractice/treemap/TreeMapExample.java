package main.java.collectionspractice.treemap;

import main.java.collectionspractice.utils.Utils;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by mj on 21/6/16.
 */
public class TreeMapExample {
    private final Map<String, Integer> stringIntegerHashMap;
    private Map<String, Integer> stringIntegerMap;
    private Integer size = 10;
    private String demandedKey = "5  abc";

    public TreeMapExample() {
        stringIntegerMap = Utils.fillTreeMap(size);
        stringIntegerHashMap = Utils.fillMap(size);
    }

    public void startExample() {
        Iterator<String> stringIterator = stringIntegerMap.keySet().iterator();
        Long initTime = System.nanoTime();
        while (stringIterator.hasNext()) {
            String key = stringIterator.next();
            System.out.println("key in TreeMap = " + key);
            if (key.equals(demandedKey))
                break;
        }
        Long endTime = System.nanoTime();
        System.out.println("Difference in searching for key in treemap - " + (endTime - initTime));

        Iterator<String> stringIterator1 = stringIntegerHashMap.keySet().iterator();

        Long initTime2 = System.nanoTime();
        while (stringIterator1.hasNext()) {
            String key = stringIterator1.next();
            System.out.println("key in HashMap = " + key);
            if (key.equals(demandedKey))
                break;
        }
        Long endTime2 = System.nanoTime();
        System.out.println("Difference in searching for key in hashmap - " + (endTime2 - initTime2));
    }
}
