class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for(String string : operations) {
            x += (44 - string.charAt(1));
        }

        return x;
    }
}
