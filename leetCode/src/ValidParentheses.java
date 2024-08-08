import java.util.Stack;

public class ValidParentheses {
        public  boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{') {
                    st.push(c);
                } else if (c == ')') {
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else if (c == ']') {
                    if (!st.isEmpty() && st.peek() == '[') {
                        st.pop();
                    } else {
                        return false;
                    }
                } else if (c == '}') {
                    if (!st.isEmpty() && st.peek() == '{') {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
            return st.isEmpty();
        }
        public static void main (String args[]){
            ValidParentheses solution = new ValidParentheses();

            // Test cases
            String test1 = "()[]{}";
            String test2 = "([{}])";
            String test3 = "(]";
            String test4 = "([)]";
            String test5 = "{[]}";

            // Printing the results
            System.out.println("Test 1: " + solution.isValid(test1));
            System.out.println("Test 2: " + solution.isValid(test2));
            System.out.println("Test 3: " + solution.isValid(test3));
            System.out.println("Test 4: " + solution.isValid(test4));
            System.out.println("Test 5: " + solution.isValid(test5));
        }
}
