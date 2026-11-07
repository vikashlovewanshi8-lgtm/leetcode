class Solution {
    public int maxArea(int[] height) {
      int maxwater=0;
      int right=height.length-1;
      int left=0;
      while(left<right){
         int width=right-left;
         int minHeight=Math.min(height[right],height[left]);
         int currentArea=width*minHeight;
         maxwater=Math.max(currentArea,maxwater);

         if(height[left]<height[right]){left++;}
         else{right--;}

      }
      return maxwater;
   
    }
}