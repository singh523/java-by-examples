package com.example.features.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapIterator {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Jane", 25);
        map.put("Jill", 35);
        map.put("smith", 40);
        map.put("testing", 50);
        map.put("fnsuser", 60);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        Map<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("John", 30);
        hashTable.put("Jane", 25);
        hashTable.put("Jill", 35);
        hashTable.put("smith", 40);
        hashTable.put("testing", 50);
        hashTable.put("fnsuser", 60);
        //hashTable.put(null, 90);
    }
}
