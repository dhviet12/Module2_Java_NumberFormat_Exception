import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x, int y) {
        try {
            int sum = x + y;
            int subtraction = x - y;
            int multiplication = x * y;
            int division = x / y;
            System.out.println("Sum x+y = " + sum);
            System.out.println("Subtraction x-y = " + subtraction);
            System.out.println("Multiplication x*y = " + multiplication);
            System.out.println("Division x/y = " + division);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        int x = scanner.nextInt();
        System.out.println("Enter y");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x, y);
    }
}
