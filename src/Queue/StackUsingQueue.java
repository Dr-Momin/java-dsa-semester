package Queue;

import java.util.Queue;

public class StackUsingQueue {

    QueueUsingLinkedList q1;
    QueueUsingLinkedList q2;


    StackUsingQueue(){
        this.q1 = new QueueUsingLinkedList();
        this.q2 = new QueueUsingLinkedList();
    }

    void push(int data){
        q1.add(data);
    }

    int peek(){
        for (int i = 0; i < q1.size()-1; i++) {
            q1.add(q1.remove());
        }

        int val = q1.peek();
        q1.remove();
        return val;
    }

    int pop(){
        return -1;
    }

    public static void main(String[] args) {


        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());



    }

}
