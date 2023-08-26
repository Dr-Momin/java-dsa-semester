package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    static int[] insertAtIndex(int[] arr, int index, int data){

        int length = arr.length;
        int[] newArr = new int[length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
            newArr[index] = data;
        }


        for (int i = index+1; i <= length; i++) {
            newArr[i] = arr[i-1];
        }

        return newArr;
    }



    public static void main(String[] args) {

        System.out.println("Enter Size of the Array: ");
        Scanner sc = new Scanner(System.in);
        int arrayIdx = sc.nextInt();

        int[] arr = new int[arrayIdx];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Insert at array index: " + i + ":  ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        int[] returnedArr = insertAtIndex(arr, 3, 10);


        System.out.println(Arrays.toString(returnedArr));


    }
}
