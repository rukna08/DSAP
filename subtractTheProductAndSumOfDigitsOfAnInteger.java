class Solution {
    
    static int get_product(int n) {
        int product = 1;
        
        while(n != 0) {
            int last_digit = n % 10;
            
            product *= last_digit;

            n /= 10;
        }

        return product;
    }

    static int get_sum(int n) {
        int sum = 0;
        
        while(n != 0) {
            int last_digit = n % 10;
            
            sum += last_digit;

            n /= 10;
        }

        return sum;
    }
    
    public int subtractProductAndSum(int n) {
        
        return get_product(n) - get_sum(n);

    }
}
