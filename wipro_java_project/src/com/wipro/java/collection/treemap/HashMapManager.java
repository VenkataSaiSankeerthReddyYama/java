package com.wipro.java.collection.treemap;

import java.util.*;

public class HashMapManager {
    private HashMap<Integer, String> hashMap;

    public HashMapManager(TreeMap<Integer, String> treeMap) {
        hashMap = new HashMap<>(treeMap);
    }

    // Method to get the HashMap
    public HashMap<Integer, String> getHashMap() {
        return hashMap;
    }

    // Method to display the Hashmap
    public void displayHashMap() {
        System.out.println("HashMap (No Guaranteed Order): " + hashMap);  
    }
}
