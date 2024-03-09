package top150.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class T57Leet141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        Set<ListNode> set = new HashSet<>();
        ListNode pointer = head;
        while (pointer.next != null) {
            if (set.contains(pointer)) {
                return true;
            }
            set.add(pointer);
            pointer = pointer.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

