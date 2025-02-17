package com.wipro.java.collection.treemap;

import java.util.*;

public class TreeMapManager {
    private TreeMap<Integer, String> treeMap;

    public TreeMapManager() {
        treeMap = new TreeMap<>();
    }

    // Method to add items to the TreeMap
    public void addItem(int id, String name) {
        treeMap.put(id, name);
    }

    // Method to get the TreeMap
    public TreeMap<Integer, String> getTreeMap() {
        return treeMap;
    }

    // Method to display the Treemap
    public void displayTreeMap() {
        System.out.println("TreeMap (Ordered by Key): " + treeMap); 
    }
}
