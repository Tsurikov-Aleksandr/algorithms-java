package stack.problems;


import java.util.ArrayDeque;
import java.util.Deque;

public class Leet143ReorderList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void reorderList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode temp = head.next;
        if (head.next == null) {
            return;
        }

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        ListNode curNode = head;
        ListNode nextNode = head.next;

        int x = stack.size() / 2;

        for (int i = 0; i <= x; i++) {
            curNode.next = stack.pop();
            curNode.next.next = nextNode;
            curNode = nextNode;
            nextNode = curNode.next;
        }
        curNode.next.next = null;
    }

    public void reverseList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode temp = head.next;

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }

        temp = head;

        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;

        }

        temp.next = null;
    }


}
