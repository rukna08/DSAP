class Solution {
    public String interpret(String command) {
        
        String parsed_string = "";

        for(int i = 0; i < command.length(); ) {

            if(command.charAt(i) == 'G') {
                
                parsed_string += "G";
                
                i++;

            } else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                
                parsed_string += "o";

                i += 2;

            } else if(command.charAt(i + 0) == '('
                   && command.charAt(i + 1) == 'a'
                   && command.charAt(i + 2) == 'l'
                   && command.charAt(i + 3) == ')') {

                parsed_string += "al";
                
                i += 4;
                
            }

        }

        return parsed_string;

    }
}
