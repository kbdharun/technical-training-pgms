//Q7. Implement Infix to Prefix conversion using Stack

import java.util.Stack;
import java.util.Scanner;

public class InfToPreStack {
    // Function to check if a character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Function to check precedence of operators
    private static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an infix expression:");
        String infix = scanner.nextLine();
        scanner.close();

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            // If the character is an operand, append it to postfix
            if (!isOperator(c)) {
                postfix.append(c);
            } else {
                // If the stack is not empty and the precedence of the scanned operator is less than or equal to the top operator in the stack, pop and append to postfix
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                // Push the scanned operator to the stack
                stack.push(c);
            }
        }

        // Pop and append all remaining operators in the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        System.out.println("Postfix expression: " + postfix);
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac InfToPreStack.java 
// ➜  Day3 git:(main) ✗ java InfToPreStack 
// Enter an infix expression:
// (((a+b)*c)/(D/E))+F
// Postfix expression: (((ab)c)*(D/E))/+F+
