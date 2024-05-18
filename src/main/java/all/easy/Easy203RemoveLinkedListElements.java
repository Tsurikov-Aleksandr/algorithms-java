package all.easy;

public class Easy203RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }

        ListNode dummyHead = new ListNode();
        ListNode answer = dummyHead;

        while (head != null){
            if(head.val != val){
                dummyHead.next = head;
                dummyHead = dummyHead.next;
                head = head.next;
            }
            else{
                head = head.next;
            }
        }
        dummyHead.next = null;

        return answer.next;
    }
}
