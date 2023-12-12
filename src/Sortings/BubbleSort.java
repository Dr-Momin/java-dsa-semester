package Sortings;

import java.util.Arrays;

public class BubbleSort {

  static int[] bubbleSort(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length-i-1; j++) {
        if (arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    return arr;
  }


  // selection sort algorithm
  static int[] selectionSort(int[] arr){
    for (int i = 0; i < arr.length-1; i++) {
      int min = i;
      for (int j = i+1; j < arr.length; j++) {
        if (arr[j] < arr[min]){
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;
    }

    return arr;
  }



  public static void main(String[] args) {

    int[] arr = {2, 4, 1, 5, 3, 7};

    int[] result = selectionSort(arr);
    System.out.println(Arrays.toString(result));

  }
}


class insertionSort{


    public static void main(String[] args) {
      int[] arr = {2, 4, 1, 5, 3, 7};

      for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i-1;

        while (j >= 0 && arr[j] > key){
          arr[j+1] = arr[j];
          j--;
        }
        arr[j+1] = key;
      }

      System.out.println(Arrays.toString(arr));
    }
}


class SelectionSort{

    public static void main(String[] args) {
      int[] arr = {2, 4, 1, 5, 3, 7};

      for (int i = 0; i < arr.length-1; i++) {
        int min = i;
        for (int j = i+1; j < arr.length; j++) {
          if (arr[j] < arr[min]){
            min = j;
          }
        }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
      }

      System.out.println(Arrays.toString(arr));
    }
}