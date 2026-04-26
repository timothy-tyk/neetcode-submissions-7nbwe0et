class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0) return 0;
       Set<Integer> numsSet = new HashSet<>();
       for(int i: nums){
        numsSet.add(i);
       }
       
       int maxCount = 0;
       for(int i:numsSet){
        if(!numsSet.contains(i-1)){
          int current = i;
          int count=1;
          while(numsSet.contains(current+1)){
            current++;
            count++;
          }
          maxCount = Math.max(maxCount, count);
        }
       }
       return maxCount;

    }
}

/*
put each number into an array arr (index = number)
iterate through array to find longest consecutive sequence
- if arr[i]!=""
*/
