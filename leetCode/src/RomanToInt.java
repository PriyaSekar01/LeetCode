import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        // Step 1: Create a map to store Roman numeral values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
    int result = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            int current = romanMap.get(s.charAt(i));

            if (i < length - 1 && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result;
    }public static void main(String[] args) {
        RomanToInt solution = new RomanToInt();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}