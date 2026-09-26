class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        //  yha pr MIN_VALUE of integer = - infinity
        int maxSum = Integer.MIN_VALUE;

        // 1--sum 
        for(int i = 0; i<n; i++){
            sum = sum + nums[i];
            //  2-- update maxSum
            if(sum > maxSum){
                maxSum = sum;
                //  3. if maxSum < 0 --- toh hm sum ko 0 kr denge and next i ki vlaue se start krenge 
            }if (sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
}