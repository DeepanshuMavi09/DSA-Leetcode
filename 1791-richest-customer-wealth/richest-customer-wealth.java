class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<m; i++){
            int sum = 0;
            for(int j = 0; j<n; j++){
                int value = accounts[i][j];
                sum = sum + value;
                if(sum> maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}