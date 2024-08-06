import java.util.Scanner;

public class PalindromeNumber {
        public static boolean isPalindrome(int x) {
                if (x < 0) {
                    return false;
                }

                int rem = 0;
                int original = x;

                while (x > 0) {
                    rem = (rem * 10) + (x % 10);
                    x = x / 10;
                }
                return original == rem;
            }

        public static void main(String[] args) {
//            int x1 = 121;
//            int x2 = -121;
//            int x3 = 10;
//
//            System.out.println("Input: " + x1 + ", Output: " + isPalindrome(x1));
//            System.out.println("Input: " + x2 + ", Output: " + isPalindrome(x2));
//            System.out.println("Input: " + x3 + ", Output: " + isPalindrome(x3));

            Scanner s = new Scanner(System.in);

            System.out.println("enter value :" );
            int x = s.nextInt();
            System.out.println("Input: " + x + ", Output: " + isPalindrome(x));

            }
        }



