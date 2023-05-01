/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        
        ListNode previous = null;
                
        while(current != null) {
            ListNode currentnext = current.next;
            
            current.next = previous;
            
            previous = current;
            
            current = currentnext;
        }
        
        return previous;
    }
}
