class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length-1;
        int low = 0;
        int high = k-1;
        int sum = 0;
        
        for(int i = 0; i<k; i++){
            sum = sum +nums[i];
        }
        int maxSum = sum;

        while (high<n){
            low++;
            high++;
            sum  = sum - nums[low-1] + nums[high];
           
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        return (double) maxSum/k;
    }
}