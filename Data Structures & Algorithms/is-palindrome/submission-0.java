  class Solution {
    public boolean isPalindrome(String s) {
        String toCheck = s.replaceAll(" ", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i=0;i<toCheck.length()/2;i++){
          int p2index = toCheck.length()-1-i;
          if(toCheck.charAt(i)!=toCheck.charAt(p2index)) return false;
        }
        return true;
    }
}

/**
- remove whitespace
- convert all char to lowercase
- 2 pointers approach?
- point to index 0 and index n-1 char, if same, continue
    - next, point to index 1 and index n-2
    - if same, continue
    - if not same, return false
*/