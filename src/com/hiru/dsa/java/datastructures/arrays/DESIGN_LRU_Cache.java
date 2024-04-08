package com.hiru.dsa.java.datastructures.arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class DESIGN_LRU_Cache {
    HashMap<Integer, Integer> map;
    List<Integer> queue;
    int capacity;
    int used;

    public static void main(String args[]) {
        DESIGN_LRU_Cache lru = new DESIGN_LRU_Cache(3);
        System.out.println(lru.get(1));
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        lru.show();

        lru.put(3, 33);
        lru.show();

        lru.put(4, 4);
        lru.show();
    }

    public DESIGN_LRU_Cache(int capacity) {
        this.map = new HashMap<>();
        this.queue = new LinkedList();
        this.capacity = capacity;
    }

    int get(int key) {
        // Get the element from hashmap O(1)
        if (map.containsKey(key)) {
            // Update the queue
            queue.remove(key); // Remove // ---O(N)
            queue.add(key); // Add to front // ---O(1)
            return map.get(key); // ---O(1)
        } else {
            return -1;
        }

    }

    //===============================================
    void put(int key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value); // ---O(1)
            // Queue update
            if (used < capacity) {
                queue.add(key); // Add to front ---O(1)
                used++;

            } else {
                // Update the queue
                int k = queue.remove(0);// remove LRU ---O(1)
                map.remove(k); // ---O(1)
                queue.add(key); // Add to front ---O(1)
            }
        } else {
            map.put(key, value);
        }
    }

    void show() {
        System.out.println(queue);
        System.out.println(map);
        System.out.flush();
    }

}
