package LinkedList.SinglyLinkedList;

public class PracticeLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static class LL{

        Node head, tail;
        int length;

        void insertAtEnd(int data){
            Node temp = new Node(data);

            if (head == null){
                head = tail = temp;
                length++;
                return;
            }
            tail.next = temp;
            tail = temp;
            length++;
        }

        void insertAtHead(int data){
            Node temp = new Node(data);

            if (head == null){
                head = temp;
                length++;
                return;
            }

            temp.next = head;
            head = temp;
            length++;

        }

        void insertAtIndex(int data, int index){
            Node temp = head;
            Node newNode = new Node(data);

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
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


    public static void main(String[] args) {

        LL ll = new LL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);

        ll.insertAtHead(70);
        ll.insertAtHead(80);


        ll.insertAtIndex(90, 2);
//
//        ll.display();
//        ll.getElement(2);
//
//        ll.deleteAt(3);
        
        
        ll.display();


    }
}
