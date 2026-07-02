class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest= 0;
        for(int i=0 ; i<accounts.length;i++){
            int wealthy=0;
            for (int j=0; j<accounts[i].length;j++){
                wealthy=wealthy+ accounts[i][j];
            }
            if(wealthy > richest){
                richest= wealthy;
            }
        }
        return richest;
    }
}