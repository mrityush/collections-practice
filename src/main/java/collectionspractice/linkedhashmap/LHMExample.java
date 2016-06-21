package main.java.collectionspractice.linkedhashmap;

import main.java.collectionspractice.utils.Utils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mj on 20/6/16.
 */
public class LHMExample {
    private Map<String, Integer> stringIntegerMap = new LinkedHashMap<String, Integer>();
    Map<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
    private Integer size = 10;

    public LHMExample() {
        Long time1 = System.nanoTime();
        stringIntegerMap = Utils.fillLinkedHashMap(size);
        Long time2 = System.nanoTime();
        stringIntegerHashMap = Utils.fillMap(size);
        Long time3 = System.nanoTime();
        System.out.println("Time to fill Linked hash map = " + (time2 - time1));
        System.out.println("Time to fill  hash map = " + (time3 - time2));
    }

    public void startLExample() {
        System.out.println("-------TO LINKED HASH MAP");
//        Iterator i = stringIntegerMap.entrySet().iterator();
//        while (i.hasNext()) {
//            System.out.println("Entry LHM--> " + i.next().toString());
//        }
        for (String a : stringIntegerMap.keySet()) {
            System.out.println("LinkedHashMap key " + a);
        }
        System.out.println("-------TO HASH MAP");
        for (String a : stringIntegerHashMap.keySet()) {
            System.out.println("HashMap key " + a);
        }
//        Iterator i2 = stringIntegerHashMap.entrySet().iterator();
//        while (i2.hasNext()) {
//            System.out.println("Entry HM--> " + i2.next().toString());
//        }
    }
}
