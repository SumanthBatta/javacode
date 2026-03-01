package leet;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinStackImplementation {

    // Stack<Integer> stack;
    // Stack<Integer> minStack;

    Deque<Integer> stack;
    Deque<Integer> minStack;

    public MinStackImplementation() {
        // stack = new Stack(); minStack = new Stack();
        stack  = new ArrayDeque();
        minStack = new ArrayDeque();

    }

    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }

    }

    public void pop() {
        int popped = stack.pop();
        if(popped==minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return  minStack.peek();

    }
    public static void main(String[] args) {

        MinStackImplementation minStack = new MinStackImplementation();

        System.out.println("Pushing: 5");
        minStack.push(5);
        System.out.println("Current Min: " + minStack.getMin()); // 5

        System.out.println("Pushing: 3");
        minStack.push(3);
        System.out.println("Current Min: " + minStack.getMin()); // 3

        System.out.println("Pushing: 7");
        minStack.push(7);
        System.out.println("Current Min: " + minStack.getMin()); // 3

        System.out.println("Pushing: 3");
        minStack.push(3);
        System.out.println("Current Min: " + minStack.getMin()); // 3

        System.out.println("Top: " + minStack.top()); // 3

        System.out.println("Pop");
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // 3

        System.out.println("Pop");
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // 3

        System.out.println("Pop");
        minStack.pop();
        System.out.println("Current Min: " + minStack.getMin()); // 5

        System.out.println("Top: " + minStack.top()); // 5
    }
}
