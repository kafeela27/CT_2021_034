package Q_04;

    import java.util.Scanner;

    public class Q_04 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your weight in pounds: ");
            double bodyWeight = scanner.nextDouble();

            double calories = bodyWeight * 19;

            System.out.println("You need " + calories + " calories per day.");

            scanner.close();
        }
    }

