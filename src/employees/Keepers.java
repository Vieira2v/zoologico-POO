package employees;

import java.util.Scanner;

import menu.Management;

public class Keepers extends Employees{
    Scanner input = new Scanner(System.in);

    public Keepers() {
        setHoursSalary(11.5);
        setHoursMonthly(208);
        setFunction("Keepers");
    }

    @Override
    public void calculatorSalary() {
        int negativeHours;
        System.out.println("Hours not worked: ");
        negativeHours = input.nextInt();
        setSalary(getHoursSalary() * (getHoursMonthly() - negativeHours));
        System.out.println("Monthly salary: " + getSalary());
        setWorkedHours(getHoursMonthly() - negativeHours);
        System.out.println("Worked hours: " + getWorkedHours());
        Management.registerSalary(getSalary());
    }
}
