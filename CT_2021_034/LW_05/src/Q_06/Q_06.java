
package Q_06;

import java.util.Random;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100);
        int guessNumber;
        int attempts = 0;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I have selected a random number between 1 and 100.");
        do {
            System.out.print("Enter your guess: ");
            guessNumber =scanner.nextInt();
            attempts++;

            if (guessNumber>secretNumber) {
                System.out.println(" Higher. Try again");
            }
            else if(guessNumber< secretNumber){
                System.out.println("Lower. Try again ");
            }else {
                System.out.println("Congratulations! You guessed the secretNumber correctly in "+ attempts +" attempts.\nThe secretNumber is "+ secretNumber);
            }

        }while (guessNumber!=secretNumber);
        scanner.close();
    }
}