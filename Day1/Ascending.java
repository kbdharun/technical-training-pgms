// Q3. Kailash and his daughter Keerthana were arguing about who is the smartest person in the family.
// Kailash who is a world-known Computer Engineer asked Keerthana who has not yet completed college to 
// write a program to sort the given array in ascending order. Can you help Keerthana?

// Input Format:
// Input consists of 1 integer and 1 array. The integer corresponds to the size of the array.

// Output Format:
// The output consists of an array of elements after sorting.

// Sample Input : 5 54 68 25 14 74

// Sample Output :
// The Sorted array is: 14 25 54 68 74

import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array.
        int size = scanner.nextInt();

        // Step 2: Create an array of integers with the size obtained from the first step.
        int[] numbers = new int[size];

        // Step 3: Parse the rest of the arguments and fill the array with these values.
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        // Step 4: Sort the array in ascending order.
        Arrays.sort(numbers);

        // Step 5: Print the sorted array.
        System.out.print("The Sorted array is: \n");
        for (int number : numbers) {
            System.out.print(number + "\n");
        }
    }
}

// Output:
// ➜  Day1 git:(main) ✗ javac Ascending.java
// ➜  Day1 git:(main) ✗ java Ascending      
// 5 54 68 25 14 74
// The Sorted array is:
// 14
// 25
// 54
// 68
// 74
