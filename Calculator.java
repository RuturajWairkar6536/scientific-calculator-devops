import java.util.Scanner;

public class Calculator {

    public static long factorial(int n) {
        if (n < 0) return -1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Scientific Calculator =====");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log (ln)");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Result: " + Math.sqrt(num1));
                    break;

                case 2:
                    System.out.print("Enter integer: ");
                    int num2 = sc.nextInt();
                    long fact = factorial(num2);
                    if (fact == -1)
                        System.out.println("Factorial not defined for negative numbers");
                    else
                        System.out.println("Result: " + fact);
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    double num3 = sc.nextDouble();
                    System.out.println("Result: " + Math.log(num3));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exp));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
