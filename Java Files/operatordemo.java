import java.util.Scanner;

class Operatordemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a > b  = " + (a > b));
        System.out.println("a < b  = " + (a < b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > 0 && b > 0) = " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0) = " + (a > 0 || b > 0));

        // Assignment Operator
        System.out.println("\n--- Assignment Operator ---");
        int c = a;   // simple assignment
        c += b;      // c = c + b
        System.out.println("c = a; c += b gives c = " + c);

        // Unary Operators
        System.out.println("\n--- Unary Operators ---");
        System.out.println("++a (pre-increment) = " + (++a));
        System.out.println("b-- (post-decrement) = " + (b--));
        System.out.println("After post-decrement, b = " + b);

        // Ternary Operator
        System.out.println("\n--- Ternary Operator ---");
        String result = (a > b) ? "a is greater" : "b is greater or equal";
        System.out.println(result);

        sc.close();
    }
}
