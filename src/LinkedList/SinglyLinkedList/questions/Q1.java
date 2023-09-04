package LinkedList.SinglyLinkedList.questions;


// Q1: Find nth node from the end of the linked list...

import LinkedList.SinglyLinkedList.MyLL;

public class Q1 {



    public static void main(String[] args) {


        MyLL.LL list = new MyLL.LL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();

    }
}
