class Solution {
    static boolean is_point_inside_circle(int _x, int _y, int x, int y, int radius) {
        double distance = Math.sqrt(Math.pow((_x - x), 2) + Math.pow((_y - y), 2));
        if(distance <= radius) return true;
        return false;
    }

    public int[] countPoints(int[][] points, int[][] queries) {
        int counts[] = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int x = queries[i][0];
            int y = queries[i][1];
            int r = queries[i][2];

            for(int j = 0; j < points.length; j++) {
                int _x = points[j][0];
                int _y = points[j][1];

                if(is_point_inside_circle(_x, _y, x, y, r)) counts[i]++;
            }
        }
        return counts;
    }
}
