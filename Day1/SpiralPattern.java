// Q9. Given an integer matrix of size n*n. n is the number of rows and columns. Traverse it in a spiral form.

// Input Format:
// The first line contains N, which represents the number of rows and columns of a matrix.
// The next N lines contain N values, each representing the values of the matrix.

// Output Format:
// A single line containing integers with space represents the desired traversal.

// Sample Input:
// 3
// 1 2 3
// 4 5 6
// 7 8 9

// Sample Output:
// 1 2 3 6 9 8 7 4 5

import java.util.*;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse Right
            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(matrix[rowStart][i] + " ");
            }
            rowStart++;

            // Traverse Down
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(matrix[i][colEnd] + " ");
            }
            colEnd--;

            // Traverse Left
            if (rowStart <= rowEnd) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(matrix[rowEnd][i] + " ");
                }
                rowEnd--;
            }

            // Traverse Up
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(matrix[i][colStart] + " ");
                }
                colStart++;
            }
        }
        scanner.close();
    }
}

// Output:
// ➜  Day1 git:(main) ✗ javac SpiralPattern.java
// ➜  Day1 git:(main) ✗ java SpiralPattern 
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// 1 2 3 6 9 8 7 4 5