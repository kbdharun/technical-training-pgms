// Q8. Ravi is not able to figure out the method to calculate the sum of the
// Zig-Zag pattern in the Matrix. Can you help Ravi to write a program to find
// the sum of Zig-Zag patterns in a given matrix?

// Input Format:
// Input consists of 2 integers and 1 2D array.
// Integers corresponding to the size of rows and columns.

// Output Format:
// The output prints the sum of the zig-zag pattern.
// Refer to the sample output.

// Note: Size of row and column should be same

// Sample Input:
// 3
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Sample Output:
// Sum of Zig-Zag pattern is 35

// Explanation:
// The sum of zig-zag pattern is 1+2+3+5+7+8+9=35 and hence its prints 35

import java.util.*;

public class SumOfZigZag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        // Add first row
        for (int j = 0; j < cols; j++) {
            sum += matrix[0][j];
        }

        // Add last row
        for (int j = 0; j < cols; j++) {
            sum += matrix[rows - 1][j];
        }

        // Add middle column
        for (int i = 1; i < rows - 1; i++) {
            sum += matrix[i][cols / 2];
        }

        System.out.println("Sum of Zig-Zag pattern is " + sum);

        scanner.close();
    }
}

// Output:
// ➜  Day1 git:(main) ✗ javac SumOfZigZag.java 
// ➜  Day1 git:(main) ✗ java SumOfZigZag 
// 3
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sum of Zig-Zag pattern is 35