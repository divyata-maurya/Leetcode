/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak= peak(mountainArr);
        int ans_index= binarySearch(mountainArr, target, 0,peak, true);
        if (ans_index!=-1) return ans_index;
        return binarySearch(mountainArr, target, peak+1, mountainArr.length()-1, false);
    }
    private int peak(MountainArray arr){
        int start=0;
        int end= arr.length()-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if (arr.get(mid) > arr.get(mid+1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    private int binarySearch(MountainArray arr, int target,int start, int end, boolean asc){
        while(start<=end){
            int mid= start+(end-start)/2;
            int val = arr.get(mid);

            if(val==target){
                return mid;
            
            }if (asc) {
                if (val < target) start = mid + 1;
                else end = mid - 1;
            } else {
                if (val < target) end = mid - 1;
                else start = mid + 1;
            }
        }
        return -1;
    }
}