package management;

import Staff.Employee;

public class Director extends Manager {

    private double budget;

    private double salary;

    public Director(String deptName, String name, int NINumber, double salary, double budget) {
        super(deptName, name, NINumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }


}
