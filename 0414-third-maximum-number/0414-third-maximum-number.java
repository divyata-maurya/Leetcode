class Solution {
    public int thirdMax(int[] nums) {
        long f_max = Long.MIN_VALUE;
        long s_max = Long.MIN_VALUE;
        long t_max = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num == f_max || num == s_max || num == t_max  ){
                continue;
            }
            if (num > f_max) {
                t_max = s_max;
                s_max = f_max;
                f_max = num;
            } else if ( num > s_max) {
                t_max = s_max;
                s_max = num;
            } else if (num > t_max) {
                t_max = num;
            }
        }
        return t_max ==  Long.MIN_VALUE ? (int) f_max : (int) t_max;
    }
}