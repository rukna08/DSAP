class Solution {
    public int findCenter(int[][] edges) {
        int greatest = 0;

        for(int i = 0; i < edges.length; i++) {
            for(int j = 0; j < edges[i].length; j++) {
                if(edges[i][j] >= greatest) greatest = edges[i][j];
            }
        }

        int table[] = new int[greatest + 1];

        for(int i = 0; i < greatest + 1; i++) {
            table[i] = 0;
        }

        for(int i = 0; i < edges.length; i++) {
            for(int j = 0; j < edges[i].length; j++) {
                table[edges[i][j]]++;
            }
        }

        int max_index = 0;
        int max_number = 0;

        for(int i = 0; i < table.length; i++) {
            if(table[i] >= max_number) {
                max_number = table[i];
                max_index = i;
            }
        }

        return max_index;
    }
}
