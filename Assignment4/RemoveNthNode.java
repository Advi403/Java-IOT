
package javaassignment4;

// LeetCode 19 - Remove Nth Node From End
class Node{
    int data;
    Node next;

    Node(int d){
        data = d;
    }
}

public class RemoveNthNode {

    static Node remove(Node head, int n){

        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        for(int i=0;i<=n;i++)
            fast = fast.next;

        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }

    static void print(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args){

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = remove(head,2);

        print(head);
    }
}