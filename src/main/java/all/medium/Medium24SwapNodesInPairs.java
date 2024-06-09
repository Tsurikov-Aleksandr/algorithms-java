package all.medium;


public class Medium24SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummyHead = new ListNode();
        ListNode answer = dummyHead;

        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;
            head = head.next.next;
            dummyHead.next = second;
            dummyHead.next.next = first;
            dummyHead = dummyHead.next.next;
        }

        if (head != null) {
            dummyHead.next = head;
            dummyHead = dummyHead.next;
        }
        if (dummyHead.next != null) {
            dummyHead.next = null;
        }

        return answer.next;
    }
}
