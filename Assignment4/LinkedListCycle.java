
package javaassignment4;

// LeetCode 141 - Linked List Cycle
class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
    }
}

public class LinkedListCycle {

    static boolean hasCycle(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args){

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;
        c.next = a;   // cycle created

        System.out.println(hasCycle(a));
    }
}