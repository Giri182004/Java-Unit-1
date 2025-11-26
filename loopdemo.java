import java.util.Scanner;

class loopdemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\nUsing WHILE loop:");
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nUsing DO-WHILE loop:");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= n);

        System.out.println("\nUsing FOR loop:");
        for (int k = 1; k <= n; k++) {
            System.out.println(k);
        }

        sc.close();
    }
}
