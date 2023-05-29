class Solution {
    public String toLowerCase(String s) {
        char str[] = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                str[i] = (char)((int)s.charAt(i) + 32);
            } else {
                str[i] = s.charAt(i);
            }
        }

        return new String(str);
    }
}
