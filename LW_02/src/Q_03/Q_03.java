package Q_03;

    import java.util.Scanner;

    public class Q_03 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter temperature in degrees Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (1.8 * celsius) + 32;

            System.out.println(celsius + " degrees Celsius is equivalent to " + fahrenheit + " degrees Fahrenheit.");

            scanner.close();
        }
    }

