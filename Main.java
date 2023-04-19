/*
Name: Joshua Lobo
PRN: 21070126127
Batch: AIML B3

OS: Mac OS 12.2.1 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the shape calculator!");

        while (true) {
            System.out.println("Please select a shape to calculate its area and volume:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 0:
                    System.out.println("Thank you for using the shape calculator. Goodbye!");
                    System.exit(0);
                case 1:
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    circle.showShape("Circle");
                    System.out.println("Area: " + circle.calculateArea());
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    rectangle.showShape("Rectangle");
                    System.out.println("Area: " + rectangle.calculateArea());
                    break;
                case 3:
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    Square square = new Square(side);
                    square.showShape("Square");
                    System.out.println("Area: " + square.calculateArea());
                    break;
                case 4:
                    System.out.print("Enter the radius of the sphere: ");
                    double radius2 = scanner.nextDouble();
                    Sphere sphere = new Sphere(radius2);
                    sphere.showShape("Sphere");
                    System.out.println("Area: " + sphere.calculateArea());
                    System.out.println("Volume: " + sphere.calculateVolume());
                    break;
                case 5:
                    System.out.print("Enter the radius of the base of the cylinder: ");
                    double radius3 = scanner.nextDouble();
                    System.out.print("Enter the height of the cylinder: ");
                    double height2 = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(radius3, height2);
                    cylinder.showShape("Cylinder");
                    System.out.println("Area: " + cylinder.calculateArea());
                    System.out.println("Volume: " + cylinder.calculateVolume());
                    break;
                case 6:
                    System.out.print("Enter the base length of the pyramid: ");
                    double length2 = scanner.nextDouble();
                    System.out.print("Enter the base width of the pyramid: ");
                    double width2 = scanner.nextDouble();
                    System.out.print("Enter the height of the pyramid: ");
                    double height3 = scanner.nextDouble();
                    Pyramid pyramid = new Pyramid(length2, width2, height3);
                    pyramid.showShape("Pyramid");
                    System.out.println("Area: " + pyramid.calculateArea());
                    System.out.println("Volume: " + pyramid.calculateVolume());
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}