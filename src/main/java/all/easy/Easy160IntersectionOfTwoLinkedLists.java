package all.easy;

public class Easy160IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        int loop = 0;
        while (p1 != p2 && loop < 3) {
            if (p1.next == null) {
                p1 = headB;
                loop++;
            } else {
                p1 = p1.next;
            }
            if (p2.next == null) {
                p2 = headA;
                loop++;
            } else {
                p2 = p2.next;
            }
        }

        return loop > 2 ? null : p1;
    }
}
