package Q_01;

public class Q_01 {
    public static void main(String[] args) {
        for (int i = 10; i <= 49; i++) {
            System.out.print(i + " ");
            // Print a new line after every 10 numbers
            if ((i - 10) % 10 == 9) {
                System.out.println();
            }
        }
    }
}
