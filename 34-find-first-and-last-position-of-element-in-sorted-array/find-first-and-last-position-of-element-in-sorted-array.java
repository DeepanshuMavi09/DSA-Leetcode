class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = -1;
        int last = -1;

        // 1. Find First Occurrence
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                if (nums[mid] == target) first = mid;
                end = mid - 1; // Try left side
            } else {
                start = mid + 1;
            }
        }

        // Agar target mila hi nahi, toh simple [-1, -1] return kar do
        if (first == -1) {
            return new int[]{-1, -1};
        }

        // 2. Find Last Occurrence (Reset Pointers!)
        start = 0; 
        end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                if (nums[mid] == target) last = mid;
                start = mid + 1; // Try right side
            } else {
                end = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}