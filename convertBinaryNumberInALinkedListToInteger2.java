class Solution {

    public int getDecimalValue(ListNode head) {
        
        int ll_length = 0;

        for(ListNode i = head; i != null; i = i.next) {

            ll_length++;

        }

        int base10_number = 0;
        
        ListNode node_pointer = head;

        for(int i = ll_length - 1; i >= 0; i--) {

            base10_number += node_pointer.val * Math.pow(2, i);

            node_pointer = node_pointer.next;

        }

        return base10_number;

    }

}
