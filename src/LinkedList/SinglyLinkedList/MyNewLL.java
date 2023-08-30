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
        int length;

        void insertAtEnd(int data){
            Node temp = new Node(data);

            if(head == null){
                head = tail = temp;
                length++;
                return;
            }

            tail.next = temp;
            tail = temp;
            length++;
        }

        void deleteAtHead(){
            Node temp = head;
            head = head.next;

        }

        void deleteAtIndex(int index){
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }

            if(index == 0){
                deleteAtHead();
            }

            else if(index == length-1){
                tail = temp;
            }

            temp.next = temp.next.next;
            length--;


        }

        void insertAtEndWithoutTail(int data){
            Node temp = head;
            Node newNode = new Node(data);

            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
            temp = newNode;

            length++;

        }

        void insertAtHead(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
                length++;
                return;
            }

            temp.next = head;
            head = temp;
            length++;
        }

        void insertAtIndex(int index, int data){

            if(index == 0){
                insertAtHead(data);
                return;
            }

            else if (index == length){
                insertAtEnd(data);
                return;
            }

            else if (index < 0 || index > length){
                System.out.println("Invalid Index");
                return;
            }

            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
        }

        void display(){
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }


        int length(){
            int count = 0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        void displayRecursively(){
            printRecursively(head);
        }

        void printRecursively(Node head){
            if(head == null) return;
            System.out.print(head.data + " ");
            printRecursively(head.next);
        }

        int getElement(int index){

            if(index < 0 || index > length){
                System.out.println("Invalid Index");
            }

            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            return temp.data;
        }

    }

    public static void main(String[] args) {


        LL l = new LL();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);

        l.insertAtHead(5);

//        l.insertAtIndex(2, 90);

        l.insertAtEndWithoutTail(70);



        l.display();

        System.out.println();
        l.deleteAtIndex(0);

        l.display();

    }
}
