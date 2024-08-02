public class PalindromeNumber {

    public class Palindrome {
        public static boolean isPalindrome(int x) {
            // Special cases:
            // If the number is negative or ends with 0 (excluding 0 itself), it can't be a palindrome.
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }

            int reversed = 0;
            while (x > reversed) {
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }

            // When the length is an odd number, we can get rid of the middle digit by reversed / 10
            // For example when the input is 12321, at the end of the while loop we get x = 12, reversed = 123,
            // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
            return x == reversed || x == reversed / 10;
        }

        public static void main(String[] args) {
            int x1 = 121;
            int x2 = -121;
            int x3 = 10;

            System.out.println("Input: " + x1 + ", Output: " + isPalindrome(x1));
            System.out.println("Input: " + x2 + ", Output: " + isPalindrome(x2));
            System.out.println("Input: " + x3 + ", Output: " + isPalindrome(x3));
        }
    }

}
