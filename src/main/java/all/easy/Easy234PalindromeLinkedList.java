package all.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Easy234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> temp = new ArrayList<>();
        while (head != null) {
            temp.add(head.val);
            head = head.next;
        }

        int end = temp.size() - 1;
        int start = 0;

        while(end >= start){
            if(!Objects.equals(temp.get(end), temp.get(start))){
                return false;
            }
            end--;
            start++;
        }

        return true;
    }
}
