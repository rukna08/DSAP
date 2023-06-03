class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;

        int row_length = mat.length;
        int col_length = mat[0].length;

        for(int i = 0; i < row_length; i++) {
            for(int j = 0; j < col_length; j++) {

                if(i == j || i + j == col_length - 1) {

                    sum += mat[i][j];

                }

            }
        }

        return sum;

    }
}
