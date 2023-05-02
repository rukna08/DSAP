class Solution {
  
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      
        List<Boolean> returnList = new ArrayList<>();
      
        for(int i = 0; i < candies.length; i++) {
            boolean hasGreatestNumberOfCandies = true;
            
            int childWithExtra = candies[i] + extraCandies;
            
            for(int j = 0; j < candies.length; j++) {
                if(i != j) {
                    
                    if(candies[j] > childWithExtra) {
                        hasGreatestNumberOfCandies = false;
                        break;
                    }
                  
                }
            }
          
            returnList.add(hasGreatestNumberOfCandies);
        }
        
        return returnList;
    }
}
