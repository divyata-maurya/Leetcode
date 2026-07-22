class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first_occurence= occurence(nums,target,true);
        int last_occurence= occurence(nums,target,false);
        int [] ans= {first_occurence, last_occurence};
        return ans;
        
    }
    private static int occurence(int[]nums, int target, boolean isFirst){
        int start=0;
        int end= nums.length-1;
        int bound=-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                bound=mid;
                if(isFirst){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return bound;
    }
}