package top100liked;

import java.util.HashSet;
import java.util.Set;

public class T100likedLeet142LinkedListCycleII {

    public ListNode detectCycleNorm(ListNode head) {
        ListNode node = head;
        Set<ListNode> set = new HashSet<>();

        while (node != null) {
            if (set.contains(node)) {
                return node;
            } else {
                set.add(node);
                node = node.next;
            }
        }

        return null;
    }

    //faster but with additional condition
    //Constraints: pos is -1 or a valid index in the linked-list.
    public ListNode detectCycleMultiple(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        // node in Cycle and node before Cycle Multiple
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }


}
