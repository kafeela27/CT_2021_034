package Q_05;

    import java.util.Scanner;

    public class Q_05 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter temperature in degrees Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (5.0 / 9.0) * (fahrenheit - 32);

            System.out.println(fahrenheit + " degrees Fahrenheit is equivalent to " + celsius + " degrees Celsius.");

            scanner.close();
        }
    }

