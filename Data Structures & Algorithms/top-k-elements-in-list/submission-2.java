class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer, Integer> freqMap = new HashMap<>();
      for(int i : nums){
        if(freqMap.get(i)==null){
          freqMap.put(i,1);
        }else{
          int freq = freqMap.get(i);
          freqMap.put(i, freq+1);
        }
      }

      PriorityQueue pq = new PriorityQueue<>(
        (a,b)->freqMap.get(a)-freqMap.get(b)
      );

      for(int i : freqMap.keySet()){
        pq.add(i);
        if(pq.size()>k) pq.poll();
      }
      int[] result = new int[k];
      for(int i=0;i<k;i++){
        result[i] = (int) pq.poll();
      }
      return result;
    }
}

/**
put integers in hashmap (key=integer, value=count)
priorityqueue of hashmap, sorted descendingly
add hashmap keys into priorityqueue
if priorityqueue size>k, remove least frequent 
add priorityqueue to result int[]

*/