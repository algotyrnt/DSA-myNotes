public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {5,6,9,11,13};
        int target = 11;

        int result = binarySearch(nums, target);

        System.out.println("Element found at Index: " + result);
    }

    private static int binarySearch(int[] nums, int target) {
        int starting = 0;
        int ending = nums.length-1;

        while (starting <= ending){
            int mid = (starting+ending)/2;

            if(nums[mid] == target) return mid;

            if (target < nums[mid]){
                ending = mid - 1;
            }else {
                starting = mid + 1;
            }
        }

        return -1;
    }
}
