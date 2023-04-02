package LinkedList;

public class LinkedList {

    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    static class LL{
        Node head = null, tail = null;
        int length;

        void insertAtEnd(int val){
            Node temp = new Node(val);

            if (head == null){
                head = tail =  temp;
                return;
            }

            tail.next = temp;
            tail = temp;

            length++;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);

            if (head == null){
                head = temp;
                return;
            }

            temp.next = head;
            head = temp;

            length++;
        }

        void insertAt(int index, int val){
            Node newNode = new Node(val);
            Node temp = head;

            if (index == 0){
                insertAtEnd(val);
                return;
            }
            else if (index > length){
                System.out.println("Wrong input");
                return;
            }

            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;




            length++;
        }

        void deleteAt(int index){
            Node temp = head;

            if (index == 0){
                head = head.next;
                return;
            }
            else if (index == length){
                tail = temp;
            }

            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }



        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val + " ");
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

        ll.insertAtHead(100);

        ll.insertAt(1, 40);

        ll.display();

        ll.deleteAt(1);
        ll.display();

    }
}
