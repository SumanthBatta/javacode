package com.sum.techie;

public class RemoveDuplicateChars {



    public static String removeDuplicates(String s) {
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
