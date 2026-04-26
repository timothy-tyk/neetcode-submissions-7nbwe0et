class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0) return 0;
       int[] arr = new int[]{nums.length};
       List<Integer> numList = new ArrayList<>();
       for(int i:nums){
        numList.add(i);
       }
       List<Integer> sortedNumList = numList.stream().sorted().distinct().toList();
       int count = 1;
       int maxCount = 1;
       for(int i=0;i<sortedNumList.size()-1;i++){
        if(sortedNumList.get(i+1)-sortedNumList.get(i)==1){
          count++;
        }else{
          maxCount = Math.max(maxCount, count);
          count=1;
        }
       }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}

/*
put each number into an array arr (index = number)
iterate through array to find longest consecutive sequence
- if arr[i]!=""
*/
