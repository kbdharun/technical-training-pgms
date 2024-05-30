// Q3. To implement binary search tree

import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BST {
    Node root;

    // Constructor for BST => set root as null
    BST() {
        root = null;
    }

    // Method to insert a new node in the BST
    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, assign a new node address to root
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Else, recur down the tree
        if (key < root.key)     // Insert in the left subtree
            root.left = insertRec(root.left, key);
        else if (key > root.key)    // Insert in the right subtree
            root.right = insertRec(root.right, key);

        return root;
    }

    // Method for inorder traversal of BST
    void inorder() {
        inorderRec(root);
    }

    // A utility function for inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}

public class BinSerTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST bst = new BST();

        System.out.println("Enter the number of nodes in the BST:");
        int n = scanner.nextInt();

        System.out.println("Enter the nodes of the BST:");
        for (int i = 0; i < n; i++) {
            bst.insert(scanner.nextInt());
        }
        scanner.close();

        System.out.println("Inorder traversal of the given BST is:");
        bst.inorder();
    }
}

// Output:
// ➜  Day4 git:(main) ✗ java BinSerTree
// Enter the number of nodes in the BST:
// 6
// Enter the nodes of the BST:
// 1 5 2 3 6 9
// Inorder traversal of the given BST is:
// 1 2 3 5 6 9 %
