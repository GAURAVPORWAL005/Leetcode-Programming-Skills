// Brute Force Approach

import java.util.*;
class Solution {
    public double average(int[] a) {
        Arrays.sort(a);
        int sum = 0;
        double ans = 0;
        for(int i=1;i<a.length-1;i++){
            sum = sum + a[i];
        }
        ans = sum / (double)(a.length-2);
        return ans;
        
    }
}
