class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(countMap.get(nums[i])!=null){
              return true;
            }else{
              countMap.put(nums[i],1);
            }
        }
        return false;
    }
}

/*
1. iterate through array 
2. every element added to a hashmap
    if new , add key: number, value: 1
    if exists, value ++, return true
3. return false (since did not return true)
*/