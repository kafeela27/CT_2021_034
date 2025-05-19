package Q_02;
import java.util.Scanner;

public class Q_02 {
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }

        number = Math.abs(number);

        int count = 0;
        while (number > 0) {
            number /= 10; // Remove the last digit
            count++; // Increment the digit count
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        // Repeatedly ask for input until a negative number is entered
        do {
            System.out.print("Enter an integer (negative to stop): ");
            input = scanner.nextInt();
            if (input >= 0) {
                int digitCount = countDigits(input);
                System.out.println("The number " + input + " has " + digitCount + " digits.");
            }
        } while (input >= 0);

        System.out.println("Program terminated.");
        scanner.close();
    }
}
