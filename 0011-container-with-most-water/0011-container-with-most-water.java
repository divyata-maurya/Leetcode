class Solution {
    public int maxArea(int[] height) {
        int n= height.length;

        int start=0;
        int end= n-1;
        int max=0;

        while(start<end){
            int width= end- start;
            int minHeight= Math.min(height[start],height[end]);
           

            int maxArea= width * minHeight;
            max= Math.max(max,maxArea);

            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}