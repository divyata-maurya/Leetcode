class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first_occurence= Isfirst(nums, target);
        int second_occurence= Islast(nums, target);

        int[] ans= {first_occurence, second_occurence};
        return ans;
    }
    private int Isfirst(int[] nums, int target){
        int start= 0;
        int end= nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    private int Islast(int[] nums, int target){
        int start= 0;
        int end= nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                start=mid+1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}