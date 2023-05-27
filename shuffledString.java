class Solution {
    public String restoreString(String s, int[] indices) {
        char output[] = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            output[indices[i]] = s.charAt(i);
        }

        return new String(output);
    }
}
