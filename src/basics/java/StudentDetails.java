package basics.java;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name with Initial: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        System.out.print("Enter Percentage: ");
        String percentage = sc.nextLine();

        System.out.println("\nOutput:");
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println("\t" + grade);
        System.out.println("\t" + percentage);

        sc.close();
    }
}
