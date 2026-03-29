package numbers;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatingChar {
    public static void main(String[] args) {
        String s = "programming";
        char[] arr = s.toCharArray();
        Map<Character, Integer> con = new HashMap<>();
        for (char c : arr) {
            con.put(c, con.getOrDefault(c, 0) + 1);
        }
        System.out.println(con);
        for (char ch : s.toCharArray()) {
            if (con.get(ch) > 1) {
                System.out.println(ch);
                break;
            }
        }

    }
}
