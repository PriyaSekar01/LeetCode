public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) return 0;
        if (num % 9 == 0) return 9;
        return num % 9;
    }
    public static void main(String[] args) {
        AddDigits solution = new AddDigits();

        int num1 = 38;
        System.out.println("Result: " + solution.addDigits(num1)); // Output: 2

        int num2 = 0;
        System.out.println("Result: " + solution.addDigits(num2)); // Output: 0
    }
}
