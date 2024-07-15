package StackQueue;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class InBuiltExamples {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(23);
//        stack.push(-12);
//        stack.push(43);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue= new LinkedList<>(); //LinkedList used as a Queue
//        queue.add(3);
//        queue.add(6);
//        queue.add(17);
//        queue.add(-39);
//        queue.add(4);
//
//        System.out.println(queue.peek());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(8);
        deque.addLast(98);
        deque.remove();
        deque.addFirst(233);


    }
}
