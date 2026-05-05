class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0;
        int p2 = heights.length-1;
        int maxVol=0;
        while(p1<p2){
          int vol = Math.min(heights[p1],heights[p2])*(p2-p1);
          if(maxVol<vol){
            maxVol = vol;
          }
          
          if(heights[p1]<heights[p2]){
            p1++;
          }else{
            p2--;
          }
        }
        return maxVol;
    }
}
/*
- 2 pointer solution
- p1 at start, p2 at end
- calculate volume = min(p1,p2)*(p2-p1)
- if heights[p1]>heights[p2], p2--;
    else p1++;

*/