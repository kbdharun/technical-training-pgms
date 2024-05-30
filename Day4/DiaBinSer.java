// Q4. To implement the diameter of the binary search tree

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class DiaBinSer {
    Node root;

    // Function to calculate the diameter
    int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        // Get the height of left and right sub trees
        int lheight = height(root.left);
        int rheight = height(root.right);

        // Get the diameter of left and right sub trees
        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        // Return max of the diameters and height
        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
    }

    // Function to calculate the height of the tree
    int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            // Calculate the depth of each subtree and return the larger one
            return (1 + Math.max(height(node.left), height(node.right)));
        }
    }

    // Function to insert nodes in the BST
    void insert(int data) {
        root = insertRec(root, data);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int data) {
        // If the tree is empty, assign a new node address to root
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Else, recur down the tree
        if (data < root.data)     // Insert in the left subtree
            root.left = insertRec(root.left, data);
        else if (data > root.data)    // Insert in the right subtree
            root.right = insertRec(root.right, data);

        return root;
    }

    public static void main(String args[]) {
        /* Creating a binary tree and entering the nodes */
        DiaBinSer tree = new DiaBinSer();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the BST:");
        int n = scanner.nextInt();

        System.out.println("Enter the nodes of the BST:");
        for (int i = 0; i < n; i++) {
            tree.insert(scanner.nextInt());
        }
        scanner.close();

        System.out.println("The diameter of the tree is " + tree.diameter(tree.root));
    }
}

// Output:
// ➜  Day4 git:(main) ✗ javac DiaBinSer.java
// ➜  Day4 git:(main) ✗ java DiaBinSer      
// Enter the number of nodes in the BST:
// 6
// Enter the nodes of the BST:
// 1 2 3 4 5 6
// The diameter of the tree is 6
