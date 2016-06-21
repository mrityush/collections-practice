package main.java.collectionspractice;

import main.java.collectionspractice.treeset.TreeSetExample;

/**
 * Created by mj on 16/6/16.
 */
public class MainClass {

    private static int capacity = 16;
    private static float loadFactor = 0.8f;
    private static int concurrencyLevel = 10;

    public static void main(String[] args) {
        //IDENTITYHASHMAP
//        IHMExample ihmExample = new IHMExample();

        //FAILFAST
//        FailFastExample failFastExample = new FailFastExample();
//        failFastExample.startExample();

        //CONCURRENTHASHMAP
//        CHMExample chmExample = new CHMExample(capacity, loadFactor, concurrencyLevel);//TO CHECK FUNCTIONING OF CONCURRENT HASHMAPS

        //LINKEDHASHMAP
//        LHMExample lhmExample = new LHMExample();
//        lhmExample.startLExample();

        //PRIORITYQUEUE
//        PQExample pqExample = new PQExample() ;

        //TREEMAP
//        TreeMapExample treeMapExample = new TreeMapExample();
//        treeMapExample.startExample();

        //TREESET
        TreeSetExample treeSetExample = new TreeSetExample();
        treeSetExample.startExample();
    }
}
