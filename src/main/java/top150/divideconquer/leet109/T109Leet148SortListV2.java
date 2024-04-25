package top150.divideconquer.leet109;

public class T109Leet148SortListV2 {
    public ListNode sortList(ListNode head) {
        return quickSort(head, null);
    }

    private ListNode quickSort(ListNode head, ListNode tail) {
        if (head == null || head.next == null || head == tail) {
            return head;
        }
        boolean sorted = true;
        ListNode pivot = head;
        for (ListNode currNode = pivot.next, prevNode = pivot, nextNode; currNode != null && currNode != tail; currNode = nextNode) {
            nextNode = currNode.next;
            if (currNode.val < pivot.val) {
                sorted = false;
                prevNode.next = nextNode;
                currNode.next = head;
                head = currNode;
            } else {
                if (currNode.val < prevNode.val) {
                    sorted = false;
                }
                prevNode = currNode;
            }
        }

        if (sorted) {
            return head;
        }

        pivot.next = quickSort(pivot.next, tail);
        return quickSort(head, pivot);
    }
}
