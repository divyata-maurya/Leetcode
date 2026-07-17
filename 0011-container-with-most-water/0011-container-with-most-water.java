class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end= height.length-1;
        int max_area=0;
        while(start<end){
            int width= end-start;
            if ((width * Math.min(height[start],height[end]))> max_area ){
                max_area= width * Math.min(height[start],height[end]);
            }
            
            if(height[start]< height[end]){
                start++;
            }else end--;
        }
        return max_area;
    }
}