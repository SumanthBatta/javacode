package leet;

import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
       List<Character> open = Arrays.asList('(','{','[');
       List<Character> closed =Arrays.asList(')','}',']');
        String s = "([])";
        char[] arr = s.toCharArray();
        Stack<Character> helper = new Stack<>();
        for(int i = 0; i<arr.length;i++){
            if(open.contains(arr[i])){
                helper.push(arr[i]);
            }

            else{
                if(!helper.peek().equals(open.get(closed.indexOf(arr[i])))){
                    System.out.println("not");
                    return;
                }
                helper.pop();
            }
        }
        System.out.println("yes");
    }

    public static boolean isValid(String s) {
        // Mapping of closing -> opening brackets
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {

            // If opening bracket, push
            if (map.containsValue(c)) {
                stack.push(c);
            }
            // If closing bracket
            else if (map.containsKey(c)) {

                if (stack.isEmpty() || stack.pop() != map.get(c)) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
}
