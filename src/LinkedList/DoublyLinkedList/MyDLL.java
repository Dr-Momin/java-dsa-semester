package LinkedList.DoublyLinkedList;

public class MyDLL {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    static class DoublyLL{
        Node head, tail, prev;

        void insertAtEnd(int data){
            Node temp = new Node(data);

            if (head == null){
                head = tail = prev = temp;
                return;
            }

            tail.next = temp;
            temp.prev = tail;
            tail = temp;

        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayRev(){
            Node temp = tail;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {

        DoublyLL ll = new DoublyLL();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);

        ll.display();
        ll.displayRev();

    }
}
