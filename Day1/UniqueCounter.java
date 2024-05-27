//Program 1
//Qn. Find the count of increasing array  1,1,2,2,3,4,4,5.

import java.util.Scanner;

public class UniqueCounter {
    public static void main(String[] args) {
        System.out.println("Enter the elements of array:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        // Reading array elements
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int unique = 0;
        // Checking for unique elements
        for(int i = 0; i < n; i++) {
            boolean isUnique = true;
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique) {
                unique++;
            }
        }
        System.out.println("Number of unique elements: " + unique);
    }
}

// Output:
// ➜  day1 javac UniqueCounter.java   
// ➜  Day1 java UniqueCounter      
// Enter the elements of array:
// 1 1 2 2 3 4 4 5
// Number of unique elements: 1