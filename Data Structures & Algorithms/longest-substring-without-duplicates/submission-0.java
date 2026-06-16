class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int maxLength =0;
        int left=0;
        for(int right=0;right<s.length();right++){
          while(charSet.contains(s.charAt(right))){
            charSet.remove(s.charAt(left));
            left++;
          }
          charSet.add(s.charAt(right));
          maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}

/**
 * add char to set
 * if set does not contain char, 
 *    - add char to set
 *    - maxLength++;
 * else
 *    - remove first char from current string
 *    - reassess?
 *    - 
 */