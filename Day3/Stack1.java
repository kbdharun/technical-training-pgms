// Q2. Stack program using a textual choice based system
import java.util.*;

public class Stack1 {
    private int[] stack;
    private int top;

    public Stack1(int size) {
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
            System.out.println("Enter command (push, pop, print, quit):");
            String command = scanner.next();

            switch (command.toLowerCase()) {
                case "push":
                    System.out.println("Enter a number to push:");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    stack.pop();
                    break;
                case "print":
                    stack.print();
                    break;
                case "quit":
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac Stack1.java
// ➜  Day3 git:(main) ✗ java Stack1
// Enter the size of the stack:
// 3
// Enter command (push, pop, print, quit):
// push
// Enter a number to push:
// 13
// Enter command (push, pop, print, quit):
// pop
// Popped: 13
// Enter command (push, pop, print, quit):
// print
// Stack is empty.
// Enter command (push, pop, print, quit):
// pop     
// Stack is empty.
// Enter command (push, pop, print, quit):
// push 
// Enter a number to push:
// 10
// Enter command (push, pop, print, quit):
// print
// Stack: 10 
// Enter command (push, pop, print, quit):
// quit
