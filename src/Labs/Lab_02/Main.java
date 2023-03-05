package Labs.Lab_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Video 15

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        //Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place all negative elements at the end of array without changing the order of positive elements and negative elements.

//        System.out.println("Hello");
//        task01();


        // Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find union between these two arrays and print the number of elements of the union set. Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

//        task02();

        // Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

//        task03();


        // Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given numbers S. In case of multiple subarrays, return the subarray which comes first on moving from left to right. You need to print the start and end index of answer subarray.

//        task04();
        task04_practice();

        // Q5 - Write a Java program to test the equality of two arrays.
//        task05();


    }


    static void task01() {
        // Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place all negative elements at the end of array without changing the order of positive elements and negative elements.

        int N = 8, index = 0;
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        int[] ans = new int[N];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[index++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(ans));
    }

    static void task02() {
        // Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find union between these two arrays and print the number of elements of the union set. Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
        Scanner sc = new Scanner(System.in);

        // ================ Initializing Array && Taking the input =======================
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr_01 = new int[m], arr_02 = new int[n];

        takeTwoArrayInputs(arr_01, arr_02);


        // ================= Solution Started ========================

        for (int i = 0; i < arr_01.length; i++) {
            boolean check = false;
            for (int j = 0; j < arr_02.length; j++) {

                if (arr_01[i] == arr_02[j]) {
                    check = true;
                    break;
                }
            }

            if (!check) {
                System.out.println(arr_01[i]);
            }

        }


    }

    static void task03() {
        // Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println(arr[k - 1]);

    }

    static void task04() {

        // Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given numbers S. In case of multiple subarrays, return the subarray which comes first on moving from left to right. You need to print the start and end index of answer subarray.

        // N = 5, S = 12
        // A[] = {1,2,3,7,5}

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        System.out.println("Enter S: ");
        int s = scn.nextInt();

        System.out.println("Enter Array Values");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < n) {
            sum += arr[i];
            if (sum > s) {
                while ( j < i) {
                    sum -= arr[j];
                    j++;
                }
            }
            if (sum == s) {
                System.out.print(j + " " + i);
                break;
            }
            i++;
        }


    }

    static void task04_practice(){
        // Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given numbers S. In case of multiple subarrays, return the subarray which comes first on moving from left to right. You need to print the start and end index of answer subarray.

        // N = 5, S = 12
        // A[] = {1,2,3,7,5}

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = scn.nextInt();
        System.out.println("Enter S: ");
        int s = scn.nextInt();

        System.out.println("Enter Array Values");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int i=0, j=0, sum=0;
        while (i < n){

            sum += arr[i];

            if (sum > s){
                while (j < i){
                    sum -= arr[i];
                    j++;
                }
            }

            if (sum == s){
                System.out.println(j + " " + i);
            }


            i++;
        }

    }

    static void task05() {
        // Q5 - Write a Java program to test the equality of two arrays.
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] arr_01 = new int[m], arr_02 = new int[n];

        takeTwoArrayInputs(arr_01, arr_02);

        boolean check = true;
        for (int i = 0; i < arr_01.length; i++) {
            if (arr_01[i] != arr_02[i]) {
                check = false;
                break;
            }
        }

        if (check)
            System.out.println("Yes, two arrays are equal!!");
        else
            System.out.println("No, the arrays are not equal...");

    }

    static void takeTwoArrayInputs(int[] arr_01, int[] arr_02) {

        for (int i = 0; i < arr_01.length; i++) {
            arr_01[i] = sc.nextInt();
        }

        for (int i = 0; i < arr_02.length; i++) {
            arr_02[i] = sc.nextInt();
        }
    }

}




