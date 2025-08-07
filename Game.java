package my_game;

import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Enter your choice: 0 for Rock, 1 for Paper, 2 for Scissors");
        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Invalid choice! Please enter 0, 1, or 2.");
            return;
        }

        int computerChoice = random.nextInt(3);

        System.out.println("You chose: " + options[userChoice]);
        System.out.println("Computer chose: " + options[computerChoice]);

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }

        scanner.close();
    }
}

