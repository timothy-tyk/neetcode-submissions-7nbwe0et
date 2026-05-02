class Solution {
    public int[] twoSum(int[] numbers, int target) {
      Arrays.sort(numbers);
      int maxIndex = 0;
      int minIndex = 0;
      for(int i=numbers.length-1; i>0 ; i--){
        if(numbers[0]+numbers[i]<=target){
          maxIndex = i;
          break;
        }
      }
      System.out.println(maxIndex);
      while(minIndex<maxIndex){
        if(numbers[minIndex]+numbers[maxIndex]>target){
          maxIndex--;
        }else if(numbers[minIndex]+numbers[maxIndex]<target){
          minIndex++;
        }else{
          break;
        }
      }
      return new int[]{minIndex+1,maxIndex+1};
        
    }
}
/*
- skip numbers that are larger than target
- sort ascendingly
- for numbers, find cutoff point -> nums[0]+nums[n-1]<target
- p1 at start, p2 at end, check if nums[p1]+nums[p2]==target
    - if result > target, p2--
    - if result < target, p1++
- return [p1+1,p2+1], since 1 indexed (starts from 1)
*/