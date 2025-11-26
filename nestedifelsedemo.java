import java.util.Scanner;

class nestedifelsedemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0);

        if (age >= 18) {                   // Outer if
            System.out.println("You are eligible to vote.");

            if (gender == 'M' || gender == 'm') {     // Inner if
                System.out.println("Gender: Male");
            } 
            else if (gender == 'F' || gender == 'f') {
                System.out.println("Gender: Female");
            } 
            else {
                System.out.println("Invalid gender input.");
            }
        } 
        else {                              // Outer else
            System.out.println("You are NOT eligible to vote.");
        }

        sc.close();
    }
}