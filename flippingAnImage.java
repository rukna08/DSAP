class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row_length = image.length;
        int col_length = image[0].length;

        for(int i = 0; i < row_length; i++) {

            int left = 0;
            int right = col_length-1;

            while(left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                
                left++;
                right--;
            }
            
        }

        for(int i = 0; i < row_length; i++) {
            for(int j = 0; j < col_length; j++) {

                if(image[i][j] == 0) image[i][j] = 1;
                else image[i][j] = 0;

            }
        }

        return image;

    }
}
