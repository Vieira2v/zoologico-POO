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

    private void helpMenu() {
        System.out.println("==============");
        System.out.println("Options, food");
        System.out.println("==============");
        System.out.println("1-Vegetables");
        System.out.println("2-Meat");
        System.out.println("3-Vegetables and Meats");
        System.out.println("4-Insects");
        System.out.println("5-Fruits");
        System.out.println("6-Leafs");
        System.out.println("7-Seeds and Grains");
        System.out.println("8-Fishs");
        System.out.println("9-Nectar");
        System.out.println("Food: ");
        input.nextLine();
        animal.setAlternativeFood(input.nextInt());
        if (animal.getAlternativeFood() < 1 || animal.getAlternativeFood() > 9) {
            while (animal.getAlternativeFood() < 1 || animal.getAlternativeFood() > 9) {
                System.out.println("ERROR! Enter one of the options above!!");
                System.out.println("==============");
                System.out.println("Options, food");
                System.out.println("==============");
                System.out.println("1-Vegetables");
                System.out.println("2-Meat");
                System.out.println("3-Vegetables and Meats");
                System.out.println("4-Insects");
                System.out.println("5-Fruits");
                System.out.println("6-Leafs");
                System.out.println("7-Fruits");
                System.out.println("8-Fishs");
                System.out.println("9-Nectar");
                System.out.println("Food: ");
                input.nextLine();
                animal.setAlternativeFood(input.nextInt());
            }
        }
        animal.foodClassification();
        System.out.println("==============");
        System.out.println("Options, habitats");
        System.out.println("==============");
        System.out.println("1-Forest");
        System.out.println("2-Deserts");
        System.out.println("3-Fresh Water");
        System.out.println("4-Marine");
        System.out.println("5-Grasslands");
        System.out.println("6-Tundra");
        System.out.println("7-Mountains");
        System.out.println("8-Wetlands");
        System.out.println("Habitats: ");
        animal.setAlternativeHabitats(input.nextInt());
        if (animal.getAlternativeHabitats() < 1 || animal.getAlternativeHabitats() > 8) {
            while (animal.getAlternativeHabitats() < 1 || animal.getAlternativeHabitats() > 8) {
                System.out.println("ERROR! Enter one of the options above!!");
                System.out.println("==============");
                System.out.println("Options, habitats");
                System.out.println("==============");
                System.out.println("1-Forest");
                System.out.println("2-Deserts");
                System.out.println("3-Fresh Water");
                System.out.println("4-Marine");
                System.out.println("5-Grasslands");
                System.out.println("6-Tundra");
                System.out.println("7-Mountains");
                System.out.println("8-Wetlands");
                System.out.println("Habitats: ");
                animal.setAlternativeHabitats(input.nextInt());
            }
        }
        animal.habitatsTypes();
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
