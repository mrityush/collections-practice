package main.java.collectionspractice.failfast;

import main.java.collectionspractice.utils.Utils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mj on 20/6/16.
 */
public class FailFastExample {
    private Map<String, Integer> testMap = new HashMap<String, Integer>();
    private Map<String, Integer> testConcurrentMap = new ConcurrentHashMap<String, Integer>();
    private Set<String> testSet = new HashSet<String>();
    private List<String> testList = new ArrayList<String>();
    private Integer testSize = 10;

    public void startExample() {
        //FAIL FAST USING MAP
//        testMap = Utils.fillMap(testSize);
//        Runnable runnable1 = new ThreadA();
//        Thread thread1 = new Thread(runnable1);
//        Runnable runnable2 = new ThreadA();
//        Thread thread2 = new Thread(runnable2);
//        thread1.start();
//        thread2.start();
        //FAIL FAST USING SET
//        testSet = Utils.fillSet(testSize);
        //FAIL FAST USING LIST
//        testList = Utils.fillList(testSize);
        //FAIL SAFE CONCURRENT
        testConcurrentMap = Utils.fillConcurrentMap(testSize);
        System.out.println("testConcurrentMap before = " + testConcurrentMap);
        Runnable runnable1 = new ThreadD();
        Thread thread1 = new Thread(runnable1);
        Runnable runnable2 = new ThreadD();
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        System.out.println("testConcurrentMap after = " + testConcurrentMap);
    }

    private class ThreadA implements Runnable {

        @Override
        public void run() {
            Iterator iterator = testMap.entrySet().iterator();
            int count = 0;
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = (Map.Entry) iterator.next();
                count++;
                testMap.put(entry.getKey(), count);
                if (count == 2) {
                    iterator.remove();
                } else if (count == 3) {
                    testMap.remove(entry.getKey());
                }
            }
        }
    }

    private class ThreadD implements Runnable {
        @Override
        public void run() {
            Iterator iterator = testConcurrentMap.entrySet().iterator();
            int count = 0;
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = (Map.Entry) iterator.next();
                count++;
                testConcurrentMap.put(entry.getKey(), count);
                if (count == 2) {
                    iterator.remove();
                } else if (count == 3) {
                    testConcurrentMap.remove(entry.getKey());
                }
            }
        }
    }
}
