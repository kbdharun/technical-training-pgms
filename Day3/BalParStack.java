// Q8. Implement Balanced Parentheses using Stack

import java.util.Stack;
import java.util.Scanner;

public class BalParStack {
    // Function to check if character x is an opening bracket and character y is the corresponding closing bracket
    private static boolean isMatchingPair(char x, char y) {
        if (x == '(' && y == ')') return true;
        if (x == '{' && y == '}') return true;
        if (x == '[' && y == ']') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of parentheses:");
        String expression = scanner.nextLine();
        scanner.close();

        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            // If the scanned character is an opening bracket, push it to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // If the scanned character is a closing bracket, pop from stack and check if the popped character is a matching pair
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        // If there is something left in stack then the expression is not balanced
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac BalParStack.java 
// ➜  Day3 git:(main) ✗ java BalParStack
// Enter a string of parentheses:
// []{()}
// Balanced
// ➜  Day3 git:(main) ✗ java BalParStack
// Enter a string of parentheses:
// [
// Not Balanced
