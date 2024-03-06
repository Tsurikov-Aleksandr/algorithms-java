package top150.linkedlist;

public class T57Leet141LinkedListCycleV2 {
    public boolean hasCycle(ListNode head) {
        //floyd's tortoise and hare
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
