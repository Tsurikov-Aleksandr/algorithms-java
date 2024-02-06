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

    //Input: head = [1,2,3,4,5]
    //Output: [1,5,2,4,3]
    public void reorderList(ListNode head) {
        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode temp = head.next;

        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }


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
