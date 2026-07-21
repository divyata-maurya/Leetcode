class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int d_count=0;
            while(nums[i]>0){
                d_count++;
                nums[i]= nums[i]/10;
            }
            if(d_count %2==0){
                count++;
            }
        }
        return count;
    }
}