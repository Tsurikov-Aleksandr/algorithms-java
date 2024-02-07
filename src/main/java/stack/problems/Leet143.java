package stack.problems;

public class Leet143 {
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
        if (head == null || head.next == null) return;

        //ищем середину
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while (pointer2.next != null && pointer2.next.next != null) {
            pointer1 = pointer1.next; // до середины
            pointer2 = pointer2.next.next; // до конца
        }

        //Реверсим второую половину  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle = pointer1;
        ListNode preCurrent = pointer1.next;
        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        //Переставляем по одному  1->2->3->6->5->4 to 1->6->2->5->3->4
        pointer1 = head;
        pointer2 = preMiddle.next;
        while (pointer1 != preMiddle) {
            preMiddle.next = pointer2.next;
            pointer2.next = pointer1.next;
            pointer1.next = pointer2;
            pointer1 = pointer2.next;
            pointer2 = preMiddle.next;
        }
    }


}
