class Solution {
    
    public String mergeAlternately(String word1, String word2) {
        
        char output_array[] = new char[word1.length() + word2.length()];

        if(word1.length() == word2.length()) {
            
            int j = 0;

            for(int i = 0; i < word1.length(); i++) {

                output_array[j] = word1.charAt(i);

                j++;

                output_array[j] = word2.charAt(i);

                j++;

            }

        } else {

            int min_length = Math.min(word1.length(), word2.length());

            int j = 0;

            for(int i = 0; i < min_length; i++) {

                output_array[j] = word1.charAt(i);

                j++;

                output_array[j] = word2.charAt(i);

                j++;

            }

            String max_string = null;

            if(word1.length() == Math.max(word1.length(), word2.length())) {

                max_string = String.valueOf(word1);

            } else {

                max_string = String.valueOf(word2);

            }

            for(int i = min_length; i < max_string.length(); i++) {

                output_array[j] = max_string.charAt(i);

                j++;

            }

        }

        return new String(output_array);

    }
}
