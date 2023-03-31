package LinkedList;

public class BasicsLL {

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



        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
            }
            else{
                tail.next = temp; // for pointing to the previous node
            }

            tail = temp; // for moving forward the tail as list grows

        }

        void insertAtHead(int val){
             Node temp = new Node(val);

             if (head == null){
                 head = temp;
             }
             else{
                 temp.next = head;
                 head = temp;
             }

        }

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

            System.out.println();
        }

    }

    public static void main(String[] args)  {

        LL ll = new LL();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);

        ll.display();

        ll.insertAtHead(12);
        ll.display();

        ll.insertAtHead(7 );
        ll.display();

    }



}
