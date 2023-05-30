class SubrectangleQueries {
    int[][] rect;

    public SubrectangleQueries(int[][] rectangle) {
        int row_length = rectangle.length;
        int col_length = rectangle[0].length;

        rect = new int[row_length][col_length];
        for(int i = 0; i < row_length; i++) {
            rect[i] = new int[col_length];
        }

        for(int i = 0; i < row_length; i++) {
            for(int j = 0; j < col_length; j++) {
                rect[i][j] = rectangle[i][j];
            }
        }
    }
    
    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for(int i = row1; i <= row2; i++) {
            for(int j = col1; j <= col2; j++) {
                rect[i][j] = newValue;
            }
        }
    }
    
    public int getValue(int row, int col) {
        return rect[row][col];
    }
}
