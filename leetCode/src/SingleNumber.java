public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solution = new SingleNumber();

        // Example 1
        int[] nums1 = {2, 2, 1};
        System.out.println("Input: [2, 2, 1], Output: " + solution.singleNumber(nums1));

        // Example 2
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Input: [4, 1, 2, 1, 2], Output: " + solution.singleNumber(nums2));

        // Example 3
        int[] nums3 = {1};
        System.out.println("Input: [1], Output: " + solution.singleNumber(nums3));
    }
}
