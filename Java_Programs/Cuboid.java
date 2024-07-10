import java.util.Scanner;

public class Cuboid {
    private final double length;
    private final double breadth;
    private final double height;

    // Constructor
    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Method to calculate volume of cuboid
    public double calculateVolume() {
        return length * breadth * height;
    }

    // Method to calculate surface area of cuboid
    public double calculateSurfaceArea() {
        double surfaceArea;
        surfaceArea = 2 * ((length * breadth) + (length * height) + (breadth * height));
        return surfaceArea;
    }

    // Method to calculate perimeter of cuboid
    public double calculatePerimeter() {
        double perimeter;
        perimeter = 4 * (length + breadth + height);
        return perimeter;
    }

    // Main method to demonstrate nesting of methods
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the cuboid
        System.out.println("Enter length, breadth, and height of the cuboid:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double height = scanner.nextDouble();

        // Create cuboid object
        Cuboid cuboid = new Cuboid(length, breadth, height);

        // Calculate and print volume
        double volume = cuboid.calculateVolume();
        System.out.println("Volume of the cuboid: " + volume);

        // Calculate and print surface area
        double surfaceArea = cuboid.calculateSurfaceArea();
        System.out.println("Surface area of the cuboid: " + surfaceArea);

        // Calculate and print perimeter
        double perimeter = cuboid.calculatePerimeter();
        System.out.println("Perimeter of the cuboid: " + perimeter);

        scanner.close();
    }
}
