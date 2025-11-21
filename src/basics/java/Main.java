package basics.java;
import java.util.Scanner;

class Student {
    // Default constructor
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    // Data Members
    String name;
    String address;
    String phone;
    double salesAmount;
    double commission;

    // Method to accept details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        phone = sc.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    // Method to calculate commission
    void calculateCommission() {
        if (salesAmount >= 100000)
            commission = salesAmount * 0.10;
        else if (salesAmount >= 50000)
            commission = salesAmount * 0.05;
        else if (salesAmount >= 30000)
            commission = salesAmount * 0.03;
        else
            commission = 0;

        System.out.println("Commission: Rs. " + commission);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create Student object
        Student s = new Student();

        // Create Commission object
        Commission c = new Commission();
        c.acceptDetails();
        c.calculateCommission();
    }
}
