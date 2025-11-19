package com.sum.techie;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("eat","tea","tan","ate","nat","bat");
        Map<String , List<String>> result = new HashMap<>();

    for(String a : input){
        char[] arr = a.toCharArray();
        Arrays.sort(arr);
        String key = new String(arr);
//        result.computeIfAbsent(key,k-> new ArrayList<>()).add(a);

   if(!result.containsKey(key)){
      result.put(key,new ArrayList<>());
   }
  result.get(key).add(a);
    }

        List<List<String>> grouped = new ArrayList<>(result.values());
        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }
}
