class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;
        
        HashSet<Character> jewelMap = new HashSet<>();
        
        for(int i = 0; i < jewels.length(); i++) {
            jewelMap.add(jewels.charAt(i));
        }

        for(int i = 0; i < stones.length(); i++) {
            if(jewelMap.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}