// Q7. Irene who is one of the organizers of the event has arranged the audience(boys and girls)
// in a matrix format. Separate values were given to boys and girls which are 1 and 0 respectively.
// The arrangement should be done based on one condition. She should arrange all the girls below the
// main diagonal since it is done in a matrix format. If she did the arrangement in a proper way
// she will win the prize or else not. Help the Judges to find out whether she wins the prize.
// If she wins you can print "Upper triangular matrix" or else "Not an Upper triangular matrix".
// Write a program to check whether the given matrix is an upper triangular matrix or not.

// Input Format:
// The input consists of the number of rows and columns and the matrix

// Output Format:
// The output is any one of the following two strings Upper triangular matrix or Not an Upper triangular matrix.

// Sample Input:
// 3
// 0 0 1
// 0 2 3
// 0 0 5

// Sample Output:
// Upper triangular matrix

// Explanation:

// Since all the elements below the diagonal of the matrix are 0 it prints the Upper triangular matrix.

import java.util.*;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isUpperTriangular = true;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
        }

        if (isUpperTriangular) {
            System.out.println("Upper triangular matrix");
        } else {
            System.out.println("Not an Upper triangular matrix");
        }

        scanner.close();
    }
}
