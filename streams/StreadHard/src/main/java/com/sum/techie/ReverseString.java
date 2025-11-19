package com.sum.techie;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(palin("aabcbaa"));  // olleh
    }

    public static String reverse(String a){
//        char [] ch = a.toCharArray();
//        int i = 0;
//        int j = ch.length-1;
//        while(i<j){
//            char t = ch[i];
//            ch[i] = ch[j];
//            ch[j] = ch[t];
//            i++;
//            j--;
//        }
//        return Arrays.toString(ch);
        char[] ch = a.toCharArray();

        int j = a.length()-1;
        char[] ch1 = new char[a.length()];
        for(int i = 0; i<a.length();i++){
            ch1[i] = ch[j];
            j--;

        }
        return new String(ch1);
    }

    public static boolean palin(String a){
       int i = 0, j=a.length()-1;
       while(i<j){
           if(a.charAt(i)!=a.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }
}
