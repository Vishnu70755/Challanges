import java.util.Scanner;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle input
        System.out.println("Enter the width of the rectangle:");
        double rectangleWidth = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle:");
        double rectangleHeight = scanner.nextDouble();
        Shape rectangle = new Rectangle(rectangleWidth, rectangleHeight);

        // Circle input
        System.out.println("Enter the radius of the circle:");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);

        // Display results
        System.out.println(rectangle); // Output: Rectangle [width=..., height=...]
        System.out.println("Area: " + rectangle.calculateArea()); // Output: Area: ...
        System.out.println("Perimeter: " + rectangle.calculatePerimeter()); // Output: Perimeter: ...

        System.out.println(circle); // Output: Circle [radius=...]
        System.out.println("Area: " + circle.calculateArea()); // Output: Area: ...
        System.out.println("Perimeter: " + circle.calculatePerimeter()); // Output: Perimeter: ...

        scanner.close();
    }
}
