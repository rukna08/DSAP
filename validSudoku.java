class Solution {

    static boolean is_sub_block_fine(char[][] board, int ii, int jj) {
        HashSet<Character> set = new HashSet<>();
        for(int i = ii; i <= ii + 2; i++) {
            for(int j = jj; j <= jj + 2; j++) {
                char current_character = board[i][j];
                if(current_character != '.') {
                    if(set.contains(current_character)) {
                        return false;
                    } else {
                        set.add(current_character);
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        
        // top
        boolean is_top_left_fine      = is_sub_block_fine(board, 0, 0);
        boolean is_top_middle_fine    = is_sub_block_fine(board, 0, 3);
        boolean is_top_right_fine     = is_sub_block_fine(board, 0, 6);
        
        // middle
        boolean is_middle_left_fine   = is_sub_block_fine(board, 3, 0);
        boolean is_middle_middle_fine = is_sub_block_fine(board, 3, 3);
        boolean is_middle_right_fine  = is_sub_block_fine(board, 3, 6);

        // bottom
        boolean is_bottom_left_fine   = is_sub_block_fine(board, 6, 0);
        boolean is_bottom_middle_fine = is_sub_block_fine(board, 6, 3);
        boolean is_bottom_right_fine  = is_sub_block_fine(board, 6, 6);

        // row

        for(int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    if(set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }

        // col

        for(int j = 0; j < 9; j++) {
            HashSet<Character> set = new HashSet<>();
            for(int i = 0; i < 9; i++) {
                if(board[i][j] != '.') {
                    if(set.contains(board[i][j])) {
                        return false;
                    } else {
                        set.add(board[i][j]);
                    }
                }
            }
        }

        boolean result =       is_top_left_fine 
                            && is_top_middle_fine
                            && is_top_right_fine
                            && is_middle_left_fine
                            && is_middle_middle_fine
                            && is_middle_right_fine
                            && is_bottom_left_fine
                            && is_bottom_middle_fine
                            && is_bottom_right_fine;

        return result;
    }
}
