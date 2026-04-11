class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for(String str: strs){
          char[] chars = str.toCharArray();
          Arrays.sort(chars);
          String sortedString = new String(chars);
          if(result.containsKey(sortedString)){
            List<String> anagrams = result.get(sortedString);
            anagrams.add(str);
          }else{
            List<String> newStrList = new ArrayList<>();
            newStrList.add(str); 
            result.put(sortedString, newStrList);
          }
        }
        return result.values().stream().toList();
    }  
}

/*
create result HashMap of key = String, val = List<String>
pick string, toCharArray and form new String
check result Hashmap if String exists
    if true, add String to List<String> val
    if false, crate new entry in hashmap

return HashMap values as the result
*/