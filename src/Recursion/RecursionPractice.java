package Recursion;

public class RecursionPractice {


    static void printName(int i, String name){
        if (i > 5) return;

        System.out.print(name + " ");
        printName(i+1, name);
    }

    static void printLinearly(int i, int n, String name){
        if (i > n) return;

        System.out.print(name + " ");
        printLinearly(i+1, n, name);
    }

    static void printFromNto1(int i, int n){
        if (n < i) return;

        System.out.print(n + " ");
        printFromNto1(i, n-1);
    }


    static void printLinearlyUsingBacktrack(int n){
        if (n < 1) return;

        printLinearlyUsingBacktrack(n-1);
        System.out.print(n + " ");  // printing after backtrack
    }

    static void printFromNto1UsingBacktrack(int i, int n){
        if (i > n) return;

        printFromNto1UsingBacktrack(i+1, n);
        System.out.print(i + " ");
    }






    static int printSumLoop(int n){
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }


    static int printSumRecursion(int n, int sum){
        // sum of n numbers
        if(n < 0) return sum;
        
        return printSumRecursion(n-1, sum+n);
    }

    public static void main(String[] args) {


//        printName(1, "ABC");
//
//        printLinearly(1, 5, "XYZ");
//
//        System.out.println();
//
//        printFromNto1(1, 5);
//
//        System.out.println();
//
//        printLinearlyUsingBacktrack(4);
//
////        printLinearly(1, 5);
//
//        System.out.println();






//        System.out.println(printSumLoop(3));

        System.out.println(printSumRecursion(5, 0));

    }
}
