class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        // marking 
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int value = Math.abs(nums[i]);
            int indexPosition = value-1;
            //  ab hmne jo index position btnikli  h value ki us value ko - se mark kr denge 
            if(nums[indexPosition] > 0){
                nums[indexPosition] = - nums[indexPosition];
            }
        }
        // loop ko travel krke dhekna ki konsa index value open h and usme i+1 lgake final answer niklna 
        for(int i = 0; i<n; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}