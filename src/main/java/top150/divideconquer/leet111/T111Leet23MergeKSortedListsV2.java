package top150.divideconquer.leet111;

public class T111Leet23MergeKSortedListsV2 {
    public ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        int interval = 1;
        while (interval < size) {
            for (int i = 0; i < size - interval; i += 2 * interval) {
                lists[i] = mergeTwo(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }

        return size > 0 ? lists[0] : null;
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
