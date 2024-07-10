import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = input("Enter first number: ", scanner);
        int num2 = input("Enter second number: ", scanner);

        int result = add(num1, num2);
        System.out.println("Result of addition: " + result);

        scanner.close();
    }

    public static int input(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static int add(int a, int b) {
        return a + b;
    }
}