package LinkedList.SinglyLinkedList;

public class nthNodeFromEnd {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static class LL{
        Node head, tail;
        int length = 0;

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

        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }


        int getNodeFromEnd(int index){
            Node temp = head;
            // (m-n+1)
            int m = length;
            int n = index;
            int idx = m-n+1;

            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        int getNodeFromEndInOneIteration(int index){

            Node slow = head, fast = head;
            for (int i = 0; i < index; i++) {
                fast = fast.next;
            }
            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }

            return slow.data;
        }

        void deleteNodeFromEndInOneIteration(int index){
            Node slow = head, fast = head;
            for (int i = 0; i < index; i++) {
                fast = fast.next;
            }

            if (fast == null){
                head = head.next;
            }
            else{
                while(fast.next != null){
                    slow = slow.next;
                    fast = fast.next;
                }
            }

            slow.next = slow.next.next;

            display();
        }

    }




    public static void main(String[] args) {

        // m =  total number of nodes
        // nth from last = (m-n+1) node from start

        LL ll = new LL();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);
        ll.insertAtEnd(60);

        ll.display();


        System.out.println(ll.getNodeFromEnd(3));

        System.out.println(ll.getNodeFromEndInOneIteration(2));

        ll.deleteNodeFromEndInOneIteration(6);

    }


}
