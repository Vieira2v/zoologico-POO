package menu;

import java.util.Scanner;

import menu.employees.EmployeesMenu;


public class FirstMenu extends MainMenu{
    Scanner input = new Scanner(System.in);

    public FirstMenu(){
        setOption(7);
    }

    @Override
    public void displayMenu() {
        System.out.println("======= MENU =======");
        System.out.println("1-Register animal.");
        System.out.println("2-Register employee.");
        System.out.println("3-List of animals.");
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
                employeesMenu.displayMenu();
                employeesMenu.choiceOfRole();
                break;
            case 3:
                animalMenu.listAnimals();
                break;
        }
    }
}
