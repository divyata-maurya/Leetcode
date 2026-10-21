import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> list= new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int complement= target- nums[i];

            if(list.containsKey(complement)){
                return new int[] {list.get(complement),i};
            }
            list.put(nums[i],i);
        }
        return new int[] {};

    }
}