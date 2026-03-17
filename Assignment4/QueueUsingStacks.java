
package javaassignment4;

// LeetCode 232 - Implement Queue using Stacks
import java.util.*;

public class QueueUsingStacks {

    public static void main(String[] args){

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isEmpty())
            s2.push(s1.pop());

        System.out.println("Queue Front: " + s2.peek());
    }
}