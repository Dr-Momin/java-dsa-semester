package Labs.Lab_02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // Video 15

    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);



    }


    static void task01() {
        // Q1 - Given an unsorted array arr[] of size N having both negative and positive integers, place all negative elements at the end of array without changing the order of positive elements and negative elements.

        // N = 4
        // arr[] = {1, -1, 3, 2, -7, -5, 11, 6}
        // Output: 1 3 2 11 6 -1 -7 -5

        // N = 4
        // arr[] = {-3, -1, 0, -7}
        // Output:  0 -3 -1 -7


    }

    static void task02() {
        // Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find union between these two arrays and print the number of elements of the union set. Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.

        // Input 1:
        // 5 3
        // 1 2 3 4 5
        // 1 2 3
        // Output --> 5


        // Input 2:
        // 2 2
        // 1 1
        // 4 4
        // Output --> 2




    }

    static void task03() {
        // Q3 - Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

        // N = 6
        // arr[] = 7 10 4 3 20 15
        // K = 3
        // Output ---> 7

        /*
        * N = 5
        * arr[] = 7 10 4 3 20
        * K = 1
        *
        * Output ---> 3
        * */


    }

    static void task04() {

        // Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given numbers S. In case of multiple subarrays, return the subarray which comes first on moving from left to right. You need to print the start and end index of answer subarray.

        // N = 5, S = 12
        // A[] = {1,2,3,7,5}
        // Output --> 2 4

        /*
        * N = 5, S = 5
        * A[] = {1, 2, 3, 7, 5}
        * Output ---> 2 3
        * */



    }

    static void task04_practice(){
        // Q4 - Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given numbers S. In case of multiple subarrays, return the subarray which comes first on moving from left to right. You need to print the start and end index of answer subarray.

        // N = 5, S = 12
        // A[] = {1,2,3,7,5}



    }

    static void task05() {
        // Q5 - Write a Java program to test the equality of two arrays.

        // Input1:
        // 2 5 7 9 11
        // 2 5 7 9 13
        // Output ---> false


        // Input1:
        // 2 5 7 9 12
        // 2 5 7 9 12
        // Output ---> true




    }


}




