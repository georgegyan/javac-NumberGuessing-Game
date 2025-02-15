import java.util.Scanner;

public class NumberGuessing {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Randomly generate a number between 1 and 100
        int targetNumber = (int) (Math.random() * 100) + 1;

        int guess = 0;
        int attempts = 0;

        // Game loop
        while (guess != targetNumber) {
            System.out.print("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}

