/*
 * Create an abstract shape with an abstract method calculateArea().
 * Implement tow subclasses,Circle and Rectangle, which inherit from Shape 
 * implementations of calculateArea().Write a program to calculate and print
 * the area and side.
 */

package AbstractionExamples;

// Shape.java
// Abstract class Shape
abstract class Shape {
    abstract double calculateArea();
}

// Circle.java
// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
//Triangle.java
//Subclass Triangle
class Triangle extends Shape {
 private double side1;
 private double side2;
 private double side3;

 public Triangle(double side1, double side2, double side3) {
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }

 @Override
 double calculateArea() {
     double s = (side1 + side2 + side3) / 2; // Semi-perimeter
     return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
 }

}
//Main.java
//Subclass Main

public class Abstract {
   public static void main(String[] args) {
		double r = 4.0;
     Circle circle = new Circle(r);
	double ts1 = 3.0, ts2 = 4.0, ts3 = 5.0;
     Triangle triangle = new Triangle(ts1, ts2, ts3);
     System.out.println("Radius of the Circle"+r);
     System.out.println("Area of the Circle: " + circle.calculateArea());
		System.out.println("\nSides of the Traiangel are: "+ts1+','+ts2+','+ts3);
     System.out.println("Area of the Triangle: " + triangle.calculateArea());
 }
}
