package com.jegan.assignment.employees;

/**
 * The Manager class extends Employee and adds department details.
 */
public class Manager extends Employee {
    private String department;

    public Manager() {}

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    /** Gets the department name */
    public String getDepartment() {
        return department;
    }

    /** Sets the department name */
    public void setDepartment(String department) {
        this.department = department;
    }

    /** Displays manager-specific information */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
