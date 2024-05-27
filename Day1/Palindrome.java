// Q11. Write a program to find whether the given string is a palindrome or not without using string library functions.

// Note: The string reads the same backward and forward.

// Input Format:
// Input consists of 1 string.

// Output Format:
// If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.

// Sample Input:
// mam

// Sample Output:

// Palindrome

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        scanner.close();
    }
}

// Output:
// ➜  Day1 git:(main) ✗ javac Palindrome.java  
// ➜  Day1 git:(main) ✗ java Palindrome 
// mam
// Palindrome