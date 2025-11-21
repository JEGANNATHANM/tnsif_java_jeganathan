package com.jegan.assignment.employees;

public class Employee {
	private String name;
    private int employeeId;
    private double salary;

    /** Default constructor */
    public Employee() {}

    /** Parameterized constructor */
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    /** Gets the employee's name */
    public String getName() {
        return name;
    }

    /** Sets the employee's name */
    public void setName(String name) {
        this.name = name;
    }

    /** Gets the employee ID */
    public int getEmployeeId() {
        return employeeId;
    }

    /** Sets the employee ID */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /** Gets the employee's salary */
    public double getSalary() {
        return salary;
    }

    /** Sets the employee's salary */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /** Displays basic employee information */
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }

}
