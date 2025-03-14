package Q_08;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        double volume = (4.0 / 3.0) * (3.14 * Math.pow(radius, 3));

        System.out.printf("The volume of the sphere with radius %.2f is: %.2f%n", radius, volume);

        scanner.close();
    }
}
