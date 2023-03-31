package LinkedList;

public class MyLL {

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
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;

        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {

        LL ll = new LL();
        ll.insertAtEnd(5);
        ll.insertAtEnd(10);
        ll.insertAtEnd(15);
        ll.insertAtEnd(12);

        ll.display();


    }

}
