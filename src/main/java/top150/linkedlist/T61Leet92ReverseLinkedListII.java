package top150.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class T61Leet92ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode leftPrevNode = dummyHead;
        ListNode currentNode = head;

        for (int i = 0; i < left - 1; i++) {
            leftPrevNode = currentNode;
            currentNode = currentNode.next;
        }

        ListNode prevNode = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode tempNextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = tempNextNode;
        }

        leftPrevNode.next.next = currentNode;
        leftPrevNode.next = prevNode;

        return dummyHead.next;
    }
}
