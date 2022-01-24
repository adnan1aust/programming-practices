class Solution {
    public int maximumWealth(int[][] accounts) {
        int len = accounts.length;
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i< len ; i++){
            int len2 = accounts[i].length;
            sum = 0;
            for(int j =0 ; j < len2 ; j++){
                sum = sum + accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}