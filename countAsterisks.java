class Solution {
    public int countAsterisks(String s) {
        boolean bar_started = false;

        int asterisk_count = 0;

        char current_character = ' ';

        for(int i = 0; i < s.length(); i++) {
            current_character = s.charAt(i);
            
            if(current_character == '|' && bar_started == false) {
                bar_started = true;
            }
            else if(current_character == '|' && bar_started == true) {
                bar_started = false;
            }

            if(current_character == '*' && bar_started == false) {
                asterisk_count++;
            }
        }

        return asterisk_count;
    }
}
