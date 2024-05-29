// Stack program with a numeric choice based system
import java.util.*;

public class Stack {
    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stack[++top] = value;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Popped: " + stack[top--]);
        }
    }

    public void print() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the stack:");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("Enter 1 to push, 2 to pop, 3 to print, 4 to quit:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a number to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.print();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac Stack.java 
// ➜  Day3 git:(main) ✗ java Stack 
// Enter the size of the stack:
// 5
// Enter 1 to push, 2 to pop, 3 to print, 4 to quit:
// 1
// Enter a number to push:
// 1
// Enter 1 to push, 2 to pop, 3 to print, 4 to quit:
// 3
// Stack: 1 
// Enter 1 to push, 2 to pop, 3 to print, 4 to quit:
// 4
