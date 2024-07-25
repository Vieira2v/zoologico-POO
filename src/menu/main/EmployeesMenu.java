package menu.main;

import java.util.Scanner;

import menu.secondary_menu.AdmMenu;
import menu.secondary_menu.KeepersMenu;
import menu.secondary_menu.VeterinariansMenu;

public class EmployeesMenu implements MainMenu{
    private int option;
    Scanner input = new Scanner(System.in);

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
    
    public EmployeesMenu() {
        setOption(7);
    }

    @Override
    public void displayMenu() {
        System.out.println("======= EMPLOYEES =======");
        System.out.println("1-Register a new Keepers.");
        System.out.println("2-Register a new Veterinarians.");
        System.out.println("3-Register a new Administrators.");
        System.out.println("4-Current Keepers.");
        System.out.println("5-Current Veterinarians.");
        System.out.println("6-Current Administrators.");
        System.out.println("7-Keeper's daily form.");
        System.out.println("8-Veterinarian's daily form.");
        System.out.println("9-Administrator's daily form.");
        System.out.println("0-Close.");
        setOption(input.nextInt());
    }
    
    public void choiceOfRole() {
        KeepersMenu keepMenu = new KeepersMenu();
        VeterinariansMenu vetMenu = new VeterinariansMenu();
        AdmMenu admMenu = new AdmMenu();
        switch (getOption()) {
            case 1:
                keepMenu.displayMenu();
                break;
            case 2:
                vetMenu.displayMenu();
                break;
            case 3:
                admMenu.displayMenu();
                break;
            case 4:
                keepMenu.listKeepers();
                break;
            case 5:
                vetMenu.listVeterinarians();
                break;
            case 6:
                admMenu.listAdministrators();
                break;
            case 7:
                keepMenu.dailyCaretakerForm();
                break;
            case 8:
                vetMenu.dailyVetForm();
                break;
            case 9:
                admMenu.expenseList();
                break;
        }
    }
}
