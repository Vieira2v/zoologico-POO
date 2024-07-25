package menu.secondary_menu;

import java.util.Scanner;

import animals.Animal;
import animals.Vertebrates;
import menu.Management;
import menu.main.MainMenu;

public class AnimalMenu implements MainMenu{
    Scanner input = new Scanner(System.in);
    Vertebrates animal = new Vertebrates();


    @Override
    public void displayMenu() {
        System.out.println("==== REGISTERED ANIMALS ====");
        System.out.println("Specie: ");
        animal.setSpecies(input.nextLine());
        System.out.println("Animal class: ");
        animal.setAnimalClass(input.nextLine());
        System.out.println("Years: ");
        animal.setYear(input.nextInt());
        helpMenu();
        Management.registerAnimal(animal);
    }

    public void helpMenu() {
        System.out.println("==============");
        System.out.println("Options, food");
        System.out.println("==============");
        System.out.println("Vegetables | Meat | Vegetables and Meats");
        System.out.println("Insects  |  Fruits   |   Leafs");
        System.out.println("Seeds and Grains | Fishs | Nectar");
        System.out.println("Food: ");
        input.nextLine();
        animal.setFood(input.nextLine());
        animal.foodClassification();
        System.out.println("==============");
        System.out.println("Options, habitats");
        System.out.println("==============");
        System.out.println("Forest | Deserts | Fresh Water");
        System.out.println("Marine  |  Grasslands   | Tundra");
        System.out.println("Mountains | Wetlands |");
        System.out.println("Habitats: ");
        animal.setHabitats(input.nextLine());
    }

    public void listAnimals() {
        for (Animal animal : Management.getAnimalsList()) {
            if (animal instanceof Vertebrates) {
                Vertebrates vert = (Vertebrates) animal;
                System.out.println("Species: " + vert.getSpecies());
                System.out.println("Animal class: " + vert.getAnimalClass());
                System.out.println("Years: " + vert.getYear());
                System.out.println("Habitat: " + vert.getHabitats());
                System.out.println("Foods: " + vert.getFood());
                animal.foodClassification();
                System.out.println("==========================");
            }
        }
    }
}
