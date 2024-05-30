// Q1. A simple tree program demonstrating preorder, inorder and post order traversal

import java.util.*;

class Tree1 {
    static class node
    {
        node left=null;
        int data;
        node right=null;
        node(int data)
        {
            this.data=data;
        }
    }
    static void preOrder(node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(node root)
    {
        if(root==null)
        {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    static node buildtree(String str)
    {
        String[] strip=str.split(" ");
        node root=new node(Integer.parseInt(strip[0]));
        Queue<node> q=new LinkedList<>();
        q.add(root);
        for(int i=1;i<strip.length;i++)
        {
            node curr=q.poll();
            if(!strip[i].equals(-1))
            {
                curr.left=new node(Integer.parseInt(strip[i]));
                q.add(curr.left);
            }
            i++;
            if(i<strip.length && !strip[i].equals(-1))
            {
                curr.right=new node(Integer.parseInt(strip[i]));
                q.add(curr.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        node root=buildtree(str);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}

// Output:
// ➜  Day4 git:(main) ✗ javac Tree1.java 
// ➜  Day4 git:(main) ✗ java Tree1
// 1 2 3 4 5 6 
// 1 2 4 5 3 6 
// 4 2 5 1 6 3 
// 4 5 2 6 3 1 %
