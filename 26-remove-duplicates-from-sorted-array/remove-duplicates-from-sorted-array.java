class Solution {
    public int removeDuplicates(int[] nums) {
       int i = 0;
       int j = 1;
       int n = nums.length;

    //    yha pr 2 pointer use ki h 
    // i ko stable rkha h and j ko move kr rhe h 
    // condition 1--if i and j dono equal h mtlb duplicate value h toh j ko increase kr denge 
       while(j<n){
        if(nums[i] == nums[j]){
            j++;

        }
        // condition 2---agar i and j equal nhi h toh uniques elment h then hm phele i ko increase krenge and then j ki value ko i ke andar insert kr denge and again i ki value ko stable kr denge and j ko move krkenge  
        else if (nums[i] != nums[j]){
            i++;
            nums[i] = nums[j];
            j++;
        }
       }

    //  i hmare index value h lekin hme return integer value krni h ki kitne unique element h so hm return i+1 krenge.
       return i+1; 
    }
}