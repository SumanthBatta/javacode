package leet;

import java.util.*;

public class BaseBallGame {
    public static void main(String[] args) {
        List<String> ops = Arrays.asList("5","2","C","D","+");

        Deque<Integer> res = new ArrayDeque<>();

        for (String op : ops) {
            switch (op) {
                case "C":
                    res.pop();
                    break;

                case "D":
                    res.push(res.peek() * 2);
                    break;

                case "+":
                    int first = res.pop();
                    int second = res.peek();
                    res.push(first);
                    res.push(first + second);
                    break;

                default:
                    res.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : res) {
            sum += score;
        }

        System.out.println(sum);
    }
}