// Q10. Write a program to count the number of vowels in the given string.

// Input Format:
// Input consists of 1 string.

// Output Format:
// Output print the number of Vowels.

// Sample Input:
// face 

// Sample Output:
// Number of vowels: 2 

import java.util.*;

public class CountStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char[] chr=str.toCharArray();
        int count=0;
        for (char ch:chr){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
                count++;
        }
        sc.close();
        System.out.println("Number of vowels: "+count);
    }
}

// Output:
// ➜  Day1 git:(main) ✗ javac CountStrings.java 
// ➜  Day1 git:(main) ✗ java CountStrings 
// face
// Number of vowels: 2
