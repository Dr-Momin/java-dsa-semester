package LinkedList.DoublyLinkedList;

public class MyDLL {

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }


    static class DLL{
        Node head, tail;


        void insertAtHead(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head.prev = newNode;
            head = newNode;

        }

        void insertAtEnd(int data){
            Node newNode = new Node(data);

            if (head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;


        }


        void insertAtIndex(int index, int data){
            Node newNode = new Node(data);
            Node currNode = head;

            for (int i = 0; i < index-1; i++) {
                currNode = currNode.next;
            }


            newNode.next = currNode.next;
            currNode.next.prev = newNode;

            currNode.next = newNode;
            newNode.prev = currNode;



        }



        void deleteHead(){
            head = head.next;
            head.prev = null;
        }

        void deleteTail(){
            Node temp = tail.prev;
            temp.next = null;
            tail = temp;
        }

        void deleteAtIndex(int index){
            Node currNode = head;
            for (int i = 0; i < index-1; i++) {
                currNode = currNode.next;
            }

            currNode.next.next.prev = currNode;
            currNode.next = currNode.next.next;


        }


        void display(){
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }

        void displayReverse(){
            Node currNode = tail;
            while(currNode != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.prev;
            }

            System.out.println();
        }

        void displayInDetail(){
            Node current = head;
            while(current != null){
                System.out.print(current.prev + " " + current.data + " " + current.next  + " ---> \n");
                current = current.next;
            }
            System.out.println();
        }



    }



    public static void main(String[] args) {



        DLL list = new DLL();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);


        list.display();


        list.insertAtHead(90);
        list.display();



        list.insertAtIndex(3, 80);
        list.display();
        list.displayReverse();

        list.deleteHead();
        list.display();

        list.deleteTail();
        list.display();
        list.displayReverse();

        list.deleteAtIndex(2);
        list.display();
        list.displayReverse();

    }
}
