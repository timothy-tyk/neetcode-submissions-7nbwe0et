class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<Integer> ignoreIndex = new ArrayList<>();
        List<String> toAddtoResult=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
          if(!ignoreIndex.contains(i)){
          toAddtoResult.add(strs[i]);
          Map<Character, Integer> countMapI = createHashMapCharacterCount(strs[i]);
          for(int j=i+1;j<strs.length;j++){
            if(strs[i].length() == strs[j].length()){
              Map<Character, Integer> countMapJ = createHashMapCharacterCount(strs[j]);
              if(countMapI.equals(countMapJ)){
                toAddtoResult.add(strs[j]);
                ignoreIndex.add(j);
              }
            }
          }

          result.add(toAddtoResult);
          toAddtoResult = new ArrayList<>();
        }
        }
        return result;
    }

    public Map<Character, Integer> createHashMapCharacterCount(String str){
      Map<Character, Integer> countMap = new HashMap<>();
          for(Character c : str.toCharArray()){
            if(countMap.get(c)!=null){
              int val = countMap.get(c);
              countMap.put(c, val+1);
            }else{
              countMap.put(c, 1);
            }
          }
          return countMap;
    }
}

/*
pick string, move string to array
make hashmap1 {key=char, value=count}
check next string, if length is same
    make hashmap2 {key=char, value=count}
    compare with hashmap1, if same, add to array
    move string to array
    add string index to an ignore list, to skip duplicates
*/
