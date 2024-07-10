import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle:");
        double lengthRect = scanner.nextDouble();
        double breadthRect = scanner.nextDouble();


        Rectangle rectangle = new Rectangle(lengthRect, breadthRect);


        double areaRectangle = calculateRectangleArea(rectangle);
        System.out.println("Area of the rectangle: " + areaRectangle);

        System.out.println("\nEnter base and height of the triangle:");
        double baseTri = scanner.nextDouble();
        double heightTri = scanner.nextDouble();

        Triangle triangle = new Triangle(baseTri, heightTri);


        double areaTriangle = calculateTriangleArea(triangle);
        System.out.println("Area of the triangle: " + areaTriangle);

        scanner.close();
    }


    public static double calculateRectangleArea(Rectangle rect) {
        return rect.calculateArea();
    }

    public static double calculateTriangleArea(Triangle tri) {
        return tri.calculateArea();
    }
}
