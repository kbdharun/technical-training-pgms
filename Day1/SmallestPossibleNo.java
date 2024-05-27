// Q6. You are given an array a[ ] of n integers.
// The task is to find the smallest positive number missing from the array.

// Input Format:
// First line - n, the size of an array Second line - all the n elements (a[i] can be positive, negative, zero)

// Output Format:
// Print the smallest positive number missing from the array.

// Sample Input:
// 6
// 4 2 0 -1 1 -3

// Sample Output:
// 3


import java.util.*;

public class SmallestPossibleNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        // Bubble sort
        for (int i = 0; i < num - 1; i++) {
            for (int j = i + 1; j < num; j++) {
                if (arr[i] > arr[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Find the smallest positive number missing from the array
        int smallestMissing = 1;
        for (int i = 0; i < num; i++) {
            if (arr[i] == smallestMissing) {
                smallestMissing++;
            }
        }

        System.out.println(smallestMissing);
        scanner.close();
    }
}

// Output:
// ➜  Day1 git:(main) ✗ javac SmallestPossibleNo.java 
// ➜  Day1 git:(main) ✗ java SmallestPossibleNo 
// 6
// 4 2 0 -1 1 -3
// 3

/*
 * Alternative method using HashSet:
 *
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int min_pos=0,number;
    Set<Integer> set = new HashSet<Integer>();
    for(int i=0;i<n;i++)
    {
      number=s.nextInt();
      if (number>0)
      {
        set.add(number);
         if (number<min_pos)
           min_pos=number;
      }
    }
    min_pos++;
    while (true)
    {
      if (set.contains(min_pos))
      {
        min_pos++;
      }
      else
      {
        System.out.println(min_pos);
        break;
      }
    }
  }
}
 */