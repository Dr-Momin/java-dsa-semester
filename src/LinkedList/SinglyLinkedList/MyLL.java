package LinkedList.SinglyLinkedList;

import LinkedList.SinglyLinkedList.questions.ReverseLL;

public class MyLL {


    public static class Node{
        public int data;
        public Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class LL{

        Node head, tail;
        private int length = 0;


        // Getter Setters
        public Node getHead() {
            return head;
        }

        public Node getTail() {
            return tail;
        }

        public int getLength() {
            return length;
        }


        // Methods
        public void insertAtEnd(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                length++;
                return;
            }
            tail.next = newNode;  // to link to next node
            tail = newNode;   // to move pointer one step forward
            length++;
        }

        public void insertAtEndWithoutTail(int data){
            Node current = head;
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                length++;
                return;
            }

            while(current.next != null){
                current = current.next;
            }

            current.next = newNode;
            current = newNode;
            length++;

        }


        public void insertAtHead(int data){
            Node newNode = new Node(data);

            if (head == null){
                head = newNode;
                length++;
                return;
            }

            newNode.next = head;
            head = newNode;
            length++;
        }


        public void insertAtIndex(int index, int data){
            Node newNode = new Node(data);
            Node current = head;

            if(index < 0 || index > length){
                System.out.println("Invalid Index!!!");
                return;
            }

            if(index == 0){
                insertAtHead(data);
                return;
            }

            if(index == length){
                insertAtEnd(data);
                return;
            }

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;

        }


        public void deleteAtHead(){
            head = head.next;
        }

        public void deleteAtEnd(){
            Node current = head;

//            // Method 01: When you knows the length
//            for (int i = 0; i < length-2; i++) {
//                current = current.next;
//            }
//
//            current.next = current.next.next;

            // Method 02: When you don't know the length
            while(current.next.next != null){
                current = current.next;
            }

            current.next = current.next.next;

        }


        public void deleteAtIndex(int index){
            Node current = head;

            if(index < 0 || index > length){
                System.out.println("Invalid Index!!");
                return;
            }

            for (int i = 0; i < index-1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }


        public void display(){
            Node current = head;
            System.out.println();
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }


        public int getElement(int index){
            Node current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            return current.data;
        }

    }



    public static void main(String[] args) {


        LL list = new LL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);

        list.insertAtHead(15);

        list.display();

        System.out.println("\n");
        list.getElement(2);

    }

}
