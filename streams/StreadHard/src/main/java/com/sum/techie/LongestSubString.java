package com.sum.techie;

import java.sql.Array;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        System.out.println(subStr("pwwkew"));
    }

    public static String subStr(String a) {
        char[] arr = a.toCharArray();
        Set<Character> res = new HashSet<>();
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();


        for(int i =0; i<a.length();i++){
            if(res.add(arr[i])){
                res1.append(arr[i]);
            }
            else{
                if(res1.length()>res2.length()){
                    res2 = new StringBuilder(res1);

                }
                res.clear();
                res1.setLength(0);

                res.add(arr[i]);
                res1.append(arr[i]);
            }

        }
        if (res1.length() > res2.length()) {
            res2 = res1;
        }
//        for (int i = 0; i <= a.length() - 1; i++) {
//            if (res.add(arr[i])) {
//                res1.append(arr[i]);
//            }
//            for (int j = i+1; j < a.length(); j++) {
//                if (!res.add(arr[j])) {
//                    if (res1.length() > res2.length()) {
//                        res2 = res1;
//                    }
//                    res = new HashSet<>();
//                    res1 = new StringBuilder();
//
//                    continue;
//
//                }
//                res1.append(arr[j]);
////                System.out.println(res1.toString());
//            }
//
//            if (res1.length() > res2.length()) {
//                res2 = res1;
//            }
//            res1 = new StringBuilder();
//        }
        return res2.toString();
    }
}
