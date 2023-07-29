class Solution {
    static void update_history(List<Integer> history, int x, int y) {
        history.add(x);
        history.add(y);
    }

    static boolean did_i_come_here_previously(List<Integer> history, int x, int y) {
        for(int i = 0; i < history.size(); i+=2) {
            if(x == history.get(i) && y == history.get(i+1)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;

        List<Integer> history = new ArrayList<Integer>();

        update_history(history, x, y);

        for(int i = 0; i < path.length(); i++) {
            char current_direction = path.charAt(i);

            switch(current_direction) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            }

            if(did_i_come_here_previously(history, x, y)) {
                return true;
            }

            update_history(history, x, y);
        }

        return false;
    }
}
