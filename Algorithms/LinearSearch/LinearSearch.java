package LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {5,6,9,11,13};
        int target = 11;

        int result = linearSearch(nums, target);

        System.out.println("Element found at Index: " + result);
    }

    private static int linearSearch(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target) return i;
        }

        return -1;
    }
}
