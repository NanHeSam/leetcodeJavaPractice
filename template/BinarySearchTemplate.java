/**
 * Hello
 */
public class BinarySearchTemplate {

    private static int binarySearch(int[] arr, int l, int r, int target) {
        while (l <= r) {
            int mid = l + (r-l) / 2;
            if (arr[mid] <= target) {
                l = mid + 1;
            } else if (arr[mid] > target) {
                r = mid - 1;
            } 
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,2,2,3};
        int index = binarySearch(arr, 0, arr.length - 1, 2);
        System.out.println(index);
    }
}
