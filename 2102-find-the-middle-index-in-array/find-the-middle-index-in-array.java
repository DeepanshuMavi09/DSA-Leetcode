class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        // 1--- filling rightSum array--
        leftSum[0] = nums[0];
        for(int i= 1; i<n; i++){
            leftSum[i] = leftSum[i-1] + nums[i];
        }

        // 2. filling righSum array---
        rightSum[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            rightSum[i] = rightSum[i+1] + nums[i];
        }

        // comparing --
        for(int i =0; i<n; i++){
            if(rightSum[i]== leftSum[i]){
                return i;
            }
        }
        return -1;

    }
}