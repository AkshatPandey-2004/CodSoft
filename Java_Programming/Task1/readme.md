TASK 1
Number Guessing Game

1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.

My Approach

Main Method:

The main method is the entry point of the program.
It initializes a Scanner object to read input from the user.
It defines attemptsPerRound to determine the number of attempts allowed per game.
It sets playAgain to true to start the game loop.

Game Loop:

The outer while loop (while (playAgain)) controls the overall flow of the game. It repeats the game until the player chooses not to play again.

Choose Difficulty:

The chooseDifficulty method presents the user with options to choose the difficulty level.
Depending on the chosen difficulty, the method returns an integer representing the difficulty level.

Difficulty Levels:

Based on the chosen difficulty level, the minNumber, maxNumber, and attemptsPerRound are set accordingly.
There are three difficulty levels: Easy, Medium, and Hard, each with different ranges of numbers to guess from and different numbers of attempts allowed.

Game Logic:

Inside the game loop, a random number is generated within the specified range (minNumber to maxNumber).
The player is prompted to guess the number within the given range.
After each guess, the program provides feedback to the player whether the guess is too high or too low.
If the player guesses the correct number, they win the game.
If the player exhausts all attempts without guessing correctly, they lose the game.

Hints:

In Medium and Hard difficulty levels, hints are provided after each incorrect guess, indicating whether the actual number is higher or lower than the guessed number.
Play Again:

After each game, the player is prompted to play again. If they choose to play again, the game loop continues. Otherwise, the game ends.

Closing Resources:

After the game loop ends, the Scanner object is closed to release system resources.
