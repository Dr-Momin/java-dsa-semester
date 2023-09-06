package Practice;

// TODO: Functions
// insertAtEnd(data)
// insertAtEndWithoutTail()
// insertAtHead(data)
// insertAtIndex(index, data)
// deleteAtIndex(index);
// deleteAtEnd()
// deleteAtHead()
// length()
// display()
// displayReverse()
// displayReverseRecursively()
// displayRecursively()
// getElement(index)




public class LinkedList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static class LL{

        Node head, tail;


        public void insertAtEnd(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;

        }

        public void insertAtEndWithoutTail(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }

            currNode.next = newNode;
            currNode = newNode;

        }


        public void insertAtHead(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        public void insertAtIndex(int index, int data){
            Node newNode = new Node(data);
            Node currNode = head;

            for (int i = 0; i < index-1; i++) {
                currNode = currNode.next;
            }

            newNode.next = currNode.next;
            currNode.next = newNode;

        }


        public void deleteAtIndex(int index){
            Node currNode = head;

            for (int i = 0; i < index-1; i++) {
                currNode = currNode.next;
            }

            currNode.next = currNode.next.next;

        }


        public void deleteAtEnd(){
            Node currNode = head;

            while(currNode.next.next != null){
                currNode = currNode.next;
            }

            tail = currNode.next;
            currNode.next = currNode.next.next;

        }


        public void deleteAtHead(){
            if(head == null){
                System.out.println("List is Empty");
                return;
            }

            head = head.next;
        }


        public int length(){
            int length = 0;
            Node currNode = head;

            while(currNode != null){
                length++;
                currNode = currNode.next;
            }

            return length;
        }


        public void display(){
            Node currNode = head;

            while (currNode != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }


        public void reverseLinkedList(){
            Node prev, curr, next;
            prev = head;
            curr = head.next;
            next = head.next.next;

            while (curr != null){
                next = curr.next;

                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head.next = null;
            head = prev;
        }


        public void displayReverseRecursively(Node node){

            if(node.next != null){
                displayReverseRecursively(node.next);
            }
            System.out.print(node.data + " ");

        }


        public void makeCircular(){
            Node currNode = head;

            while(currNode.next != null){
                currNode = currNode.next;
            }

            currNode.next = head;
        }

        public void displayCircularList(){
            Node currNode = head;

            do{
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }while (currNode != head);

        }



    }


    public static void main(String[] args) {


        LL list = new LL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

//        list.display();
//        list.reverseLinkedList();
//
//        list.display();

//        list.displayReverseRecursively(list.head);

        list.makeCircular();
        list.displayCircularList();

    }
}
