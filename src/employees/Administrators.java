package employees;

import java.util.Scanner;

import menu.Management;

public class Administrators extends Employees{
    Scanner input = new Scanner(System.in);

    public Administrators() {
        setHoursSalary(13.9);
        setHoursMonthly(208);
        setFunction("Administrators");
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
