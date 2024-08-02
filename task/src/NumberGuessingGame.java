import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < numberToGuess) {
                System.out.println("Higher! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
            }
        }
        scanner.close();
    }
}
