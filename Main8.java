// Shape.java
class Shape {
    // Method to calculate area (generic shape)
    public double getArea() {
        System.out.println("Area not defined for generic shape.");
        return 0;
    }

    // Method to calculate perimeter (generic shape)
    public double getPerimeter() {
        System.out.println("Perimeter not defined for generic shape.");
        return 0;
    }
}

// Circle.java
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override getArea() for circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override getPerimeter() for circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main.java
public class Main8 {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        Circle circle = new Circle(5); // Example: radius = 5

        System.out.println("Generic Shape:");
        genericShape.getArea();
        genericShape.getPerimeter();

        System.out.println("\nCircle:");
        System.out.printf("Area: %.2f\n", circle.getArea());
        System.out.printf("Perimeter: %.2f\n", circle.getPerimeter());
    }
}
