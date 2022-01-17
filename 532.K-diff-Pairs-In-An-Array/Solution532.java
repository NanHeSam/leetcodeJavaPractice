import java.util.Arrays;
class Solution532 {
    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = i + 1; 
        int count = 0;
        while (j < nums.length) {
            if (nums[j] - nums[i] == k) {
                count++;
                i++;
                while (i < nums.length && nums[i] == nums[i-1]) i++;
                j = i + 1;
            } else if (nums[j] - nums[i] < k) {
                j++;
            } else {
                i++;
                j = i+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,1,5,4};
        int k = 2;
        int result = findPairs(nums, k);
        System.out.println(result);
    }
}
