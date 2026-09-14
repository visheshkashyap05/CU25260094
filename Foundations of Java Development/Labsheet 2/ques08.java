import java.util.Scanner;

public class ques08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle 1: ");
        int a = sc.nextInt();

        System.out.print("Enter angle 2: ");
        int b = sc.nextInt();

        System.out.print("Enter angle 3: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }

        sc.close();
    }
}