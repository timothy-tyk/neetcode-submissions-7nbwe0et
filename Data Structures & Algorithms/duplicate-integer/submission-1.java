class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> countSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(countSet.contains(nums[i])){
              return true;
            }else{
              countSet.add(nums[i]);
            }
        }
        return false;
    }
}
/*
1. iterate through list
2. for every element in the list retrieve element from a Set
    if retrievable, return false
    else, add to Set
*/