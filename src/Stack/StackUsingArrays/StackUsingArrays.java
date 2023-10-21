package Stack.StackUsingArrays;

import java.util.Arrays;

public class StackUsingArrays {


    int[] arr;
    int size; int count = -1;

    StackUsingArrays(int size){
        arr = new int[size];
        this.size = size;
    }

    int length(){
        return size;
    }


    void push(int data){
        arr[++count] = data;
    }


    void display(){
        for (int i = 0; i <= count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    int pop(){
        int top = arr[count];
        arr[count--] = -1;
        return top;
    }

    int peek(){
        if (count == 0){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        return arr[count];
    }

    boolean isFull(){
        return count == size;
    }



    // TODO: Advance functions



    public static void main(String[] args) {


        StackUsingArrays list = new StackUsingArrays(10);


        list.push(4);
        list.push(5);
        list.push(1);

        list.display();
        System.out.println(list.pop());
        list.display();

        System.out.println(list.peek());

        System.out.println(list.isFull());

    }
}
