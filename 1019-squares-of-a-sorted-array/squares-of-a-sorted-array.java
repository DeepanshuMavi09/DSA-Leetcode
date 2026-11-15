class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int n = nums.length;
        int j = n-1;
        int result[] = new int[nums.length]; 
        int position = nums.length-1;

         while(i<=j){
            if(nums[i]*nums[i] < nums[j]*nums[j]){
                result[position] = nums[j]*nums[j];
                j--;
            }
            else{
                result[position] = nums[i]*nums[i];
                i++ ;
            }
            position--;
         }
         return result;
    }
}