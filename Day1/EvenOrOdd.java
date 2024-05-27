// Q2. Dolores Abarnathy and Maeve Millay were playing a puzzle game with a given set of numbers.
// They need to find the odd and even numbers and find the sum of the odd numbers and the sum of
// the even numbers. Write a program to help them to solve the puzzle game and to win the mobile phone.

// Input Format:

// Input consists of n+1 integers. 
// The first integer corresponds to ‘n’, the size of the array. 
// The next ‘n’ integers correspond to the elements in the array. 
// Assume that the maximum value of n is 15.

// Sample Input:

// 5 2 3 6 8 -1

// Sample Output:

// The sum of the even numbers in the array is 16
// The sum of the odd numbers in the array is 2

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the elements of the array:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        // Reading array elements
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int evenSum = 0, oddSum = 0;
        // Calculating sum of even and odd numbers
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }
        }
        System.out.println("The sum of the even numbers in the array is " + evenSum);
        System.out.println("The sum of the odd numbers in the array is " + oddSum);
    }
}

// Output:
// ➜  Day1 javac EvenOrOdd.java 
// ➜  Day1 java EvenOrOdd 
// Enter the elements of the array:
// 5 2 3 6 8 -1
// The sum of the even numbers in the array is 16
// The sum of the odd numbers in the array is 2