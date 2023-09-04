package LinkedList.SinglyLinkedList.questions;
import LinkedList.SinglyLinkedList.MyLL;


// Q1: Find nth node from the end of the list?
// Note: Only head is given,  no tail and length is given.


public class Q1 {

    public static void findNthNodeFromEndOfLinkedList(MyLL.Node head, int indexFromEnd){
        MyLL.Node currNode = head;
        int length = 0;

        while (currNode != null){
            length++;
            currNode = currNode.next;
        }

        int m = length;
        int t = m- indexFromEnd;
        currNode = head;

        for (int i = 0; i < t; i++) {
            currNode = currNode.next;
        }

        System.out.println(currNode.data);

    }

    public static void main(String[] args) {

        MyLL.LL list = new MyLL.LL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);


        // Q1: Find nth node from the end of the list?
        // Note: Only head is given,  no tail and length is given.
        findNthNodeFromEndOfLinkedList(list.getHead(), 4);


    }
}
