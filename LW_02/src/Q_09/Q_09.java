package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (R) in percent: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of years (N): ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + (rate / 100), years);
        double moneyEarned = amount - principal;

        System.out.printf("The amount after %d years is: %.2f%n", years, amount);
        System.out.printf("The money earned after %d years is: %.2f%n", years, moneyEarned);

        scanner.close();
    }
}
