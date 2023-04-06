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
                head = tail = temp;
                return;
            }
            tail.next = temp;
            tail = temp;

        }

        void insertAtHead(int data){
            Node temp = new Node(data);

            if (head == null){
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
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




    }

}
