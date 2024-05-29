// Q3. To implement stack using Linked Lists.
// Choices:
// 1. push
// 2. pop
// 3. peek (last element)
// 4. size
// 5. is Empty or Full

import java.util.*;

public class LLStack {
    private Node top;
    private int size;

    private class Node {
        int data;
        Node next;
    }

    public LLStack() {
        top = null;
        size = 0;
    }

    // 1. push
    public void push(int data) {
        Node oldTop = top;
        top = new Node();
        top.data = data;
        top.next = oldTop;
        size++;
    }

    // 2. pop
    public int pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // 3. peek (last element)
    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return top.data;
    }

    // 4. size
    public int size() {
        return size;
    }

    // 5. is Empty or Full
    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LLStack stack = new LLStack();

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
                    return;
                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }
        }
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac LLStack.java
// ➜  Day3 git:(main) ✗ java LLStack      
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
// 3
// Invalid operation. Try again.
// Enter operation (push, pop, peek, size, quit):
// size
// Stack size is: 0
// Enter operation (push, pop, peek, size, quit):
// quit
