package top150.divideconquer.leet111;

public class T111Leet23MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode answer = lists[0];

        for (int i = 1; i < lists.length; i++) {
            answer = mergeTwo(answer, lists[i]);
        }

        return answer;
    }

    private ListNode mergeTwo(ListNode p1, ListNode p2) {
        ListNode dummyHead = new ListNode();
        ListNode answer = dummyHead;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                dummyHead.next = p1;
                dummyHead = dummyHead.next;
                p1 = p1.next;
            } else {
                dummyHead.next = p2;
                dummyHead = dummyHead.next;
                p2 = p2.next;
            }
        }
        if (p2 == null) {
            dummyHead.next = p1;
        } else {
            dummyHead.next = p2;
        }

        return answer.next;
    }
}
