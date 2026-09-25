class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        // marking-- 1. starting value ko +ve bna rhe h using math.abs se
    
        for(int i = 0; i<n; i++){
            int value = Math.abs(nums[i]);
            int valueOfIndex = value-1;
            
            // marking--
            if(nums[valueOfIndex] > 0){
                nums[valueOfIndex] = - nums[valueOfIndex]; 
            }
            else if(nums[valueOfIndex] < 0){
                ans.add(Math.abs(value));
            }
        }
        return ans;
    }

}