// Q2. To implement right view of a Bianry tree

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    // Function to print the right view of the binary tree
    void rightView() {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // number of nodes at current level
            int n = queue.size();

            for (int i = 1; i <= n; i++) {
                Node temp = queue.poll();

                // print the right most element at the level
                if (i == n) {
                    System.out.print(temp.data + " ");
                }

                // add left node to queue
                if (temp.left != null) {
                    queue.add(temp.left);
                }

                // add right node to queue
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }

    // Function to add nodes in the binary tree
    void addNode(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                Node temp = queue.poll();

                if (temp.left == null) {
                    temp.left = new Node(data);
                    break;
                } else {
                    queue.add(temp.left);
                }

                if (temp.right == null) {
                    temp.right = new Node(data);
                    break;
                } else {
                    queue.add(temp.right);
                }
            }
        }
    }
}

public class RigViewBin {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.println("Enter the number of nodes in the binary tree:");
        int n = scanner.nextInt();

        System.out.println("Enter the nodes of the binary tree:");
        for (int i = 0; i < n; i++) {
            tree.addNode(scanner.nextInt());
        }
        scanner.close();

        System.out.println("Right view of given binary tree is:");
        tree.rightView();
    }
}

// Output:
// ➜  Day4 git:(main) ✗ javac RigViewBin.java
// ➜  Day4 git:(main) ✗ java RigViewBin      
// Enter the number of nodes in the binary tree:
// 6
// Enter the nodes of the binary tree:
// 1 2 3 4 5 6  
// Right view of given binary tree is:
// 1 3 6 %                                                                                                                                  
// ➜  Day4 git:(main) ✗ java RigViewBin
// Enter the number of nodes in the binary tree:
// 5
// Enter the nodes of the binary tree:
// 1 2 3 4 5 
// Right view of given binary tree is:
// 1 3 5 %  
