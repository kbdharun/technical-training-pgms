// Q9. Implement Reversing a Queue using Stack

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
public class RevQueStack {
    private static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner s=new Scanner(System.in);
        int no=s.nextInt();
        int element;
        for(int i=0;i<no;i++)
        {
            element=s.nextInt();
            queue.add(element);
        }
        System.out.println("Original queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed queue: " + queue);
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac RevQueStack.java
// ➜  Day3 git:(main) ✗ java RevQueStack 
// 6
// 1 2 3 4 5 6 
// Original queue: [1, 2, 3, 4, 5, 6]
// Reversed queue: [6, 5, 4, 3, 2, 1]
