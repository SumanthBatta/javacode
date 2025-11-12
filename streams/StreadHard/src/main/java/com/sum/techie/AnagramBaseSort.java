package com.sum.techie;

import java.util.Arrays;

public class AnagramBaseSort {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(isAnagram(s1, s2) ? "Anagram" : "Not Anagram");
    }
    static boolean isAnagram(String s1,String s2){
        s1 = s1.replace("\\s","");
        s2 = s2.replace("\\s","");

        if(s1.length()!=s2.length()){
            return false;
        }
        char[] s3 = s1.toCharArray();
        char[]s4 = s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        return Arrays.equals(s3,s4);
    }
}
