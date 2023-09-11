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



        void display(){
            Node current = head;
            System.out.println();
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }


        void reverseLL(){
            Node prev, curr, next;

            prev = head;
            curr = head.next;


            while(curr != null){

                next = curr.next;
                curr.next = prev;

                prev = curr;
                curr = next;

            }

            head.next = null;
            head = prev;


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


        System.out.println();
        list.reverseLL();
        list.display();




    }
}
