package basics.java;

import java.util.Scanner;

public class Circle {
    double radius;
    String colour;

    // Method to get input
    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of Circle: ");
        radius = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.print("Enter Colour of Circle: ");
        colour = sc.nextLine();
    }

    // Method to calculate and display area
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius: " + radius);
        System.out.println("Colour: " + colour);
        System.out.println("Area: " + area);
    }

public class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.calcArea();
    }
}
}