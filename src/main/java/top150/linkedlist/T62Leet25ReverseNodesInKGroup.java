package top150.linkedlist;

public class T62Leet25ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode groupPrev = dummyHead;

        while (true) {
            ListNode kth = getkth(groupPrev, k);
            if (kth == null) {
                break;
            }
            ListNode groupNext = kth.next;

            //reverse
            ListNode prev = kth.next;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            ListNode temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;

        }

        return dummyHead.next;

    }

    public ListNode getkth(ListNode currrentNode, int k) {
        while (currrentNode != null && k > 0) {
            currrentNode = currrentNode.next;
            k--;
        }
        return currrentNode;
    }
}
