package Q_02;

import java.util.Scanner;

    public class Q_02{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter length in centimeters: ");
            double centimeters = scanner.nextDouble();

            double inches = centimeters / 2.54;

            int feet = (int) (inches / 12);
            double remainingInches = inches % 12;

            System.out.println(centimeters + " cm is equivalent to " + feet + " feet and " + remainingInches + " inches.");

            scanner.close();
        }
    }

