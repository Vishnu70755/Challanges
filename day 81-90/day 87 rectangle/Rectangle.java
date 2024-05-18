import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;
    private String color;
    private boolean filled;
    private double borderWidth;
    private String borderColor;

    // Default constructor
    public Rectangle() {
    }

    // Constructor with all attributes
    public Rectangle(double length, double width, String color, boolean filled, double borderWidth, String borderColor) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public double getBorderWidth() {
        return borderWidth;
    }

    public String getBorderColor() {
        return borderColor;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setBorderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // toString method to display rectangle details
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", borderWidth=" + borderWidth +
                ", borderColor='" + borderColor + '\'' +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = scanner.nextDouble();

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();

        // Consume newline left-over
        scanner.nextLine();

        System.out.println("Enter color: ");
        String color = scanner.nextLine();

        System.out.println("Is the rectangle filled? (true/false): ");
        boolean filled = scanner.nextBoolean();

        System.out.println("Enter border width: ");
        double borderWidth = scanner.nextDouble();

        // Consume newline left-over
        scanner.nextLine();

        System.out.println("Enter border color: ");
        String borderColor = scanner.nextLine();

        Rectangle rectangle = new Rectangle(length, width, color, filled, borderWidth, borderColor);

        System.out.println(rectangle);
    }
}
