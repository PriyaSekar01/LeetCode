public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        // Handle edge case when the input array is empty
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Initialize the prefix with the first string
        String prefix = strs[0];

        // Iterate through each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Compare the current string with the prefix
            while (!strs[i].startsWith(prefix)) {
                // Reduce the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1);

                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        // Return the final prefix found
        return prefix;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2)); // Output: ""
    }
}
