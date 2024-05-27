// Q1. Harish and Rajesh were developing a plan to find the ideal woman for Sheldon Cooper. 
// There were puzzles, translations, and questions to check a person's intelligence. 
// One such question was to come up with a program to count the number of distinct elements in an array. 
// Harini is a postdoctoral researcher and a former graduate student of Caltech who is a huge fan of
// Sheldon's work and she wanted to impress Sheldon by writing a program to count the number of 
// distinct element in an array. Can you help Harini?

// // Input Format:
// Input consists of 1 integer and 1 array. The first integer corresponds to the size of the array.

// Output Format:
// The output prints the number of distinct element in an array.

// Sample Input: 5 1 2 3 3 4

// Sample Output:
// There are 4 distinct element in the array.

// Explanation:
// Since there are 4 distinct elements it will print There are 4 distinct element in the array.

import java.util.Scanner;
import java.util.HashSet;

public class Counter1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashSet<Integer> distinctElements = new HashSet<>();
        // Reading array elements and adding them to the HashSet
        for(int i = 0; i < n; i++) {
            distinctElements.add(s.nextInt());
        }
        s.close();
        System.out.println("There are " + distinctElements.size() + " distinct elements in the array.");
    }
}

// ➜  Day1 javac Counter1.java  
// ➜  Day1 java Counter1
// 5 1 2 3 3 4
// There are 4 distinct elements in the array.
