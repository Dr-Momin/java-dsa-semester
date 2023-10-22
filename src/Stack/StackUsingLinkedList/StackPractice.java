package Stack.StackUsingLinkedList;

import java.util.Stack;

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
    static void copyStackIntoAnotherStackInSameOrder(StackPractice s1, StackPractice s2){

        StackPractice s3 = new StackPractice();

        while (s1.length() > 0){
            s3.push(s1.pop());
        }

        while (s3.length() > 0){
            s2.push(s3.pop());
        }

    }

    void pushAtBottom(int data){
        Node newNode = new Node(data);
        StackPractice st = new StackPractice();

        // Pop until the last element
        while (length() > 0){
            st.push(pop());
        }

        // pushing at Bottom
        push(data);

        // copying back the stack
        while (st.length() > 0){
            push(st.pop());
        }
    }


    void popFromBottom(){
        StackPractice helper = new StackPractice();

        // pop until last element
        while (length() > 1){
            helper.push(pop());
        }

        // deleting the last element
        pop();

        // copying back the stack
        while (helper.length() > 0){
            push(helper.pop());
        }

    }


    static void balancedBrackets(String word){
        char c; Stack<Character> st = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            if (c == '(' || c == '['){
                st.push(c);
            }
        }

        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);

            if ((c == ')' && st.peek() == '(') || (c == ']' && st.peek() == '[') ){
                st.pop();
            }
        }

        if (st.isEmpty()){
            System.out.println("Balanced....");
        }else {
            System.out.println("Not Balanced....");
        }
    }


    public static void main(String[] args) {

        StackPractice stack01 = new StackPractice();
        StackPractice stack02 = new StackPractice();

        stack01.push(10);
        stack01.push(20);
        stack01.push(30);
        stack01.push(40);
//        stack01.display();


//        copyStackIntoAnotherStackInSameOrder(stack01, stack02);
//        stack02.display();

//        stack01.pushAtBottom(90);
//        stack01.display();
//
//        stack01.popFromBottom();
//        stack01.display();


        String str = "(3+4)";
        String str2 = "[2+(3+4)+(2+1)]";
        String str3 = "[2+(3+4)+(2+1)]";
        String str4 = "[()]";
        String str5 = "([)]";

        balancedBrackets(str);


    }
}
