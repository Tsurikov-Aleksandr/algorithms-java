package linkedlist.problems;


public class Leet206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null){
            ListNode tempNext = head.next;
            head.next = prev;
            prev = head;
            head = tempNext;
        }

        return prev;
    }
}
