// Brute force Approach

import java.util.*;
class Solution {
    public int largestPerimeter(int[] a) {
        Arrays.sort(a);

        for(int i=a.length-3;i>=0;i--){
            if(a[i] + a[i+1] > a[i+2]){
                return a[i] + a[i+1] + a[i+2];
            }
         
        }
        return 0;
    }
}
