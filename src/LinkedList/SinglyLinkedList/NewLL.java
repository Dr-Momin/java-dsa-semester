package LinkedList.SinglyLinkedList;

public class NewLL {

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
            }
            else{
                tail.next = temp;
            }

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
        
        void insertAt(int index, int data){
            Node temp = head;
            Node newNode = new Node(data);

            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }

        void deleteAt(int index){

        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void getElement(int index){
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }


    }

    public static void main(String[] args) {

        LL ll = new LL();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);

        ll.insertAtHead(15);

        ll.insertAt(1, 32);

        ll.display();

        System.out.println("\n");
        ll.getElement(2);

    }
}
