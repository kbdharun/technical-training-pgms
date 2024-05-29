// Q10. Evaluate Postfix Expression using Stack
import java.util.Stack;
import java.util.Scanner;

public class EvaPostExp {
    // Function to evaluate a postfix expression
    private static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                // If the character is a digit, push it onto the stack
                stack.push(c - '0');
            } else {
                // If the character is an operator, pop two elements from the stack, perform the operation, and push the result back onto the stack
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }

        // The final result is the only element left in the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a postfix expression:");
        String expression = scanner.nextLine();

        scanner.close();

        int result = evaluatePostfix(expression);

        System.out.println("The result of the expression is: " + result);
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac EvaPostExp.java
// ➜  Day3 git:(main) ✗ java EvaPostExp      
// Enter a postfix expression:
// 231*+9-
// The result of the expression is: -4
