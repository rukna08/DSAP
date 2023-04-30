class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] final_array = new int[2 * n];

        for(int i = 0; i < n; i++) {
            final_array[i*2] = nums[i];
            final_array[i*2+1] = nums[i+n];
        }

        return final_array;
    }
}
