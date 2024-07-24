package menu.employees;

import java.util.Scanner;

import animals.Animal;
import employees.Employees;
import employees.Veterinarians;
import menu.MainMenu;
import menu.Management;

public class VeterinariansMenu extends MainMenu {
    private Veterinarians veterinarians = new Veterinarians();
    private String alternativeQuery;
    private int queryValeu;
    Scanner input = new Scanner(System.in);

    public VeterinariansMenu() {
        this.veterinarians = new Veterinarians();
        this.queryValeu = 500;
    }

    public String getAlternativeQuery() {
        return alternativeQuery;
    }
    public void setAlternativeQuery(String alternativeQuery) {
        this.alternativeQuery = alternativeQuery;
    }
    public int getQueryValeu() {
        return queryValeu;
    }
    public void setQueryValue(int queryValeu) {
        this.queryValeu = queryValeu;
    }

    @Override
    public void displayMenu() {
        System.out.println("==== REGISTERED VETERINARIANS ====");
        System.out.println("Name: ");
        veterinarians.setName(input.nextLine());
        System.out.println("CPF: ");
        veterinarians.setCpf(input.nextLong());
        System.out.println("Salary:");
        veterinarians.calculatorSalary();
        System.out.println("Function: " + veterinarians.getFunction());
        Management.registerVet(veterinarians);
    }

    public void listVeterinarians() {
        for (Employees employees : Management.getVetList()) {
            if (employees instanceof Veterinarians) {
                Veterinarians vet = (Veterinarians) employees;
                System.out.println("Name: " + vet.getName());
                System.out.println("CPF: " + vet.getCpf());
                System.out.println("Function: " + vet.getFunction());
                System.out.println("Hours Monthly: " + vet.getWorkedHours());
                System.out.println("Salary: " + vet.getSalary());
                System.out.println("==========================");
            }
        }
    }

    public void dailyVetForm() {
        for (int i = 0; i < Management.getAnimalsList().size(); i++) {
            Animal animal = Management.getAnimalsList().get(i);
            Employees employees = Management.getVetList().get(i % Management.getVetList().size());
            System.out.println("=================");
            System.out.println(animal.getSpecies());
            if (employees instanceof Veterinarians) {
                Veterinarians vet = (Veterinarians) employees;
                System.out.println(vet.getName());
                System.out.println("=================");
                System.out.println("Did this animal require consultation?");
                setAlternativeQuery(input.nextLine());
                if (alternativeQuery.equals("Yes")) {
                    System.out.println(getQueryValeu());
                    Management.registerConsultations(getQueryValeu());
                }else {
                    setQueryValue(0);
                    Management.registerConsultations(getQueryValeu());
                }
            }
        }
    }
}
