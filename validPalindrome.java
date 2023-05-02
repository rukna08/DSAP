class Solution {
    char getLower(char c) {
        if(c >= 65 && c <= 90) {
            return (char)((int)c + 32);
        } else {
            return c;
        }
    }
    
    public boolean isPalindrome(String s) {
        
        // count non-garbage characters
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                count++;
            }
        }
        
        char s2[] = new char[count];
        
        // remove all garbage characters
        
        int j = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                s2[j] = c;
                
                j++;
            }
        }
            
        // make the characters all lower case
        
        for(int i = 0; i < count; i++) {
            s2[i] = getLower(s2[i]);
        }
        
        // check for palindrome with two pointers
        
        int left = 0;
        int right = count - 1;
        
        while(left <= right) {
            
            if(s2[left] != s2[right]) return false;
            
            
            left++;
            right--;
        }
        
        return true;
    }
}
