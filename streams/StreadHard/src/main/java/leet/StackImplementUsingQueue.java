package leet;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementUsingQueue {

    private Queue<Integer> queue;

    public StackImplementUsingQueue() {
        queue = new LinkedList<>();

    }

    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size(); i++) {
            queue.add(queue.remove());
        }

    }

    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.remove();
    }

    public int top() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();

    }
    public static void main(String[] args) {
        StackImplementUsingQueue stack = new StackImplementUsingQueue();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // returns 2
        stack.pop();
        System.out.println(stack.pop());   // returns 1
        System.out.println(stack.top());
        System.out.println(stack.empty()); // returns false
    }
}

