class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct1 = nums[0];
        int maxProduct2 = nums[n-1];
        int prefixProduct = 1;
        int suffixProduct = 1;

        for( int i = 0; i<n; i++){
            prefixProduct = prefixProduct * nums[i];
            if(prefixProduct > maxProduct1){
                maxProduct1 = prefixProduct;
            }
            if(prefixProduct == 0){
                prefixProduct = 1;
            }
        }
        for( int i = n-1; i>=0; i--){
            suffixProduct = suffixProduct * nums[i];
            if(suffixProduct > maxProduct2){
                maxProduct2 = suffixProduct;
            }
            if(suffixProduct == 0){
                suffixProduct = 1;
            }
        }
        if(maxProduct1 > maxProduct2){
            return maxProduct1;
        }else if(maxProduct1 == maxProduct2){
            return maxProduct1;
        }else{
            return maxProduct2;
        }
    }
}