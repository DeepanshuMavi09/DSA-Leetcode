class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int low = 0;
        int high = k-1;
        int count = 0;
        int sum = 0;

        for(int i = 0; i<k; i++){
            sum = sum + arr[i];
        }
        if(sum/k >= threshold){
            count++;
        }

        while(high < arr.length-1){
            high ++;
            sum = sum - arr[low] + arr[high];
            low ++;

            if( sum/k >= threshold ){
                count ++;
            }
            
        }
        return count;

    }
}