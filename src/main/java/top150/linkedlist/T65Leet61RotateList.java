package top150.linkedlist;

public class T65Leet61RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int lenghtList = 1;
        ListNode tail = head;

        while (tail.next != null) {
            lenghtList++;
            tail = tail.next;
        }

        k %= lenghtList;

        if (k == 0) {
            return head;
        }

        ListNode curr = head;
        for (int i = 0; i < lenghtList - k - 1; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        tail.next = head;

        return newHead;

    }
}
