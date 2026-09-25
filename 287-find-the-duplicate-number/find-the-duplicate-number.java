class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        //  marking--
        for(int i = 0; i<n; i++){
            int value = Math.abs(nums[i]);
            int markingIndex = nums[value] - 1;

            if(nums[value] > 0){
                nums[value] = - nums[value];
            }
            else if(nums[value] < 0) {
                return Math.abs(value);
           }
        }
        return -1;
    }
}