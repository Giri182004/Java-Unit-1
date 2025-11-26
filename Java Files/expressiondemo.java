import java.util.Scanner;

public class expressiondemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;          // expression
        int diff = a - b;         // expression
        int product = a * b;      // expression
        double division = (double)a / b;  // expression

        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
        System.out.println("Product = " + product);
        System.out.println("Division = " + division);

        sc.close();
    }
}
