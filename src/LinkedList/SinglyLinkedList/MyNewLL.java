package LinkedList.SinglyLinkedList;

public class MyNewLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static class LL{
        Node head, tail;

        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                return;
            }
            tail.next = temp;
            tail = temp;
        }



    }



    public static void main(String[] args) {


    }
}
