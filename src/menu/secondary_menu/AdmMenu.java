package menu.secondary_menu;

import java.util.Scanner;

import employees.Administrators;
import employees.Employees;
import menu.Management;
import menu.main.MainMenu;

public class AdmMenu implements MainMenu{
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

    private void listAllFood() {
        System.out.println("Food expenditure in kilograms:");
        for (int food : Management.getListMonthlyFoods()) {
            System.out.println(food);
        }
    }
    private void listAllCleaning() {
        System.out.println("Expenses for cleaning habitats:");
        for (int cleaning : Management.getListMonthlyCleaning()) {
            System.out.println(cleaning);
        }
    }
    private void listAllConsultations() {
        System.out.println("Expenses for veterinary consultations: ");
        for (int consultations : Management.getlistMonthlyConsultations()) {
            System.out.println(consultations);
        }
    }

    public void expenseList() {
        System.out.println("=================");
        listAllFood();
        listAllCleaning();
        listAllConsultations();
        monthlyExpenses();
        System.out.println("=================");
    }

    public void cleanAllList() {
        Management.getListMonthlyFoods().clear();
        Management.getListMonthlyCleaning().clear();
        Management.getlistMonthlyConsultations().clear();
        Management.getSalaryList().clear();
    }

    public void monthlyExpenses() {
        double totMonthlyFood = 0;
        double totMonthlyCleaning = 0;
        double totMonthlyConsultations = 0;
        double totSalary = 0;
        double totAnimalsPrice;
        double totMonthlyPrice;
        for (int i = 0; i < Management.getListMonthlyFoods().size(); i++) {
            totMonthlyFood += Management.getListMonthlyFoods().get(i);
        }
        
        for (int i = 0; i < Management.getListMonthlyCleaning().size(); i++) {
            totMonthlyCleaning += Management.getListMonthlyCleaning().get(i);
        }
        
        for (int i = 0; i < Management.getlistMonthlyConsultations().size(); i++) {
            totMonthlyConsultations += Management.getlistMonthlyConsultations().get(i);
        }
    
        totAnimalsPrice = (totMonthlyFood * getFoodKg()) + totMonthlyCleaning + totMonthlyConsultations;

        System.out.println("Monthly food expenditure:R$" + totMonthlyFood);
        System.out.println("Spending on maintenance of monthly habitats:R$" + totMonthlyCleaning);
        System.out.println("Spending on monthly consultations:R$" + totMonthlyConsultations);

        for (int i = 0; i < Management.getSalaryList().size(); i++) {
            totSalary += Management.getSalaryList().get(i);
        }
        totMonthlyPrice = totSalary + totAnimalsPrice;
        System.out.println("Total expenses including employee salaries and general maintenance:R$" + totMonthlyPrice);

        cleanAllList();
    }
}
