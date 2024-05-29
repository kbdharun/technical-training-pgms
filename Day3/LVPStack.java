// Q5. To find the length of Longest Valid Parentheses using Stack.

import java.util.Stack;
import java.util.Scanner;

public class LVPStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String s = scanner.nextLine();
        scanner.close();

        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);  // push
            } else {
                stack.pop();  // pop
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());  // peek
                }
            }
        }
        System.out.println("Length of the longest valid parentheses substring is: " + maxLen);
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac LVPStack.java 
// ➜  Day3 git:(main) ✗ java LVPStack 
// Enter a string of parentheses:
// ))(())()(
// Length of the longest valid parentheses substring is: 6
