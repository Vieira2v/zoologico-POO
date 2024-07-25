package menu.main;

import java.util.Scanner;

import menu.secondary_menu.AnimalMenu;


public class FirstMenu implements MainMenu{
    private int option;
    Scanner input = new Scanner(System.in);

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    public FirstMenu(){
        setOption(7);
    }

    @Override
    public void displayMenu() {
        System.out.println("======= MENU =======");
        System.out.println("1-Register animal.");
        System.out.println("2-List of animals.");
        System.out.println("3-Employee management.");
        System.out.println("0-Close.");
        setOption(input.nextInt());
    }

    public void processExecution() {
        AnimalMenu animalMenu = new AnimalMenu();
        EmployeesMenu employeesMenu = new EmployeesMenu();
        switch (getOption()) {
            case 1:
                animalMenu.displayMenu();
                break;
            case 2:
                animalMenu.listAnimals();
                break;
            case 3:
                employeesMenu.displayMenu();
                employeesMenu.choiceOfRole();
                break;
        }
    }
}
