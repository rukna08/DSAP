class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;

        for (int candy : candies) {
            maxCandies = Math.max(candy, maxCandies);
        }

        List<Boolean> returnList = new ArrayList<>();
        for (int candy : candies) {
            returnList.add(candy + extraCandies >= maxCandies);
        }

        return returnList;
    }
}
