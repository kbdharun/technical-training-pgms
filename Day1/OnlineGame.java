// Q5. You are playing an online game. In the game, a list of N numbers is given.
// The player has to arrange the numbers so that all the odd numbers on the list
// come after the even numbers. Write an algorithm to arrange the given list such
// that all the odd numbers of the list come after the even numbers.

// Input Format:
// The first line of the input consists of an integer num, representing the size of the list(N).
// The second line of the input consists of N space-separated integers representing the values of the list.

// Output Format:
// Print N space-separated integers such that all the odd numbers of the list comes after the even numbers

// Sample Input:
// 8

// 10 98 3 33 12 22 21 11

// Sample Output:

// Array after Segregation

// 10 98 22 12 33 3 21 11


import java.util.Scanner;

public class OnlineGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the size of the array and its elements
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Step 2: Initialize two pointers
        int left = 0, right = n - 1;

        // Step 3: Segregate even and odd numbers
        while (left < right) {
            while (array[left] % 2 == 0 && left < right)
                left++;

            while (array[right] % 2 == 1 && left < right)
                right--;

            if (left < right) {
                // Swap array[left] and array[right]
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }

        // Step 4: Print the array after segregation
        System.out.println("Array after Segregation");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}

// Output:
// ➜  Day1 git:(main) ✗ javac OnlineGame.java 
// ➜  Day1 git:(main) ✗ java OnlineGame 
// 8
// 10 98 3 33 12 22 21 11
// Array after Segregation
// 10 98 22 12 33 3 21 11 %  
