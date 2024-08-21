public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        for (int factor : new int[] {2, 3, 5}) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isUgly(6));
        System.out.println(isUgly(14));
    }
}
