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

        public void insertAtBeginning(int data){
            Node newNode = new Node(data);

            if (head == null){
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        public void insertAtEnd(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public void insertAtEndWithoutTail(int data){
            Node newNode = new Node(data);

            if(isEmpty()){
                head = tail = newNode;
                return;
            }

            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }

            currNode.next = newNode;
            tail = newNode;
        }


        public void makeCircular(){
            if (isEmpty()){
                System.out.println("List is Empty!!");
                return;
            }

            tail.next = head;

        }

        public boolean isCircularLL(){
            Node slow = head, fast = head;


            while (fast != null){
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast){
                    return true;
                }
            }

            return false;
        }


        public boolean isEmpty(){
            return head == null;
        }

        public int length(){
            Node currNode = head;
            int count = 0;

            while(currNode != null){
                count++;
                currNode = currNode.next;
            }
            return count;
        }

        public void display(){
            Node currNode = head;

            while (currNode != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }


        public void displayCircular(){
            Node currNode = head;

            do{
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }while (currNode != head);

            System.out.println();
        }



    }



    public static void main(String[] args) {


        LL list = new LL();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.display();


        list.insertAtBeginning(90);
        list.display();


        list.makeCircular();
        list.displayCircular();
//        list.display();

//        System.out.println(list.isCircularLL());


    }
}
