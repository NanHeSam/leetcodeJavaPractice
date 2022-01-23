class Solution031 {
    public void nextPermutation(int[] nums) {
        int n = nums.length - 1;
        int i = n - 1;
        // travers from the right, find the first digit that is less then the right digit
        while (i >= 0 && nums[i] >= nums[i+1])  {
            i--;
        }
        
        // travers from right again and find the first digit that is greater than the digit above, swap them
        // optimize thougth, can use binary search since it's sorted
        int j = n;
        if (i >= 0) {
            while  (nums[j]<=nums[i]) {
                j--;
            }
            swap(nums,i, j);
        }
        
        // reverse all the digit after ith index
        i++;
        j = n;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
