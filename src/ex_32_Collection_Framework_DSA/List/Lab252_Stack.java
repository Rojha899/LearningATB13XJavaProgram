package ex_32_Collection_Framework_DSA.List;

import java.util.Stack;

public class Lab252_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("python");
        s1.add("c#");
        s1.add("Java");



        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1);

        // Create Integer type stack
        Stack<Integer> intStack = new Stack<>();

        // Create String type stack
        Stack<String> stringStack = new Stack<>();


        intStack.push(23);
        intStack.push(43);
        intStack.push(53);
        System.out.println(intStack);
    }
}
