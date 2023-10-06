package Recursion;

public class Q1 {


//    1. Develop a recursive algorithm for computing the product of a sequence of odd values.


    static int initialProduct = 1;
    public static int productOfOddSequence(int n){

        if (n < 1){
            return initialProduct;
        }

        if (n % 2 == 1){
            initialProduct = initialProduct * n;
            return productOfOddSequence(n-2);
        }

        return productOfOddSequence(n-1);
    }



    public static void main(String[] args) {


        System.out.println(productOfOddSequence(5));

    }
}
