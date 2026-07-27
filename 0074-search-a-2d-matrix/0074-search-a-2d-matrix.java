class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rows= matrix.length;
       int columns= matrix[0].length;
       int start=0;
       int end= rows*columns -1;

       while(start<=end){
        int mid= start+(end-start)/2;
        int row= mid/columns;
        int column= mid%columns;
        int midvalue= matrix[row][column];
        if(midvalue==target){
            return true;
        }else if(midvalue<target){
            start=mid+1;
        }else{
            end=mid-1;
        }
       }
       return false;
    }
}