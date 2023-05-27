class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int matches = 0;

        for(List<String> item : items) {

            String type  = item.get(0);
            String color = item.get(1);
            String name  = item.get(2);

            if(ruleKey.equals("type")) {
                if(ruleValue.equals(type)) {
                    matches++;
                }
            }
            else if(ruleKey.equals("color")) {
                if(ruleValue.equals(color)) {
                    matches++;
                }
            }
            else if(ruleKey.equals("name")) {
                if(ruleValue.equals(name)) {
                    matches++;
                }
            }

        }

        return matches;
    
    }
}
