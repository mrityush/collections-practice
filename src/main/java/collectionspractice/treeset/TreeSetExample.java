package main.java.collectionspractice.treeset;

import main.java.collectionspractice.utils.Utils;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by mj on 22/6/16.
 */
public class TreeSetExample {
    private final Set<String> stringSet;
    private Set<String> stringTreeSet;
    private Integer size = 30;
    private String demandedKey = "1  abc";

    public TreeSetExample() {
        stringTreeSet = Utils.fillTreeSet(size);
        stringSet = Utils.fillSet(size);
    }

    public void startExample() {
        Iterator<String> stringIterator = stringTreeSet.iterator();
        Long initTime = System.nanoTime();
        while (stringIterator.hasNext()) {
            String key = stringIterator.next();
            System.out.println("key in TreeSet = " + key);
            if (key.equals(demandedKey))
                break;
        }
        Long endTime = System.nanoTime();
        System.out.println("Difference in searching for key in treeset - " + (endTime - initTime));

        Iterator<String> stringIterator1 = stringSet.iterator();

        Long initTime2 = System.nanoTime();
        while (stringIterator1.hasNext()) {
            String key = stringIterator1.next();
            System.out.println("key in HashSet = " + key);
            if (key.equals(demandedKey))
                break;
        }
        Long endTime2 = System.nanoTime();
        System.out.println("Difference in searching for key in hashset - " + (endTime2 - initTime2));
    }
}
