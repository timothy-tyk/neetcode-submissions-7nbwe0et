  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
          int j=i+1;
          int k=nums.length-1;
          while(j<k){
            // System.out.println(String.format("%s, %s, %s", nums[i], nums[j], nums[k]));
            if(-nums[i]>nums[j]+nums[k]){
              j++;
            }else if(-nums[i]<nums[j]+nums[k]){
              k--;
            }else{
              List<Integer> toAdd = new ArrayList<>();
              toAdd.add(nums[i]);
              toAdd.add(nums[j]);
              toAdd.add(nums[k]);
              result.add(toAdd);
              j++;
            //   break;
            }
          }
        }
        return result.stream().distinct().toList();
    }
}
/*
- sort nums ascendingly
- for each index i, find j and k so that nums[i]=-(nums[j]+nums[k])

*/
