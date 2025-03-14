package Q_07;
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        int weight = scanner.nextInt();

        System.out.print("Enter your height in centimeters: ");
        int height = scanner.nextInt();

        double heightInMeters = height / 100.0; // Convert height to meters
        double bmi = weight / (heightInMeters * heightInMeters); // BMI formula

        System.out.printf("Your BMI is: %.2f%n", bmi);

        scanner.close();
    }
}
