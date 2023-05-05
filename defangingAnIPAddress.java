class Solution {
    public String defangIPaddr(String address) {
        int dotLength = 0;

        for(int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') dotLength++;
        }

        char[] defangedAddress = new char[address.length() - dotLength + (dotLength*3)];

        int j = 0;
        for(int i = 0; i < address.length(); i++) {

            if(address.charAt(i) == '.') {
                defangedAddress[j]   = '[';
                defangedAddress[++j] = '.';
                defangedAddress[++j] = ']';
            } else {
                defangedAddress[j] = address.charAt(i);
            }
            
            j++;
        }

        return String.valueOf(defangedAddress);
    }
}
