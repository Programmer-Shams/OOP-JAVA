package src.com.tutorial.CollectionsFramework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        System.out.println(list);

        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list); // [Apple, Banana, Cherry]



        // Set: Unordered collection with no duplicates (e.g., HashSet, TreeSet)
        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Banana");
        System.out.println(set); // [Apple, Banana]


        // Queue Example
        // queue follows the FIFO (First-In-First-Out) principle
        // "Apple" is added to the end of the queue.
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        System.out.println(queue.poll()); // Apple

        // queue.poll(): Retrieves and removes the head (first element) of the queue, which is "Apple" in this case.


        // Map Example
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        System.out.println(map.get(1)); // Apple

    }
}
