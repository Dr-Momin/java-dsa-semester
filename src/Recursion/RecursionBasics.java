package Recursion;

public class RecursionBasics {


    static void printNumber(int n){

        if (n == 0){
            return;
        }

        System.out.print(n + " "); 
        printNumber(n - 1);
    }

    static int count = 0;

    static void printNumberInAscending(int n) {

        if (count == n) {
            return;
        }

        System.out.print(++count + " ");
        printNumberInAscending(n);
    }


    static int calculateFactorial(int n){
        if(n == 1 || n == 0) return 1;

        return n * calculateFactorial(n -1);
    }

    static int fibonacciUsingRecursion(int n){
        if (n <= 1)
            return n;
        return fibonacciUsingRecursion(n-1) + fibonacciUsingRecursion(n-2);
    }

    static void printFib(int secondLast, int last, int n){
        if (n <= 0){
            return;
        }

        int c = secondLast + last;
        System.out.print(c + " ");
        printFib(last, c, n-1);
    }

    static int fibonacciUsingLoop(int n){
        int a = 0, b = 1, c;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }



    static int calculatePower(int x, int n){
        if (x == 0){
            return 0;
        }
        if (n == 0){
            return 1;
        }

        int pow = calculatePower(x, n-1);
        return x * pow;
    }

    static int calculatePowerWithLogN(int x, int n){
        if (n == 0){
            return 1;
        }

        if (x == 0){
            return 0;
        }

        if (n % 2 == 0){
            return calculatePowerWithLogN(x, n/2) * calculatePowerWithLogN(x, n/2);
        }

        return calculatePowerWithLogN(x, n/2) * calculatePowerWithLogN(x, n/2) * x;
    }



    public static void main(String[] args) {


        System.out.println(calculatePower(2, 5));



    }
}
