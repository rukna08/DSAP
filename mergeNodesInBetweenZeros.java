class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode output_head = new ListNode(0, null);
        ListNode output_list = output_head;

        int sum = 0;

        for(ListNode i = head.next; i != null; i = i.next) {

            if(i.val == 0) {
                output_list.val = sum;
                
                if(i.next != null) {    
                    output_list.next = new ListNode(0, null);
                    output_list = output_list.next;
                    sum = 0;
                }

            } else {
                sum += i.val;
            }
        }

        return output_head;
    }
}
