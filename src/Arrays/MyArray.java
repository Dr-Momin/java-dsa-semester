package Arrays;

import java.util.Arrays;

public class MyArray {

    int[] arr;

    MyArray(int size){
        arr = new int[size];
    }


    public void insert(int index, int data){
        if(index < arr.length){
            arr[index] = data;
        }
        else{
            System.out.println("Invalid Index");
        }
    }

    public int search(int data){
        int index;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]  == data){
                return i;
            }
        }

        return -1;
    }


    public void sort() {
//        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }

}
