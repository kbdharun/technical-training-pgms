// Palindrome of Linked List
public class Ll3 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    boolean isPalindrome(Node head) {
        Node slow = head, fast = head, prev = null, temp;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (prev != null && prev.data == slow.data) {
            slow = slow.next;
            prev = prev.next;
        }

        return prev == null;
    }
}
