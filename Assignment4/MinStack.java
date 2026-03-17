
package javaassignment4;

// LeetCode 155 - Min Stack
import java.util.*;

public class MinStack {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(3);
        stack.push(7);

        System.out.println("Top: " + stack.peek());
        System.out.println("Min: " + Collections.min(stack));
    }
}