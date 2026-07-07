class Solution {
    public int searchInsert(int[] nums, int target) {
        boolean found= false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found= true;
                return i;
            }
        }
        if (found==false){
            for(int i=0;i<nums.length;i++){
                if(nums[i]>target){
                    return i;
                }
            }
        }
        return nums.length;
    }
}