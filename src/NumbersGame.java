import java.util.Scanner;
public class NumbersGame {
    public static void  main(String [] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;
        System.out.println("I've guessed a random number between 1 and 100");
        System.out.println("You have 10 guesses to figure it out!");

        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i>0; i--) {
            System.out.println("You have " + i + " guess(es) left.");
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + ", please try again.");
            }
            if (randomNumber > guess) {
                System.out.println("It's bigger than " + guess + ", please try again.");
            }
            if (randomNumber == guess) {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("You won! Congrats!");
        } else {
            System.out.println("Game over! The number was: " + randomNumber + ".");
        }
    }
}
