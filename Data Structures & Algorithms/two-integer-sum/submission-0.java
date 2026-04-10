 class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int b=nums.length-1;
        int[] result = new int[2];
        while(a<b){
        for(int i =a;i<b;i++){
          if(nums[i]+nums[b]==target) {
            result[0]=i;
            result[1]=b;
          }
        }
        
        b--;
    }
    return result;
    }
  
}

/*
Is this a 2 pointer problem?
pointer A start from front, pointer B start from end
    for(A=0;A<B;A++){
    check nums[A]+numb[B]==target
    if true, return [A,B]
    }

    B--
*/
