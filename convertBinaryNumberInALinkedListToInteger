class Solution {

    public int getDecimalValue(ListNode head) {
        
        ArrayList<Integer> binary_list = new ArrayList<>();

        for(ListNode i = head; i != null; i = i.next) {
            
            binary_list.add(i.val);
        
        }

        Collections.reverse(binary_list);

        int base10_number = 0;

        for(int i = 0; i < binary_list.size(); i++) {

            base10_number += binary_list.get(i) * Math.pow(2, i);

        }

        return base10_number;

    }

}
