class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        for(int element : nums) element_sum += element;

        int digit_sum = 0;
        for(int element : nums) {
            while(element != 0) {
                int last_digit = element % 10;
                digit_sum += last_digit;
                element /= 10;
            }
        }

        return Math.abs(element_sum - digit_sum);
    }
}
