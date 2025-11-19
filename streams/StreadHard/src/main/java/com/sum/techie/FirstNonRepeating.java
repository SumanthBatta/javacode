package com.sum.techie;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeating {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("scabbard"));
    }
    public static Character firstNonRepeating(String s) {
        int [] freq = new int[256];
        for(char c : s.toCharArray()){
            freq[c]++;
        }

        for(char c : s.toCharArray()){
            if(freq[c]==1)
            return c;
        }
        return null;

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
