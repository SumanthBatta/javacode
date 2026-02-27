package Strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str ="abcbcab";
        char[] chars = str.toCharArray();
        int max = 0;
        int tmp = 0;
        Set<Character> sets = new HashSet<>();
//        for(int i = 0; i<chars.length;i++){
//            if(sets.add(chars[i])){
//                tmp++;
//                max = Math.max(max,tmp);
//            }
//            else{
//                sets.clear();
//                sets.add(chars[i]);
//                tmp=1;
//            }
//        }
      int left = 0;
      for (int i = 0; i<chars.length;i++){
          while(sets.contains(chars[i])){
              sets.remove(chars[left]);
              left++;
              tmp--;
          }
          sets.add(chars[i]);
          tmp++;
          max = Math.max(max,tmp);
      }

        System.out.println(max);
    }
}
