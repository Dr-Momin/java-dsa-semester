package Recursion;

public class Q2 {


    /*
    * 2. Write a recursive method that determines if a string s is a palindrome, that is, it is equal to its reverse. A string is said to be a palindrome if the string read from left to right is equal to the string read from right to left. For example, ignoring the difference between uppercase and lowercase letters, the string "racecar" is a palindrome, while the string "cake" is not so
    * */

    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        if (firstChar != lastChar) {
            return false;
        }

        String substring = word.substring(1, word.length() - 1);
        return isPalindrome(substring);
    }


    public static void main(String[] args) {




        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("cake"));




    }
}
