package LinkedList.SinglyLinkedList.questions;


public class ReverseLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static class LL{

        Node head, tail;
        private int length = 0;

        void insertAtEnd(int data){
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

        void insertAtEndWithoutTail(int data){
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


        void insertAtHead(int data){
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


        void insertAtIndex(int index, int data){
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


        void deleteAtHead(){
            head = head.next;
        }

        void deleteAtEnd(){
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


        void deleteAtIndex(int index){
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


        void display(){
            Node current = head;
            System.out.println();
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }


        int getElement(int index){
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
        list.insertAtEnd(30);
        list.insertAtEnd(40);


        list.display();

//        list.insertAtIndex(2, 90);
//        list.display();


//        list.deleteAtEnd();
//        System.out.println("\nLength: " + list.length);
//        list.display();

//        list.deleteAtIndex(3);
//        list.display();


        System.out.println(list.getElement(3));


    }
}
