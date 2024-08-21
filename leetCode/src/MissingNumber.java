public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }
        // XOR all numbers in the array
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {
        // Create an instance of MissingNumber
        MissingNumber solution = new MissingNumber();

        // Example 1
        int[] nums1 = {3, 0, 1};
        System.out.println(solution.missingNumber(nums1)); // Output: 2

        // Example 2
        int[] nums2 = {0, 1};
        System.out.println(solution.missingNumber(nums2)); // Output: 2

        // Example 3
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(solution.missingNumber(nums3)); // Output: 8
    }
}
