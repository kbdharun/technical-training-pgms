// Q5. To implement Longest Common Ancestor

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class LoCoAn {
    Node root;

    Node findLCA(int n1, int n2) {
        return findLCA(root, n1, n2);
    }

    Node findLCA(Node node, int n1, int n2) {
        if (node == null) {
            return null;
        }

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.data > n1 && node.data > n2) {
            return findLCA(node.left, n1, n2);
        }

        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.data < n1 && node.data < n2) {
            return findLCA(node.right, n1, n2);
        }

        return node;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public static void main(String args[]) {
        LoCoAn tree = new LoCoAn(); // Changed from BST to LoCoAn
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Enter the number of nodes in the BST:");
        int n = scanner.nextInt();
    
        System.out.println("Enter the nodes of the BST:");
        for (int i = 0; i < n; i++) {
            tree.insert(scanner.nextInt());
        }
    
        System.out.println("Enter the two nodes to find the LCA:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.close();
    
        Node lca = tree.findLCA(n1, n2);
        System.out.println("The LCA of " + n1 + " and " + n2 + " is " + lca.data);
    }
}

// Output:
// ➜  Day4 git:(main) ✗ java LoCoAn 
// Enter the number of nodes in the BST:
// 6
// Enter the nodes of the BST:
// 1 2 3 4 5 6 
// Enter the two nodes to find the LCA:
// 6 6
// The LCA of 6 and 6 is 6
// ➜  Day4 git:(main) ✗ java LoCoAn
// Enter the number of nodes in the BST:
// 5
// Enter the nodes of the BST:
// 1 2 3 4 5
// Enter the two nodes to find the LCA:
// 1 3
// The LCA of 1 and 3 is 1
