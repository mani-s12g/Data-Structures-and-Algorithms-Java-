package Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) throws StackException {
        // Custom built stacks
//        CustomStack stack = new CustomStack(5);
        DynamicStack stack = new DynamicStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(89);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
