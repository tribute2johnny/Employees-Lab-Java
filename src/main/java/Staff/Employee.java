package Staff;

public class Employee {

    private String name;

    private int NINumber;

    private double salary;

    public Employee(String name, int NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary() {
        salary = salary + (salary * 0.1);

        return salary;
    }

    public double payBonus() {
        salary = salary + (salary * 0.01);
        return salary;
    }
}
