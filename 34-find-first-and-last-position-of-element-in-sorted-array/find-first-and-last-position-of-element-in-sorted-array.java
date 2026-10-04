class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans = -1;


        if(n == 0){
            return new int[]{-1,-1};
        }
        // lower bound = first occurence of the element 
        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid] >= target){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        if( ans == -1 ||nums[ans] != target ){
            return new int[]{-1,-1};
        }

        // for upper bound --and jb hm return kenge toh upperbound -1 value retur krdenge 
        int start2 = 0;
        int end2 = n-1;
        int ans2 = n;

        while(start2<=end2){
            int mid2 =(start2 + end2)/2;

            if(nums[mid2] > target){
                ans2 = mid2;
                end2 = mid2 - 1;
            }
            else{
                start2 = mid2 + 1;
            }

        }
        return new int[]{ans , ans2 -1  };
    }
}