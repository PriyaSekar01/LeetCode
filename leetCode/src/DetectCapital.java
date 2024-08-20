public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        if (word.equals(word.toLowerCase())) {
            return true;
        }
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        DetectCapital solution = new DetectCapital();

        String word1 = "USA";
        System.out.println("Is Capital Use Correct? " + solution.detectCapitalUse(word1)); // Output: true

        String word2 = "FlaG";
        System.out.println("Is Capital Use Correct? " + solution.detectCapitalUse(word2)); // Output: false

        String word3 = "Google";
        System.out.println("Is Capital Use Correct? " + solution.detectCapitalUse(word3)); // Output: true
    }
}
