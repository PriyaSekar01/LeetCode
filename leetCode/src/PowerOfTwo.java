

public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();

        // Test cases
        System.out.println(powerOfTwo.isPowerOfTwo(1));
        System.out.println(powerOfTwo.isPowerOfTwo(16));
        System.out.println(powerOfTwo.isPowerOfTwo(3));
        System.out.println(powerOfTwo.isPowerOfTwo(32));
        System.out.println(powerOfTwo.isPowerOfTwo(18));
    }
    }
