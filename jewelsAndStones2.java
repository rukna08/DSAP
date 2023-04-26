class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;
        
        HashMap<Character, Character> jewelMap = new HashMap<>();
        
        for(int i = 0; i < jewels.length(); i++) {
            jewelMap.put(jewels.charAt(i), jewels.charAt(i));
        }

        for(int i = 0; i < stones.length(); i++) {
            if(jewelMap.containsKey(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}