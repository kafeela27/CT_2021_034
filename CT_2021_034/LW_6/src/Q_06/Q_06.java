package Q_06;
import java.util.ArrayList;
import java.util.Scanner;

class Dog {
    private String name;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Dog - Name: " + name + ", Weight: " + weight + " kg";
    }
}

class Cat {
    private String name;
    private String coatColor;

    public Cat(String name, String coatColor) {
        this.name = name;
        this.coatColor = coatColor;
    }

    public String getName() {
        return name;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public String toString() {
        return "Cat - Name: " + name + ", Coat Color: " + coatColor;
    }
}

public class Q_06 {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("5. Show Cats");
            System.out.println("6. Show Dogs");
            System.out.println("0. Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Goodbye!");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter cat name: ");
                    String catName = scanner.nextLine();
                    System.out.print("Enter cat coat color: ");
                    String coatColor = scanner.nextLine();
                    cats.add(new Cat(catName, coatColor));
                    System.out.println("Cat added.");
                    break;
                case 2:
                    System.out.print("Enter dog name: ");
                    String dogName = scanner.nextLine();
                    System.out.print("Enter dog weight (kg): ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();
                    dogs.add(new Dog(dogName, weight));
                    System.out.println("Dog added.");
                    break;
                case 3:
                    System.out.print("Enter cat name to remove: ");
                    String removeCatName = scanner.nextLine();
                    boolean catRemoved = false;
                    for (int i = 0; i < cats.size(); i++) {
                        if (cats.get(i).getName().equalsIgnoreCase(removeCatName)) {
                            cats.remove(i);
                            catRemoved = true;
                            System.out.println("Cat removed.");
                            break;
                        }
                    }
                    if (!catRemoved) {
                        System.out.println("Cat not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter dog name to remove: ");
                    String removeDogName = scanner.nextLine();
                    boolean dogRemoved = false;
                    for (int i = 0; i < dogs.size(); i++) {
                        if (dogs.get(i).getName().equalsIgnoreCase(removeDogName)) {
                            dogs.remove(i);
                            dogRemoved = true;
                            System.out.println("Dog removed.");
                            break;
                        }
                    }
                    if (!dogRemoved) {
                        System.out.println("Dog not found.");
                    }
                    break;
                case 5:
                    if (cats.isEmpty()) {
                        System.out.println("No cats in the list.");
                    } else {
                        System.out.println("Cats:");
                        for (Cat c : cats) {
                            System.out.println(c);
                        }
                    }
                    break;
                case 6:
                    if (dogs.isEmpty()) {
                        System.out.println("No dogs in the list.");
                    } else {
                        System.out.println("Dogs:");
                        for (Dog d : dogs) {
                            System.out.println(d);
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
