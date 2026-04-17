class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        for (int i=0;i<nums.length;i++){
          int val = 1;
          for(int j=0;j<nums.length;j++){
            if (j==i) continue;
            else{
              val*=nums[j];
            }
          }
          result[i] = val;
        }
        return result;
    }
}  
/**
 * loop nums, if i == index, ignore, 
 * else *= the previous number
 */