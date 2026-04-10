class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charCount = new int[26];
        Arrays.fill(charCount, 0);
        for(char c : s.toCharArray()){
            charCount[c-'a']++;
        }
        for(char c : t.toCharArray()){
          charCount[c-'a']--;
        }
        for(int i : charCount){
          if(i>0 || i<0) return false;
        }
        return true;
    }
}
