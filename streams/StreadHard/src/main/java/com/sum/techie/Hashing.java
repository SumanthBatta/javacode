//package com.sum.techie;
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//public class Hashing {
//
//    public static void main(String[] args) {
//        System.out.println(getCount(4,new int[]{1,2,1,3,2,4,4,4,5,5}));
//        System.out.println(getCharCount('a',"abcdabefac"));
//
//        System.out.println(getFrequency(4,new int[]{1,2,1,3,2,4,4,4,5,5}));
//
//    }
//
//    public static int getCount(int n , int [] arr){
////        int [] hash = new int[1000000000];
////        for(int i = 0; i< arr.length;i++){e2wfdwefdwrfd3rwefwed3rwe
////            if(n==arr[i]){
////                hash[n]++;
////            }
////        }
////        return hash[n];
//        Map<Integer,Integer> hash = new LinkedHashMap<>();
//        for(int i =0; i<arr.length;i++){
//            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
//        }
//        return hash.get(n);
//    }
//    public static int getCharCount(char c, String word){
////        int[] hash = new int [25];
////        for(int i = 0;i<word.length();i++){
////            int a = word.charAt(i)-'a';
////            hash[a]++;
////        }
////        return hash[c-'a'];
//        Map<Character,Integer> hash = new LinkedHashMap<>();
//        for(int i =0; i<word.length();i++){
//            hash.put(word.charAt(i),hash.getOrDefault(word.charAt(i),0)+1);
//        }
//        return hash.get(c);
//    }
//
//    public static int getFrequency(int n, int[] arr){
//        Map<Integer,Integer> hash = new HashMap<>();
//        for(int i = 0; i<arr.length;i++)
//    }
//
//}
