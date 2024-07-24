package employees;

public abstract class Employees {
    private String name;
    private Long cpf;
    private double hoursSalary;
    private double salary;
    private String function;
    private int hoursMonthly;
    private int workedHours;

    public abstract void calculatorSalary();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public double getHoursSalary() {
        return hoursSalary;
    }
    public void setHoursSalary(double hoursSalary) {
        this.hoursSalary = hoursSalary;
    }
    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }
    public int getHoursMonthly() {
        return hoursMonthly;
    }
    public void setHoursMonthly(int hoursMonthly) {
        this.hoursMonthly = hoursMonthly;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}
