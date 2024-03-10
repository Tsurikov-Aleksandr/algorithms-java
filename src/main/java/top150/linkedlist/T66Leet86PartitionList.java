package top150.linkedlist;

public class T66Leet86PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode newList = new ListNode(0);
        ListNode newListTail = newList;
        ListNode oldList = new ListNode(0);
        ListNode oldListTail = oldList;
        ListNode tail = head;

        while(tail != null){
            if(tail.val < x){
                newListTail.next = tail;
                newListTail = newListTail.next;
            }else{
                oldListTail.next = tail;
                oldListTail = oldListTail.next;
            }
            tail = tail.next;
        }

        newListTail.next = oldList.next;
        oldListTail.next = null;

        return newList.next;
    }
}
