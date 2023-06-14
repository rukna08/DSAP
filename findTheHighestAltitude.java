class Solution {
    public int largestAltitude(int[] gain) {
        
        int result = 0;

        int altitude[] = new int[gain.length + 1];
        altitude[0] = result;

        int ai = 1;
        for(int g : gain) {

            result += g;

            altitude[ai] = result;

            ai++;

        }

        
        int max = -999999;

        for(int a : altitude) {
            if(a > max) max = a;
        }

        return max;

    }
}
