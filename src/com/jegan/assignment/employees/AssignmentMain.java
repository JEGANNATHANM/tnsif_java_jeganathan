package com.jegan.assignment.employees;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("Alice", 101, 90000, "IT Department");

        // Create Developer object
        Devloper developer = new Devloper("Bob", 102, 70000, "Java");

        // Display details using utility class
        System.out.println("=== Employee Details ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        // Increase salaries
        System.out.println("\n=== After Salary Update ===");
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

	}

}
