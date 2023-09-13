package LinkedList.SinglyLinkedList;

public class AdvanceLinkedList extends BasicLinkedList{


    public void makeCircular() {
        if (isEmpty()) {
            System.out.println("List is Empty!!");
            return;
        }

        tail.next = head;

    }

    public boolean isCircularLL() {
        Node slow = head, fast = head;

        while (fast != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void displayCircular() {
        Node currNode = head;

        do {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        } while (currNode != head);

        System.out.println();
    }




    public static void main(String[] args) {

        AdvanceLinkedList list = new  AdvanceLinkedList();

        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.display();

    }
}
