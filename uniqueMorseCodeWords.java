
class Solution {

    static String get_morse_from_alphabet(char c) {
        switch(c) {
            case 'a': return ".-";
            case 'b': return "-...";
            case 'c': return "-.-.";
            case 'd': return "-..";
            case 'e': return ".";
            case 'f': return "..-.";
            case 'g': return "--.";
            case 'h': return "....";
            case 'i': return "..";
            case 'j': return ".---";
            case 'k': return "-.-";
            case 'l': return ".-..";
            case 'm': return "--";
            case 'n': return "-.";
            case 'o': return "---";
            case 'p': return ".--.";
            case 'q': return "--.-";
            case 'r': return ".-.";
            case 's': return "...";
            case 't': return "-";
            case 'u': return "..-";
            case 'v': return "...-";
            case 'w': return ".--";
            case 'x': return "-..-";
            case 'y': return "-.--";
            case 'z': return "--..";
        }

        return "";
    }

    static String get_morse_from_string(String s) {
        
        String result = "";
        char current_character = s.charAt(0);
        for(int i = 0; i < s.length(); i++) {
            current_character = s.charAt(i);

            result += get_morse_from_alphabet(current_character);
        }

        return result;
    }

    public int uniqueMorseRepresentations(String[] words) {
        if(words.length == 1) return 1;
        if(words.length == 0) return 0;

        HashSet<String> hs = new HashSet<>();

        String[] morses = new String[words.length];

        int result = 0;

        for(int i = 0; i < words.length; i++) {

            morses[i] = get_morse_from_string(words[i]);

            if(!hs.contains(morses[i])) {
                hs.add(morses[i]);
                result++;
            }

        }

        return result;
    }
}
