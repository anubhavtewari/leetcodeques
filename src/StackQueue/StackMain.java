package StackQueue;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);
        stack.push(10);
        stack.push(23);
        stack.push(-12);
        stack.push(43);
        stack.push(-143);
        stack.push(25);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//       System.out.println(stack.pop());
    }
}
