package Q_10;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in percent): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the loan period (in years): ");
        int loanPeriod = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 / (1 + monthlyInterestRate), numberOfPayments));

        double totalPayment = monthlyPayment * numberOfPayments;
        System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n", totalPayment);

        scanner.close();
    }
}
