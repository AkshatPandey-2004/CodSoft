import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemptsPerRound = 5;
        boolean playAgain = true;

        while (playAgain) {
            int difficulty = chooseDifficulty(scanner);
            int minNumber = 1;
            int maxNumber = 100;

            switch (difficulty) {
                case 1:
                    maxNumber = 50;
                    attemptsPerRound = 8;
                    break;
                case 2:
                    maxNumber = 100;
                    attemptsPerRound = 5;
                    break;
                case 3:
                    maxNumber = 200;
                    attemptsPerRound = 3;
                    break;
                default:
                    maxNumber = 100;
                    attemptsPerRound = 5;
            }

            int randomNumber = generateRandomNumber(minNumber, maxNumber);
            int numAttempts = 0;
            boolean guessedCorrect = false;

            System.out.println("Welcome to the Guessing Game!");

            while (!guessedCorrect && numAttempts < attemptsPerRound) {
                System.out.printf("Guess a number between %d and %d (%d attempts left): ", minNumber, maxNumber, attemptsPerRound - numAttempts);
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    guessedCorrect = true;
                    System.out.println("Congratulations! You guessed the number in " + (numAttempts + 1) + " attempts.");
                } else if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                if (difficulty > 1) {
                    if (numAttempts < attemptsPerRound - 1) {
                        System.out.println("Hint: The number is " + (randomNumber > guess ? "higher" : "lower") + " than your guess.");
                    }
                }

                numAttempts++;
            }

            if (!guessedCorrect) {
                System.out.println("You ran out of attempts. The number was: " + randomNumber);
            }

            System.out.println("Do you want to play again? (y/n): ");
            char choice = scanner.next().charAt(0);
            playAgain = (choice == 'y' || choice == 'Y');
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int chooseDifficulty(Scanner scanner) {
        System.out.println("Choose difficulty level:");
        System.out.println("1. Easy (50 numbers, 8 attempts)");
        System.out.println("2. Medium (100 numbers, 5 attempts)");
        System.out.println("3. Hard (200 numbers, 3 attempts)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
}
