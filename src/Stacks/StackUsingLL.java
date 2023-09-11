package Stacks;

public class StackUsingLL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{

        Node head;

        public void push(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public void pop(){
            if (isEmpty())
                return;


            head = head.next;
        }

        public int peek(){

            if (isEmpty())
                return -1;

            return head.data;

        }


        public boolean isEmpty(){
            return head == null;
        }

        public void display(){
            if (isEmpty())
                return;

            Node currNode = head;
            while (currNode != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {

        Stack stack = new Stack();

        System.out.println(stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();


        stack.pop();
        stack.display();
        System.out.println(stack.isEmpty());


        System.out.println(stack.peek());



    }
}
