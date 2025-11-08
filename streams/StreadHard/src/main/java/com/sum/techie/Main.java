package com.sum.techie;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a sample map
        Map<String, Integer> collect = Map.of(
            "apple", 10,
            "banana", 25,
            "orange", 15,
            "grape", 30
        );
        
        // Find entry with maximum value
        Optional<Map.Entry<String, Integer>> maxEntry = collect.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue());
        
        System.out.println("Max entry: " + maxEntry.orElse(null));
        
        // Find entry with maximum value (reverse order approach)
        Optional<Map.Entry<String, Integer>> maxEntryReverse = collect.entrySet()
            .stream()
            .min(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        System.out.println("Max entry (reverse): " + maxEntryReverse.orElse(null));
        
        // Get just the key with max value
        Optional<String> maxKey = collect.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey);
        
        System.out.println("Key with max value: " + maxKey.orElse(null));
    }
}