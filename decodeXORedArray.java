class Solution {
    public int[] decode(int[] encoded, int first) {   
        
        int output[] = new int[encoded.length + 1];
        output[0] = first;
        int output_index = 1;

        for(int target : encoded) {
            for(int i = 0 ; ; i++) {
                
                if((first ^ i) == target) {
                    output[output_index] = i;
                    first = i;
                    output_index++;
                    break;
                }
                
            }
        }

        return output;
    }
}
