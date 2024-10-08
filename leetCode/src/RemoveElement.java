public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
    public static void main(String args[]){
        RemoveElement r = new RemoveElement();
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int k1 = r.removeElement(nums1, val1);
        System.out.println("Output: " + k1 + ", nums = " + java.util.Arrays.toString(nums1));

        // Example 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int k2 = r.removeElement(nums2, val2);
        System.out.println("Output: " + k2 + ", nums = " + java.util.Arrays.toString(nums2));
    }
}
