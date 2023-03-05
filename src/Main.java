import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
//        task_01();


        // Q2. Convert the list of Strings {"ab", "bc", "cd", "de", "ef", "fg", "gh"} into an array of strings and print allstrings stored on odd indices of the array
//        task_02();


        // Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.
//        task_03();


        // Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element
//        task_04();


        // Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor. Leftmost and rightmost element cannot be a peak element.

        task_05();


    }

    static void task_01(){
        // Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
        int[] arr = {2, 6, -5, -1, 0, 4, -9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >  0)
                System.out.println(arr[i]);
        }


    }

    static void task_02(){
        // Q2. Convert the list of Strings {"ab", "bc", "cd", "de", "ef", "fg", "gh"} into an array of strings and print all strings stored on odd indices of the array
        String[] arr = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 != 0 ){
                System.out.println(arr[i]);
            }
        }
    }

    static void task_03(){
        // Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.
        int[] arr = {1,2,3,4,5,6,7,8};
        for (int item: arr) {
            if (item % 2 == 0)
                System.out.println(item);
        }

    }

    static void task_04(){
        // Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element
        int[] arr = {2, -3, 5, 8, 1, 0, -4};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);


    }

    static void task_05(){
        // Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0} Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor. Leftmost and rightmost element cannot be a peak element.

        int[] arr = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        int num = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]  && arr[i] > arr[i+1]){
                num = arr[i];
            }
        }

        System.out.println(num);

    }
}