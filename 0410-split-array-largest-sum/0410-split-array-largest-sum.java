class Solution {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;
        
        for (int i = 0; i < nums.length; i++) {
            left = Math.max(left, nums[i]);  
            right += nums[i];                
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, k, mid)) {
                right = mid;  
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canSplit(int[] nums, int k, int maxSum) {
        int count = 1;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (currentSum + nums[i] > maxSum) {
                count++;
                currentSum = nums[i];
                if (count > k) return false;
            } else {
                currentSum += nums[i];
            }
        }
        return true;
    }
}