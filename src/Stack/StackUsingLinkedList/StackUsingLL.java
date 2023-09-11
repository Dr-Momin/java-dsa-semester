package Stack.StackUsingLinkedList;

public class StackUsingLL {


    public static class StackLL{
        Node head;
        int size;

        public void push(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            head.next = newNode;
            head = newNode;

        }


        public int pop(){
            if (head == null){
                System.out.println("List is Empty");
                return -1;
            }

            int data = head.data;
            head = head.next;

            return data;
        }


        public int peek(){
            if(head == null){
                System.out.println("Stack is Empty!!");
                return -1;
            }

            return head.data;

        }


        public boolean isEmpty(){
            return head == null;
        }

        public int size(){
            return size;
        }

    }


    public static void main(String[] args) {


    }

}
