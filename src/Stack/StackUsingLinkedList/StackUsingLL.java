package Stack.StackUsingLinkedList;

import Practice.StackUsingLinkedList;

import java.util.Stack;

public class StackUsingLL {


    Node top; int size;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }


    void display(){
        Node temp = top;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayR(Node temp){
        if (temp == null){
            return;
        }

        System.out.print(temp.data + " ");
        displayR(temp.next);
    }

    void displayRecursive(){
        displayR(top);
        System.out.println();
    }

    int peek(){
        return top.data;
    }

    int pop(){
       int data = top.data;
       top.next = top.next.next;
       return data;
    }

    boolean isEmpty(){
        return top == null;
    }





    // TODO: Advance functions
    static boolean balancedBrackets(String str){

        Stack<Character> stack = new Stack<>();
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);

            if (c == '[' || c == '('){
                stack.push(c);
            }else {

                if (stack.isEmpty()) return false;

                if ((stack.peek() == '['  && c == ']') || (stack.peek() == '('  && c == ')'))
                    stack.pop();

            }

        }

        return stack.isEmpty();
    }




    public static void main(String[] args) {


        String str = "(3+4)";
        String str2 = "[2+(3+4)+(2+1)]";
        String str3 = "[2+(3+4)+(2+1)]";
        String str4 = "[()]";
        String str5 = "([)]";

        System.out.println(StackUsingLL.balancedBrackets(str5));


    }

}
