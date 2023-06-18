class Solution {
    
    public int numberOfBeams(String[] bank) {
        
        List<Integer> device_counts = new ArrayList<>();

        for(String s : bank) {
            int count = 0;
            
            for(char c : s.toCharArray()) {
                if (c == '1') count++;
            }

            if(count != 0) device_counts.add(count);
        }

        int output = 0;

        for(int i = 0; i < device_counts.size() - 1; i++) {
            output += device_counts.get(i) * device_counts.get(i + 1);
        }

        return output;

    }

}
