//Q1. Sample LinkedList program
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Ll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int ele;
        while ((ele = sc.nextInt()) != -1) {
            ll.insertAtEnd(ele);
            ll.print();
        }
        sc.close();
    }
}

// Output:

// ➜  Day2 git:(main) ✗ javac Ll.java 
// ➜  Day2 git:(main) ✗ java Ll
// 5 10 15 20 -1
// 5
// 5
// 10
// 5
// 10
// 15
// 5
// 10
// 15
// 20