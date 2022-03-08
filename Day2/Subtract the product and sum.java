// Optimized Approach

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        int number = 0;
        while(n > 0){
        number = n % 10;
        n = n / 10;
            sum = sum + number;
            product = product * number;
        }
        return product - sum;
    }
}
