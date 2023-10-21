package Queue;

import java.util.Stack;

public class QueueUsingLinkedList {


    Node front, rear; int size = 0;

    public void add(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            front = rear = newNode;
            size++;
            return;
        }

        rear.next = newNode;
        rear = newNode;
        size++;
    }

    public void addFromFront(int data){

        Node newNode = new Node(data);
        newNode.next = front;
        front = newNode;

        size++;
    }

    public int remove(){
        int data = front.data;
        front = front.next;
        size--;

        return data;
    }

    public int peek(){
        return front.data;
    }


    public boolean isEmpty(){
        return front == null && rear == null;
    }

    public void display(){
        Node temp = front;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int size(){
        return size;
    }


    public void reverseQueue(){
        Stack<Integer> stack = new Stack<>();
        Node temp = front;

        while (temp != null){
            stack.push(remove());
            temp = temp.next;
        }

        front = rear = null;

        while (!stack.isEmpty()){
            add(stack.pop());
        }


    }

    public void reverseNElements(int n){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(remove());
        }

        Stack<Integer> s2 = new Stack<>();

        while (!stack.isEmpty()){
            s2.push(stack.pop());
        }


        while (!s2.isEmpty()){
            addFromFront(s2.pop());
        }

    }

    public void reverseNElementsMethod02(int n){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(remove());
        }

        while (!stack.isEmpty()){
            add(stack.pop());
        }


        for (int i = 0; i < Math.abs(n-size()); i++) {
            add(remove());
        }
    }

    public static void main(String[] args) {

        QueueUsingLinkedList list = new QueueUsingLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        list.display();

        list.reverseNElementsMethod02(3);
        list.display();

        System.out.println(list.size());
    }
}
