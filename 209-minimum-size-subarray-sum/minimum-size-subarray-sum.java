class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int n = nums.length;
        int minLengthWindow = Integer.MAX_VALUE;
        int sum = 0;

        
        
        while(high<=nums.length-1){
            sum = sum + nums[high];
            high ++;

            while(sum>=target){
                
            int currentWindowSize = high - low;
            if (currentWindowSize < minLengthWindow){
                minLengthWindow =  currentWindowSize;
            }
            

            sum = sum - nums[low];
            low++;
        }
        }

        
        

        
        if (minLengthWindow == Integer.MAX_VALUE) {
            return 0;
        } else {
            return minLengthWindow;
        }


    }
}