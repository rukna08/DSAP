class Solution {
    public static int mod(int x) {
        if(x < 0) return x / -1;
        return x;
    }
    
    public int[] leftRigthDifference(int[] nums) {
        int[] left_arr = new int[nums.length];
        int[] right_arr = new int[nums.length];
        int[] final_arr = new int[nums.length];

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            left_arr[i] = sum;
            sum += nums[i];
        }

        sum = 0;

        for(int i = nums.length - 1; i >= 0; i--) {
            right_arr[i] = sum;
            sum += nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            final_arr[i] = mod(left_arr[i] - right_arr[i]);
        }

        return final_arr;
    }
}