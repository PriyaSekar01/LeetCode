public class ExcelColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        int length = columnTitle.length();

        for (int i = 0; i < length; i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {
        String columnTitle1 = "A";
        System.out.println(columnTitle1 + " -> " + titleToNumber(columnTitle1)); // Output: 1

        String columnTitle2 = "AB";
        System.out.println(columnTitle2 + " -> " + titleToNumber(columnTitle2)); // Output: 28

        String columnTitle3 = "ZY";
        System.out.println(columnTitle3 + " -> " + titleToNumber(columnTitle3)); // Output: 701
    }
}

