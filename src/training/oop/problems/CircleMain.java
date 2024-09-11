// create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter.
package training.oop.problems;

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius cannot be negative.");
        }
    }

    public double calculateArea() {
        return 3.14 * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}

// Main class
public class CircleMain {
    public static void main(String[] args) {
        // Create an instance of Circle 
        Circle circle = new Circle(7.0); // Initialize

        // Get the radius using the getter method
        double radius = circle.getRadius();

        // Calculate and print the area and perimeter
        double area = circle.calculateArea();
        double perimeter = circle.calculatePerimeter();

        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Perimeter: " + perimeter);
    }
}
