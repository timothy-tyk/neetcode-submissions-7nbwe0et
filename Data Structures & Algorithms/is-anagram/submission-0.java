class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character, Integer> countMap = new HashMap<>();
      for(int i=0;i<s.length();i++){
        if(countMap.get(s.charAt(i))==null){
        countMap.put(s.charAt(i), 1);
        }else{
          int count = countMap.get(s.charAt(i));
          countMap.put(s.charAt(i),count+1);
        }
      }

      for(int i=0;i<t.length();i++){
        if(countMap.get(t.charAt(i))==null){
          return false;
        }else{
          int count = countMap.get(t.charAt(i));
          if(count<=0){
            countMap.remove(t.charAt(i));
          }else{
            countMap.put(t.charAt(i),count-1);
          }
        }
      }

      return !countMap.values().stream().anyMatch(v -> v>0);

    }
}
/*
1. Iterate through s
2. add every element (char) into countMap = HashMap<char,int>
3. if new element, value = 1, else value ++

4. Iterate through t
5. for every element, check the countMap
6. if exists, value --, else return false since chars mismatch

7. Iterate through countMap
8. if any value >0, return false
9. else return true
*/