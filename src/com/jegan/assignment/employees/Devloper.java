package com.jegan.assignment.employees;

public class Devloper extends Employee{
	private String programmingLanguage;

    public Devloper() {}

    public Devloper(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    /** Gets the programming language */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /** Sets the programming language */
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    /** Displays developer-specific information */
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }

}
