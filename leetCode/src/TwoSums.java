import java.util.HashMap;

public class TwoSums {

        public int[] twoSums(int[] nums,int target) {
            HashMap<Integer, Integer> map = new HashMap();
            for(int i=0; i<nums.length;i++) {
                int complement= target - nums[i];
                if(map.containsKey(complement))
                    return new int[] {map.get(complement), i};
                map.put(nums[i],i);

            }
            return null;

        }
public static void main(String args[]) {
    int nums[] = {2, 7, 5, 6};
    int target = 9;
    TwoSums sum = new TwoSums();
    int[] result = sum.twoSums(nums, target);

    // Printing the elements of the array
    if (result != null) {
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    } else {
        System.out.println("No solution found.");
    }
}


}
