class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int m=box.length , n=box[0].length;
        char[][] res= new char[n][m];
        int l=0; //res_col
        //just rotate 90deg
        for(int i=m-1;i>=0;i--){
            int k=0; //res_row
            for(int j=0; j<n; j++ ){
                res[k][l]=box[i][j];
                int d=0;
                if(res[k][l]==".".charAt(0)){
                    for(int q=k; q>d;q--){
 
                        
 
                        if(res[q][l]==".".charAt(0) && res[q-1][l]=="#".charAt(0)){
                            res[q][l]="#".charAt(0);
                            res[q-1][l]=".".charAt(0);
 
                        }
                        
                    }
                    d++;
                }
                k++;
                
            }
            l++;
        }
 
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(res[i][j]);
        //     }
        //     System.out.println();
        // }
        return res;
    }
}
