import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Scientific Calculator =====");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log (ln)");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Addition");
            System.out.println("6. Subtraction");
            System.out.println("7. Multiplication");
            System.out.println("8. Division");
            System.out.println("9. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Result: " + Math.sqrt(num));
                    break;

                case 2:
                    System.out.print("Enter integer: ");
                    int n = sc.nextInt();
                    long fact = 1;
                    for (int i = 1; i <= n; i++) {
                        fact *= i;
                    }
                    System.out.println("Result: " + fact);
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    double ln = sc.nextDouble();
                    System.out.println("Result: " + Math.log(ln));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exp));
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();
                    System.out.println("Result: " + (a + b));
                    break;

                case 6:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a - b));
                    break;

                case 7:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();
                    System.out.println("Result: " + (a * b));
                    break;

                case 8:
                    System.out.print("Enter first number: ");
                    a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    b = sc.nextDouble();

                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (a / b));
                    }
                    break;

                case 9:
                    System.out.println("Exiting calculator...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
