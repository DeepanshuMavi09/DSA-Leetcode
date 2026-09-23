class Solution {
    public int singleNumber(int[] nums) {
        int XorSum = 0;
        for(int n : nums){
            XorSum = XorSum ^ n;
        }
        return XorSum;
    }
}