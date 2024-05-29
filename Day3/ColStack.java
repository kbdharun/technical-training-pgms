// Q4. To implement stack using Collections.
// Choices:
// 1. push
// 2. pop
// 3. peek (last element)
// 4. size
// 5. is Empty or Full
import java.util.Stack;
import java.util.Scanner;

public class ColStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("Enter operation (push, pop, peek, size, quit):");
            String operation = scanner.nextLine();

            switch (operation) {
                case "push":
                    System.out.println("Enter a number to push:");
                    int num = scanner.nextInt();
                    scanner.nextLine();  // consume newline left-over
                    stack.push(num);
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        System.out.println("Pop element: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case "peek":
                    if (!stack.isEmpty()) {
                        System.out.println("Top element is: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case "size":
                    System.out.println("Stack size is: " + stack.size());
                    break;
                case "quit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }
        }
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac ColStack.java 
// ➜  Day3 git:(main) ✗ java ColStack 
// Enter operation (push, pop, peek, size, quit):
// push
// Enter a number to push:
// 3
// Enter operation (push, pop, peek, size, quit):
// peek
// Top element is: 3
// Enter operation (push, pop, peek, size, quit):
// size
// Stack size is: 1
// Enter operation (push, pop, peek, size, quit):
// pop
// Pop element: 3
// Enter operation (push, pop, peek, size, quit):
// peek
// Stack is empty.
// Enter operation (push, pop, peek, size, quit):
// quit
