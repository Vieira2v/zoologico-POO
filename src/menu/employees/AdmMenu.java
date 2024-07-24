package menu.employees;

import java.util.Scanner;

import animals.Animal;
import employees.Administrators;
import employees.Employees;
import menu.MainMenu;
import menu.Management;

public class AdmMenu extends MainMenu{
    private Administrators adm;
    private float foodKg;
    Scanner input = new Scanner(System.in);

    public AdmMenu() {
        this.adm = new Administrators();
        this.foodKg = 26.0f;
    }

    public float getFoodKg() {
        return foodKg;
    }   
    
    @Override
    public void displayMenu() {
        System.out.println("==== REGISTERED ADMINISTRATORS ====");
        System.out.println("Name: ");
        adm.setName(input.nextLine());
        System.out.println("CPF: ");
        adm.setCpf(input.nextLong());
        System.out.println("Salary:");
        adm.calculatorSalary();
        System.out.println("Function: " + adm.getFunction());
        Management.registerAdm(adm);
    }

    public void listAdministrators() {
        for (Employees employees : Management.getAdmList()) {
            if (employees instanceof Administrators) {
                Administrators adm = (Administrators) employees;
                System.out.println("Name: " + adm.getName());
                System.out.println("CPF: " + adm.getCpf());
                System.out.println("Function: " + adm.getFunction());
                System.out.println("Hours Monthly: " + adm.getWorkedHours());
                System.out.println("Salary: " + adm.getSalary());
                System.out.println("==========================");
            }
        }
    }

    public void dailyAdmForm() {
        for (int i = 0; i < Management.getAnimalsList().size(); i++) {
            Animal animal = Management.getAnimalsList().get(i);
            System.out.println("=================");
            System.out.println(animal.getSpecies());
            System.out.println("=================");
            System.out.println("Food expenditure in kilograms: " + Management.getListMonthlyFoods().get(i));
            System.out.println("Expenses for cleaning habitats: " + Management.getListMonthlyCleaning().get(i));
            System.out.println("Expenses for veterinary consultations: " + Management.getlistMonthlyConsultations().get(i));
        }
        System.out.println("=================");
        monthlyExpenses();
    }

    public void monthlyExpenses() {
        double monthlyPriceFood = 0;
        int monthlyPriceCleaning = 0;
        int monthlyPriceConsultations = 0;
        double totSalary = 0;
        double totAnimalsPrice;
        double totMonthlyPrice;
        for (int i = 0; i < Management.getAnimalsList().size(); i++) {
            monthlyPriceFood += getFoodKg() * Management.getListMonthlyFoods().get(i);
            monthlyPriceCleaning += Management.getListMonthlyCleaning().get(i);
            monthlyPriceConsultations += Management.getlistMonthlyConsultations().get(i);
        }
        System.out.println("Monthly food expenditure:R$" + monthlyPriceFood);
        System.out.println("Spending on maintenance of monthly habitats:R$" + monthlyPriceCleaning);
        System.out.println("Spending on monthly consultations:R$" + monthlyPriceConsultations);

        totAnimalsPrice = monthlyPriceFood + monthlyPriceCleaning + monthlyPriceConsultations;
    
        for (int i = 0; i < Management.getSalaryList().size(); i++) {
            totSalary += Management.getSalaryList().get(i);
        }
        totMonthlyPrice = totSalary + totAnimalsPrice;
        System.out.println("Total expenses including employee salaries and general maintenance:R$" + totMonthlyPrice);
    }
}
