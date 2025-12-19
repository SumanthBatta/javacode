package com.sum.techie;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String, List<String>> cont = new HashMap<>();
        for (String a : input) {
            char[] arr = a.toCharArray();
            Arrays.sort(arr);
            String b = new String(arr);
            if (!cont.containsKey(b)) {
                cont.put(b, new ArrayList<>());
            }
            cont.get(b).add(a);

        }

        List<List<String>> res = new ArrayList<>(cont.values());

        for(List<String> each : res){
            System.out.println(each);
        }
    }}



//        Map<String , List<String>> result = new HashMap<>();
//
//    for(String a : input){
//        char[] arr = a.toCharArray();
//        Arrays.sort(arr);
//        String key = new String(arr);
////        result.computeIfAbsent(key,k-> new ArrayList<>()).add(a);
//
//   if(!result.containsKey(key)){
//      result.put(key,new ArrayList<>());
//   }
//  result.get(key).add(a);
//    }
//
//        List<List<String>> grouped = new ArrayList<>(result.values());
//        for (List<String> group : grouped) {
//            System.out.println(group);
//        }
//    }
//    }
