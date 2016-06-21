package main.java.collectionspractice.concurrenthashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mj on 19/6/16.
 */
public class CHMExample {
    private int concurrencyLevel;

    public CHMExample() {
    }

    private static Map<String, Integer> stringIntegerConcurrentHMap = null;
    private static Map<String, Integer> stringIntegerHashMap = null;

    public void processCOncurrentHashMap(Map map) {
        stringIntegerConcurrentHMap = map;
        long fromTime = System.nanoTime();
//        System.out.println(fromTime);
        for (int i = 0; i < concurrencyLevel; i++) {
            Runnable threadA = new ThreadA(i);
            Thread thread = new Thread(threadA);
            thread.setName("Thread" + i);
            thread.start();
        }
        long tillTime = System.nanoTime();
//        System.out.println(tillTime);
        System.out.println("Difference  = " + (tillTime - fromTime));
        System.out.println("stringIntegerConcurrentHMap =  " + stringIntegerConcurrentHMap);
    }


    private void processHashMap(Map<String, Integer> hashMapExample) {
        stringIntegerHashMap = hashMapExample;
        long fromTime = System.nanoTime();
//        System.out.println(fromTime);
        for (int i = 0; i < concurrencyLevel; i++) {
            Runnable threadB = new ThreadB(i);
            Thread thread = new Thread(threadB);
            thread.setName("Thread" + i);
            thread.start();
        }
        long tillTime = System.nanoTime();
//        System.out.println(tillTime);
        System.out.println("Difference  = " + (tillTime - fromTime));
        System.out.println("stringIntegerHashMap =  " + stringIntegerHashMap);
    }


    private class ThreadA implements Runnable {
        private int a;

        public ThreadA(int a) {
            this.a = a;
        }

        @Override
        public void run() {
            for (int i = 0; i < stringIntegerConcurrentHMap.size(); i++) {
                Integer val1 = stringIntegerConcurrentHMap.get("key" + i);
                stringIntegerConcurrentHMap.put("key" + i, val1 + 1);
//                System.out.println("Coming from " + Thread.currentThread().getName() + ", value = " + val1);
            }
        }
    }

    private class ThreadB implements Runnable {
        private int a;

        public ThreadB(int a) {
            this.a = a;
        }

        @Override
        public void run() {
            synchronized (stringIntegerHashMap) {
                for (int i = 0; i < stringIntegerHashMap.size(); i++) {
                    Integer val1 = stringIntegerHashMap.get("key" + i);
                    stringIntegerHashMap.put("key" + i, val1 + 1);
//                    System.out.println("Coming from " + Thread.currentThread().getName() + ", value = " + val1);
                }
            }
        }
    }

    //    public static void main(String[] args) {
    public CHMExample(int capacity, float loadFactor, int concurrencyLevel) {
        this.concurrencyLevel = concurrencyLevel;
        Map<String, Integer> concurrentHashMapExample = new ConcurrentHashMap<String, Integer>(capacity, loadFactor, concurrencyLevel);
        Map<String, Integer> hashMapExample = new HashMap<String, Integer>(capacity, loadFactor);

        concurrentHashMapExample = fillMap(concurrentHashMapExample);
        hashMapExample = fillMap(hashMapExample);
        processCOncurrentHashMap(concurrentHashMapExample);
        processHashMap(hashMapExample);
    }

    private Map<String, Integer> fillMap(Map<String, Integer> mapExample) {
        mapExample.put("key0", 0);
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
