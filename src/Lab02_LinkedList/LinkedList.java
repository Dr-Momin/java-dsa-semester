package Lab02_LinkedList;

public class LinkedList {

    Node head, tail;


    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if (isEmpty(false)){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }


    void insertAtEnd(int data){
        Node newNode = new Node(data);

        if (isEmpty(false)){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }


    void insertAtEndWithoutTail(int data){
        Node newNode = new Node(data);

        if (isEmpty(false)){
            head = tail = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
    }



    void insertAfter(int node, int data){
        Node temp = head;

        while (temp.data != node){
            temp = temp.next;
        }

        Node newNode = new Node(data);

        newNode.next = temp.next;
        temp.next = newNode;

    }

    void insertBefore(int node, int data){
        Node temp = head;

        while (temp.next.data != node){
            temp = temp.next;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }



    void makeCircular(){
        if (isEmpty(true)) return;

        tail.next = head;
    }

    boolean isCircular(){
        Node slow = head ,fast = head;

        while (fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;
    }





    // TODO: Simple Necessary Functions
    boolean isEmpty(boolean throwError){
        if (throwError && head == null){
            System.out.println("List is Empty");
            return true;
        }

        return head == null;
    }

    void printAll(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int length(){
        Node temp = head; int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }

        return size;
    }







    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        list.printAll();


        list.insertAfter(40, 90);
        list.printAll();


        list.insertBefore(30, 70);
        list.printAll();


        list.makeCircular();
        System.out.println(list.isCircular());

    }

}
