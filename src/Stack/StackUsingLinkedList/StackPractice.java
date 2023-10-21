package Stack.StackUsingLinkedList;

public class StackPractice {


    // TODO: BASIC Functions
    Node top; int size;

    void push(int data){
        Node newNode = new Node(data);

        if (isEmpty()){
            top = newNode;
            size++;
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }

    int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        size--;
        return top.data;
    }

    int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }

        int data = top.data;
        top = top.next;
        size--;

        return data;
    }



    // TODO: SIMPLE Functions
    void display(){
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    int length(){
        return size;
    }
    boolean isEmpty(){
        return top == null;
    }



    // TODO: Advance Functions



    public static void main(String[] args) {

        StackPractice stack01 = new StackPractice();
        stack01.push(10);
        stack01.push(20);
        stack01.push(30);

        stack01.display();

        System.out.println(stack01.length());



    }
}
