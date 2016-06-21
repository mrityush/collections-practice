package main.java.collectionspractice.utils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by mj on 20/6/16.
 */
public class Utils {

    public static List<String> fillList(Integer testSize) {
        List<String> passableList = new ArrayList<String>();
        for (int i = 0; i < testSize; i++) {
            passableList.add(String.valueOf(i));
        }
        return passableList;
    }

    public static Set<String> fillSet(Integer testSize) {
        Set<String> passableSet = new HashSet<String>();
        for (int i = 0; i < testSize; i++) {
            passableSet.add(String.valueOf(i) + "  abc");
        }
        return passableSet;
    }

    public static Map<String, Integer> fillMap(Integer testSize) {
        Map<String, Integer> passableMap = new HashMap<String, Integer>();
        for (int i = 0; i < testSize; i++) {
            passableMap.put(String.valueOf(i) + "  abc", i);
        }
        return passableMap;
    }

    public static Map<String, Integer> fillConcurrentMap(Integer testSize) {
        Map<String, Integer> passableMap = new ConcurrentHashMap<String, Integer>();
        for (int i = 0; i < testSize; i++) {
            passableMap.put(String.valueOf(i) + "  abc", i);
        }
        return passableMap;
    }

    public static Map<String, Integer> fillLinkedHashMap(Integer testSize) {
        Map<String, Integer> passableMap = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < testSize; i++) {
            passableMap.put(String.valueOf(i) + "  abc", i);
        }
        return passableMap;
    }

    public static Queue<String> fillQueue(Integer testSize) {
        String[] abx = {"a1", "ga1", "wa1", "ra1", "ca1", "qa1", "za1", "da1", "ta1", "ha1", "ja1", "ka1", "fa1", "ba1", "fa1", "na1"
                , "zfa1", "dfa1", "tfa1", "haf1", "jfa1", "kfa1", "ffa1", "fba1", "ffa1", "nfa1"};
        Queue<String> strings = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < testSize; i++) {
            strings.add(abx[i]);
//            strings.add(String.valueOf((int) (Math.random() * 100) + "  abc"));
//            System.out.println(strings);
        }
        return strings;
    }

    public static Map<String, Integer> fillTreeMap(Integer testSize) {
        Map<String, Integer> passableMap = new TreeMap<String, Integer>();
        for (int i = 0; i < testSize; i++) {
            passableMap.put(String.valueOf(i) + "  abc", i);
        }
        return passableMap;
    }

    public static Set<String> fillTreeSet(Integer testSize) {
        Set<String> passableSet = new TreeSet<String>();
        for (int i = 0; i < testSize; i++) {
            passableSet.add(String.valueOf(i) + "  abc");
        }
        return passableSet;
    }
}
