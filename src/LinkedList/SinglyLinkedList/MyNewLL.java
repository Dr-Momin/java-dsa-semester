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

        Node head = null;
        Node tail = null;


        void insertAtEnd(int data){
            Node temp = new Node(data);
            if (head == null){
                head = tail = temp;
                return;
            }
            tail.next = temp;
            tail = temp;

        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }



    public static void main(String[] args) {

        LL l = new LL();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);

        l.display();

    }
}
