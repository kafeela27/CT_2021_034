package Q_02;

import Q_01.cat;
import Q_01.Dog;
import Q_01.pet;
import java.util.Scanner;

        public class Q_02 {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                pet[] pets = new pet[100]; // maximum 100 pets
                int count = 0;

                while (true) {
                    System.out.print("Enter pet name (or STOP to end): ");
                    String name = input.nextLine();
                    if (name.equalsIgnoreCase("STOP")) break;

                    System.out.print("Enter type (c for cat, d for dog): ");
                    String type = input.nextLine();

                    pet pet;
                    if (type.equalsIgnoreCase("c")) {
                        pet = new cat();
                    } else {
                        pet = new Dog();
                    }

                    pet.setName(name);
                    pets[count++] = pet;
                }

                for (int i = 0; i < count; i++) {
                    System.out.println("Name: " + pets[i].getName() + ", Type: " + pets[i].getClass().getSimpleName());
                }
            }
        }


