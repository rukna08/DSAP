class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }

        /*

            key : value
        
            180 : Mary
            165 : John
            170 : Emma
        
        */

        // 180, 165, 170 - before sorting

        Arrays.sort(heights);

        // 165, 170, 180 - after sorting

        String[] list = new String[names.length];

        int list_index = 0;
        for(int heights_index = heights.length - 1; heights_index >= 0; heights_index--) {
            list[list_index] = map.get(heights[heights_index]);

            list_index++;
        }

        return list;

    }
}
