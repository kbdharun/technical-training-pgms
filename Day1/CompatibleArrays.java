// Q4. Two arrays are said to be compatible if they are of the same size and if the ith element
// in the first array is greater than or equal to the ith element in the second array for all
// the values of i. Write a program to find whether 2 arrays are compatible or not.

// Input Format:
// Input consists of 2n+2 integers. The first integer corresponds to ‘n1’, the size of the first array. The next ‘n1’ integers correspond to the elements in the first array. The next (n+1) integer corresponds to 'n2', the size of the second array. The last 'n2' integers correspond to the elements in the second array.

// Output Format:
// The output is any one of the two strings "Compatible" or "Incompatible"

// Sample Input: 5 2 3 6 8 1 5 1 1 1 1 1

// Sample Output:
// Compatible


import java.util.Scanner;

public class CompatibleArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the size of the first array and its elements
        int n1 = scanner.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Step 2: Read the size of the second array and its elements
        int n2 = scanner.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = scanner.nextInt();
        }

        scanner.close();

        // Step 3: If the sizes are not equal, the arrays are incompatible
        if (n1 != n2) {
            System.out.println("Incompatible");
            return;
        }

        // Step 4: Check if all elements in the first array are greater than or equal to the corresponding elements in the second array
        for (int i = 0; i < n1; i++) {
            if (array1[i] < array2[i]) {
                System.out.println("Incompatible");
                return;
            }
        }

        // Step 5: Else the arrays are compatible
        System.out.println("Compatible");
    }
}

// Output:
// ➜  Day1 git:(main) ✗ javac CompatibleArrays.java 
// ➜  Day1 git:(main) ✗ java CompatibleArrays 
// 5 2 3 6 8 1 5 1 1 1 1 1
// Compatible
