package management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName, String name, int NINumber, double salary) {
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
