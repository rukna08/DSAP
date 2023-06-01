class Solution {
    public ListNode middleNode(ListNode head) {
        
        int ll_length = 0;
        
        for(ListNode i = head; i != null; i = i.next) {

            ll_length++;

        }

        int mid_point = (int)Math.ceil(ll_length / 2);

        ll_length = 0;

        for(ListNode i = head; i != null; i = i.next) {

            if(ll_length == mid_point) {

                return i;

            }

            ll_length++;

        }

        return null;
    }
}
