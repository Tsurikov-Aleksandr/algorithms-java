package top150.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 **/

public class T59Leet21MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;

        while (list1 != null && list2 != null){
            if (list1.val > list2.val){
                tail.next = list2;
                list2 = list2.next;
            }else{
                tail.next = list1;
                list1 = list1.next;
            }
            tail = tail.next;
        }

        tail.next = (list1 == null) ? list2 : list1;

        return dummyHead.next;
    }
}
