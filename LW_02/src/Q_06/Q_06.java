package Q_06;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter born year:");
        int year=scanner.nextInt();

        int age= 2008-year;

        System.out.println("You were born in "+year+" and will be (are) "+age+" this year.");

    }
}

