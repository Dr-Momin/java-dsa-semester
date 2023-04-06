package LinkedList;

public class MyLL {

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    static class LL{
        Node head;
        Node tail;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if (head == null){
                head = tail = temp;
                return;
            }
            tail.next = temp;
            tail = temp;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

    }


    public static void main(String[] args) {


        LL ll = new LL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);

        ll.insertAtHead(100);

        ll.display();




    }

}
