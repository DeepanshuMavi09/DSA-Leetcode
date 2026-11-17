class Solution {
    public void moveZeroes(int[] nums) {
        int high = 0;
        int low = 0;
        

        while(high<= nums.length-1){
            if(nums[high] != 0){
                int temp = nums[high];
                nums[high] = nums[low];
                nums[low] = temp;
                low++;
                high++;
            }
            else{
                high++;
            }
        }
        return;
    }
}