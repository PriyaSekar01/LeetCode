public class ReverseInteger {

    public int reverse(int x) {
        int result = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);

        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (result > (Integer.MAX_VALUE - pop) / 10) {
                return 0;
            }

            result = result * 10 + pop;
        }

        return result * sign;
    }
    public static void main(String args[]){
        ReverseInteger reverseInteger = new ReverseInteger();
    int x1 = 123;
        System.out.println("Input: " + x1 + ", Output: " + reverseInteger.reverse(x1));
    int x2 = -123;
        System.out.println("Input: " + x2 + ", Output: " + reverseInteger.reverse(x2));

    int x3 = 120;
        System.out.println("Input: " + x3 + ", Output: " + reverseInteger.reverse(x3));
}
}
