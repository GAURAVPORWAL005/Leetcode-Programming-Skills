// Brute force
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i] == nums[j] && i < j){
                    count++;
                }
            }
        }
        return count;
    }
}

// Optimised Approach

int result =0;
Map<Integer, Integer> map = new HashMap<>();
for (int i = 0; i < nums.length; i++) {
if (map.containsKey(nums[i])) {
result+=map.get(nums[i]);
map.put(nums[i], map.get(nums[i]) + 1);
} else {
map.put(nums[i], 1);
}
}
return result;
}
