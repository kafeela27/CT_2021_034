package Q_03;
import Q_01.cat;
import Q_01.Dog;
import Q_01.pet;
import java.util.ArrayList;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (or STOP to end): ");
            String name = input.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter type (c for cat, d for dog): ");
            String type = input.nextLine();

            pet pet = type.equalsIgnoreCase("c") ? new cat() : new Dog();
            pet.setName(name);
            pets.add(pet);
        }
        System.out.println("\n--- List of Cats ---");
        for (pet p : pets) {
            if (p instanceof cat) {
                System.out.println("Name: " + p.getName());
            }
        }
        System.out.println("\n--- List of Dogs ---");
        for (pet p : pets) {
            if (p instanceof Dog) {
                System.out.println("Name: " + p.getName());
            }
        }
    }
}

