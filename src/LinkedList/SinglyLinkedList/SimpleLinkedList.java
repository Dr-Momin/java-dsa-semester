package LinkedList.SinglyLinkedList;

public class SimpleLinkedList {

    Node head, tail;
    public int length = 0;


    // TODO: Getter Setters
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }



    // TODO: SIMPLE NECESSARY FUNCTION
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public int getElement(int index) {
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public boolean isEmpty() {
        return head == null;
    }






    // TODO: Main Function
    public static void main(String[] args) {


    }
}
