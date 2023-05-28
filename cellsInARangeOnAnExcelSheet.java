class Solution {
    public List<String> cellsInRange(String s) {
        char starting_col_char = s.charAt(0);
        int starting_col_number = s.charAt(1) - '0';

        char ending_col_char = s.charAt(3);
        int ending_col_number = s.charAt(4) - '0';

        List<String> output = new ArrayList<String>();

        while(starting_col_char != ending_col_char + 1) {
            for(int i = starting_col_number; i <= ending_col_number; i++) {
                output.add(starting_col_char + String.valueOf(i));
            }

            starting_col_char++;
        }

        return output;
    }
}
