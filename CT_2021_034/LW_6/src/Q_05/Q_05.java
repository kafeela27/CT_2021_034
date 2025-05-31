package Q_05;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Dog {
    private String name;
    private String type;
    private double weight;

    public Dog(String name, double weight) {
        this.name = name;
        this.type = "Dog";
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Weight: " + weight + " kg";
    }
}

class Cat {
    private String name;
    private String type;
    private String coatColor;

    public Cat(String name, String coatColor) {
        this.name = name;
        this.type = "Cat";
        this.coatColor = coatColor;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Coat Color: " + coatColor;
    }
}

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Object> animals = new ArrayList<>();

        while (true) {
            System.out.print("Enter the type of animal (Dog/Cat) or 'exit' to finish: ");
            String animalType = scanner.nextLine().trim();

            if (animalType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter the name of the animal: ");
            String name = scanner.nextLine().trim();

            if (animalType.equalsIgnoreCase("dog")) {
                System.out.print("Enter the weight of the dog (in kg): ");
                double weight = 0;
                while (true) {
                    try {
                        weight = Double.parseDouble(scanner.nextLine().trim());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("Invalid input. Please enter a valid number for weight: ");
                    }
                }
                animals.add(new Dog(name, weight));

            } else if (animalType.equalsIgnoreCase("cat")) {
                System.out.print("Enter the coat color of the cat: ");
                String coatColor = scanner.nextLine().trim();
                animals.add(new Cat(name, coatColor));
            } else {
                System.out.println("Invalid animal type. Please enter 'Dog' or 'Cat'.");
            }
        }

        System.out.println("\nAnimal Information:");
        for (Object animal : animals) {
            System.out.println(animal.toString());
        }

        // Create an array to hold only Dog objects
        Dog[] dogArray = new Dog[animals.size()];
        int dogCount = 0;

        // Populate the dogArray with Dog objects
        for (Object animal : animals) {
            if (animal instanceof Dog) {
                dogArray[dogCount++] = (Dog) animal;
            }
        }

        // Calculate average, minimum, and maximum weights
        if (dogCount > 0) {
            double totalWeight = 0;
            double minWeight = Double.MAX_VALUE;
            double maxWeight = Double.MIN_VALUE;

            for (int i = 0; i < dogCount; i++) {
                double weight = dogArray[i].getWeight();
                totalWeight += weight;
                if (weight < minWeight) {
                    minWeight = weight;
                }
                if (weight > maxWeight) {
                    maxWeight = weight;
                }
            }

            double averageWeight = totalWeight / dogCount;

            System.out.printf("Average Weight of Dogs: %.2f kg%n", averageWeight);
            System.out.printf("Minimum Weight of Dogs: %.2f kg%n", minWeight);
            System.out.printf("Maximum Weight of Dogs: %.2f kg%n", maxWeight);
        } else {
            System.out.println("No dogs were entered.");
        }

        scanner.close();
    }
}
