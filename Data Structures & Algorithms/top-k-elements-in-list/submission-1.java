class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      int[] result = new int[k];
      List<Integer> resultList = new ArrayList<>();     
      Map<Integer, Integer> numsCount = new HashMap<>();
      for(int n : nums){
        if(numsCount.get(n)==null){
          numsCount.put(n, 1);
        }else{
          int count = numsCount.get(n);
          numsCount.put(n,count+1);
        }
      }
        List<Integer> topValues = numsCount.values()
        .stream()
        .sorted(Comparator.reverseOrder())
        .limit(k)
        .toList();
        
        int j=0;
        for(int i=0 ; i<topValues.size();i++){
          for(Integer key: numsCount.keySet()){
            if(numsCount.get(key)== topValues.get(i) && !resultList.contains(key)){
              resultList.add(key);
              j+=1;
              break;
            }
          }
        }
        for(int i=0;i<resultList.size();i++){
          result[i] = resultList.get(i);
        }
        return result;
        
    }
}

/**
put integers in hashmap (key=integer, value=count)
get hashmap values, sort, pick first k values
get corresponding keys, add to a []
*/