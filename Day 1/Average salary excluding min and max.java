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


// Optimized Approach

import java.util.*;
class Solution {
    public double average(int[] a) {
      int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
            if(a[i] < min){
                min = a[i];
            }
            sum = sum + a[i];
            
        }
        return (sum-min-max) / (a.length-2);
    }
}
