package com.jegan.assignment.employees;

public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee emp) {
        emp.displayInfo();
    }

    /**
     * Increases the salary of an employee by a given percentage.
     * @param emp the employee whose salary is to be increased
     * @param percent the percentage increase
     */
    public static void increaseSalary(Employee emp, double percent) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
        emp.setSalary(newSalary);
        System.out.println("Updated Salary for " + emp.getName() + ": " + emp.getSalary());
    }
}


