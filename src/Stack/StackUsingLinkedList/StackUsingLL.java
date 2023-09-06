package Stack.StackUsingLinkedList;

public class StackUsingLL {


    public static class StackLL{

        Node head;
        int size;

        StackLL(){
            head = null;
            size = 0;
        }

        void push(int data){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;

            size++;
        }


        int peek(){
            if(head == null){
                System.out.println("Stack is Empty!!");
                return -1;
            }

            return head.data;

        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty!!");
                return -1;
            }

            int result = head.data;
            head = head.next;
            size--;

            return result;
        }


        boolean isEmpty(){
            return head == null;
        }

        int size(){
            return size;
        }

    }


    public static void main(String[] args) {


    }

}
