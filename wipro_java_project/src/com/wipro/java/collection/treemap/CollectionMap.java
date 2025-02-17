package com.wipro.java.collection.treemap;

public class CollectionMap {
    public static void main(String[] args) {
        // Create the TreeMapManager instance
        TreeMapManager treeMapManager = new TreeMapManager();

        // Add some data to the TreeMap
        treeMapManager.addItem(1, "Wipro");
        treeMapManager.addItem(2, "Infosys");
        treeMapManager.addItem(3, "TCS");
        treeMapManager.addItem(4, "Capgemini");

        // Display the TreeMap
        treeMapManager.displayTreeMap();

        // Now, create the HashMapManager instance with the TreeMap Data
        HashMapManager hashMapManager = new HashMapManager(treeMapManager.getTreeMap());

        // Display the HashMap
        hashMapManager.displayHashMap();
    }
}
