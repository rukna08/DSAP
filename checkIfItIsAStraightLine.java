class Solution {
    static float get_slope(int x1, int y1, int x2, int y2) {
        float rise = y2 - y1;
        float run = x2 - x1;

        if(run == 0) {
            return Float.POSITIVE_INFINITY;
        }

        return rise / run;
    }

    public boolean checkStraightLine(int[][] coordinates) {
        float first_slope = get_slope(
            coordinates[0][0],
            coordinates[0][1],
            coordinates[1][0],
            coordinates[1][1]
        );

        for(int i = 1; i < coordinates.length - 1; i++) {
            int x1 = coordinates[i][0];
            int y1 = coordinates[i][1];
            int x2 = coordinates[i+1][0];
            int y2 = coordinates[i+1][1];

            float current_slope = get_slope(x1, y1, x2, y2);
            
            if(current_slope != first_slope) return false;
        }

        return true;
    }
}
