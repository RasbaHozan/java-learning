package training.oop.problems;

abstract class Shape {

 abstract double calculateArea();
 
 abstract double calculatePerimeter();
}

class Circle extends Shape {
	//private variable
 private double radius;

 // Constructor 
 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 double calculateArea() {

     return 3.14 * radius * radius;
 }

 @Override
 double calculatePerimeter() {
     return 2 * 3.14* radius;
 }
}

class Triangle extends Shape {
 // private variables
 private double side1;
 private double side2;
 private double side3;

 // Constructor
 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 @Override
 double calculateArea() {
     double s = (side1 + side2 + side3) / 2;
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }
 @Override
 double calculatePerimeter() {

     return side1 + side2 + side3;
 }
}

public class ShapeMain {
 public static void main(String[] args) {
     //declare and initialize radius for circle
     double rad = 10.0;
     // Create an instance of Circle 
     Circle circle = new Circle(rad);
     System.out.println("Radius of the Circle: " + rad);
     System.out.println("Area of the Circle: " + circle.calculateArea());
     System.out.println("perimeter of ther Cirlce" + circle.calculatePerimeter());
     
     
     // Declare and initialize the sides for the triangle
     double s1 = 3.0;
     double s2 = 4.0;
     double s3 = 5.0; 
     // Create an instance of Triangle with the specified sides
     Triangle triangle = new Triangle(s1, s2, s3);
     System.out.println("Sides of the Triangle are: " + s1 + ',' + s2 + ',' + s3);
        
     System.out.println("Area of the Triangle: " + triangle.calculateArea());
     
     System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
 }
}
