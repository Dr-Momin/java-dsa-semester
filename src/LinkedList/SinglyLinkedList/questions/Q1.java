package LinkedList.SinglyLinkedList.questions;

// Q1: Find nth node from the end of the list?
// Note: Only head is given,  no tail and length is given.


import LinkedList.SinglyLinkedList.Node;

public class Q1 {

    public static void deleteAtEnd(Node head){
        Node current = head;

        // Method 02: When you don't know the length
        while(current.next.next != null){
            current = current.next;
        }

        current.next = current.next.next;

    }

    public static void findNthNodeFromEndOfLinkedList(Node head, int indexFromEnd){
        Node currNode = head;
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

    public static void findNthNodeFromEndInOneTraversal(Node head, int indexFromEnd){
        Node slow = head, fast = head;

        for (int i = 0; i < indexFromEnd; i++) {
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println(slow.data);
    }


    public static void removeNthNodeFromEnd(Node head, int indexFromEnd){
        Node slow = head;
        Node fast = head;

        if(indexFromEnd == 1){
            deleteAtEnd(head);
            return;
        }

        for (int i = 0; i < indexFromEnd; i++) {
            fast = fast.next;
        }

        while (fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.data = slow.next.data;
        slow.next = slow.next.next;

    }

    public static void main(String[] args) {

//        MyLL.LL list = new MyLL.LL();
//        list.insertAtEnd(10);
//        list.insertAtEnd(20);
//        list.insertAtEnd(30);
//        list.insertAtEnd(40);
//        list.insertAtEnd(50);
//
//        // Getting head
//        Node head = list.getHead();
//
//
//        // Q1: Find nth node from the end of the list?
//        // Note: Only head is given,  no tail and length is given.
//        findNthNodeFromEndOfLinkedList(head, 4);
//
//
//
//        // 2. Find nth node from the end of list. (Note: Only in One traversal).
//        findNthNodeFromEndInOneTraversal(head, 5);
//
//
//        // 3. Remove nth node from the end of the linked list. (Note: in one Traversal)
//        removeNthNodeFromEnd(head, 5);
//        list.display();
//
//




    }
}
