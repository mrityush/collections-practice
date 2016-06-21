package main.java.collectionspractice.priorityqueue;

import main.java.collectionspractice.utils.Utils;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by mj on 20/6/16.
 */
public class PQExample {
    private final Integer size = 10;
    Queue<String> queue = new PriorityQueue<String>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    });

    public PQExample() {
        queue = Utils.fillQueue(size);
        System.out.println(queue);
        //Iterator does not return queue elements in sorted order... polling the queue gives prioritywise elements
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
