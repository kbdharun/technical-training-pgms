// Q6. To implement Binary Search Tree

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class Count {
    int count = 0;
}

public class BST {
    Node root;

    void inorder()  {
        inorderRec(root, null);
    }

    void inorderRec(Node node, Count count) {
        if (node != null) {
            inorderRec(node.left, count);

            if (count != null) {
                count.count++;
            }

            inorderRec(node.right, count);
        }
    }

    Node kthSmallest(Node node, Count count, int k) {
        if (node == null) {
            return null;
        }

        Node left = kthSmallest(node.left, count, k);

        if (left != null) {
            return left;
        }

        if (count.count == k) {
            return node;
        }

        count.count++;

        return kthSmallest(node.right, count, k);
    }

    void printKthSmallest(int k) {
        Count count = new Count();
        Node res = kthSmallest(root, count, k);
        if (res == null) {
            System.out.println("There are less than " + k + " elements in the BST");
        } else {
            System.out.println("The " + k + "th smallest element is " + res.data);
        }
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public static void main(String[] args) {
        BST tree = new BST();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the BST:");
        int n = scanner.nextInt();

        System.out.println("Enter the nodes of the BST:");
        for (int i = 0; i < n; i++) {
            tree.insert(scanner.nextInt());
        }

        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        scanner.close();

        tree.printKthSmallest(k);
    }
}

// Output:
// ➜  Day4 git:(main) ✗ java BST
// Enter the number of nodes in the BST:
// 5
// Enter the nodes of the BST:
// 1 2 3 4 5
// Enter the value of k:
// 4
// The 4th smallest element is 5
