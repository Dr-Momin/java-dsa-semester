package LinkedList.CircularLinkedList;

public class MyCLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }


    public static class CLL{

        Node head, tail;


        public void insertAtEnd(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }


            tail.next = newNode;
            tail = newNode;
            newNode.next = head;


        }

        public void insertAtHead(int data){

        }


        public void deleteHeadWithoutTail(){
            Node currNode = head;


        }

        public void display(){
            Node currNode = head;
            do{
                System.out.print(currNode.data + " ");
                currNode = currNode.next;

            }while (currNode != head);

        }

    }


    public static void main(String[] args) {


        CLL list = new CLL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        list.display();


    }
}
