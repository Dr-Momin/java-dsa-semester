package Recursion;

public class Q1 {


    static int initialProduct = 1;
    public static int productOfOddSequence(int n){

        if (n < 1){
            return initialProduct;
        }

        if (n % 2 == 1){
            initialProduct = initialProduct * n;
            return productOfOddSequence(n-2);
        }
        else{
            return productOfOddSequence(n-1);
        }

    }



    public static void main(String[] args) {


        System.out.println(productOfOddSequence(5));

    }
}
