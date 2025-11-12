package com.sum.techie;

import java.util.HashSet;
import java.util.Set;

public class PanaGramSet {
    public static void main(String[] args) {
        String sentence = "Pack my box with five dozen liquor jugs";
        System.out.println(isPangram(sentence) ? "Pangram" : "Not Pangram");
    }
    static boolean isPangram(String a){
        Set<Character> chars = new HashSet<>();
        a = a.toLowerCase();

        for(char b : a.toCharArray()){
            if(Character.isLetter(b)){
                chars.add(b);
            }
        }
        return (chars.size())==26?true:false;
    }
}
