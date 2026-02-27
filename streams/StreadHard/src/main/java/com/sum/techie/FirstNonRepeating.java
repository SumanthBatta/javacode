package com.sum.techie;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("scabbard"));
        System.out.println(firstNonRepeating("ssccabbard"));
        System.out.println(firstNonRepeatingHash("ssccabbard"));
    }
    public static String firstNonRepeatingHash(String s){
        Map<Character,Integer> chars = new LinkedHashMap<>();
        for(char c : s.toCharArray()){
           chars.put(c,chars.getOrDefault(c,0)+1);

        }
        for(Map.Entry<Character,Integer> entry : chars.entrySet() ){
            if(entry.getValue()==1){
               return entry.getKey().toString();
            }
        }
        return "Not found";
    }

    public static Character firstNonRepeating(String s) {
        int[] freq = new int[256];
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        for(char c : s.toCharArray()){
            if(freq[c]==1){
                return c;
            }
        }
        return 'c';
//        int [] freq = new int[256];
//        for(char c : s.toCharArray()){
//            freq[c]++;
//        }
//
//        for(char c : s.toCharArray()){
//            if(freq[c]==1)
//            return c;
//        }
//        return 'c';
    }

    public static String removeDuplicates(String s) {
//        boolean[] seen = new boolean[256];
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : s.toCharArray()) {
//            if (!seen[c]) {
//                seen[c] = true;
//                sb.append(c);
//            }
//        }
//        return sb.toString();
        Set<Character> seen = new LinkedHashSet<>();
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray()){
            if(seen.add(c)){
                sb.append(c);
            }
        }
        return sb.toString();


    }

}
