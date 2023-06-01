class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode slow_pointer = head;
        
        ListNode fast_pointer = head;

        while(fast_pointer != null && fast_pointer.next != null) {

            slow_pointer = slow_pointer.next;

            fast_pointer = fast_pointer.next.next;

        }

        return slow_pointer;
        
    }
}
