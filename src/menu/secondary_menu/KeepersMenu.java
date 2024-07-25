package menu.secondary_menu;

import java.util.Scanner;

import animals.Animal;
import employees.Employees;
import employees.Keepers;
import menu.Management;
import menu.main.MainMenu;

public class KeepersMenu implements MainMenu{
    private Keepers keepers;
    private String foodAlternative;
    private int foodQtd;
    private String habitatCleaning;
    private int cleaningValue = 0;
    Scanner input = new Scanner(System.in);
    
    public KeepersMenu() {
        this.keepers = new Keepers();
    }

    public String getFoodAlternative() {
        return foodAlternative;
    }

    public void setFoodAlternative(String foodAlternative) {
        this.foodAlternative = foodAlternative;
    }

    public int getFoodQtd() {
        return foodQtd;
    }

    public void setFoodQtd(int foodQtd) {
        this.foodQtd = foodQtd;
    }

    public String getHabitatCleaning() {
        return habitatCleaning;
    }

    public void setHabitatCleaning(String habitatCleaning) {
        this.habitatCleaning = habitatCleaning;
    }

    public int getCleaningValue() {
        return cleaningValue;
    }

    public void setCleaningValue(int cleaningValue) {
        this.cleaningValue = cleaningValue;
    }

    @Override
    public void displayMenu() {
        System.out.println("==== REGISTERED KEEPERS ====");
        System.out.println("Name: ");
        keepers.setName(input.nextLine());
        System.out.println("CPF: ");
        keepers.setCpf(input.nextLong());
        System.out.println("Salary:");
        keepers.calculatorSalary();
        System.out.println("Function: " + keepers.getFunction());
        Management.registerKeeper(keepers);
    }

    public void listKeepers() {
        for (Employees employees : Management.getKeepersList()) {
            if (employees instanceof Keepers) {
                Keepers keep = (Keepers) employees;
                System.out.println("Name: " + keep.getName());
                System.out.println("CPF: " + keep.getCpf());
                System.out.println("Function: " + keep.getFunction());
                System.out.println("Hours Monthly: " + keep.getWorkedHours());
                System.out.println("Salary: " + keep.getSalary());
                System.out.println("==========================");
            }
        }
    }

    public void dailyCaretakerForm() {
        for (int i = 0; i < Management.getAnimalsList().size(); i++) {
            Animal animal = Management.getAnimalsList().get(i);
            Employees employees = Management.getKeepersList().get(i % Management.getKeepersList().size());
            System.out.println("=================");
            System.out.println(animal.getSpecies());
            if (employees instanceof Keepers) {
                Keepers keep = (Keepers) employees;
                System.out.println(keep.getName());
                System.out.println("=================");
                System.out.println("Did you need food replacement?");
                setFoodAlternative(input.nextLine());
                if (getFoodAlternative().equals("Yes")) {
                    System.out.println("Quantity kilograms: ");
                    setFoodQtd(input.nextInt());
                    Management.registerFoods(getFoodQtd());
                    input.nextLine();
                }else {
                    setFoodQtd(0);
                    Management.registerFoods(getFoodQtd());
                }
                System.out.println("Was it necessary to clean the habitat?");
                setHabitatCleaning(input.nextLine());
                if (habitatCleaning.equals("Yes")) {
                    setCleaningValue(230);
                    System.out.println(getCleaningValue());
                    Management.registerCleaning(getCleaningValue());
                }else {
                    setCleaningValue(0);
                    Management.registerCleaning(getCleaningValue());
                }
            }
        }
    }
}
