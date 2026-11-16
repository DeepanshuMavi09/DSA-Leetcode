class Solution {
    public int threeSumClosest(int[] nums, int target) {
        

        Arrays.sort(nums);
        
            int maxDif = Integer.MAX_VALUE;
            int resultSum = 0;
        for(int i = 0; i<nums.length-1; i++){

int left = i+1;
            int right = nums.length-1;
            

            while(left<right){

                int sum = nums[i] + nums[left] +nums[right];

                if(sum == target){
                    return sum;
                    
                }
                int diff = Math.abs(sum - target); 
                if(diff<maxDif){
                        maxDif = diff;
                        resultSum = sum;
                }
                if(sum< target){
                    left++;
                }
                else{
                    right--;
                }
                    
                
                
            }


        }
        return resultSum;
    }
}