import java.util.Scanner;

public class ques25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter logical operator (A for AND, O for OR): ");
        char operator = sc.next().charAt(0);

        boolean x = a != 0;
        boolean y = b != 0;

        if (operator == 'A' || operator == 'a') {
            System.out.println("Logical AND result: " + (x && y));
        } else if (operator == 'O' || operator == 'o') {
            System.out.println("Logical OR result: " + (x || y));
        } else {
            System.out.println("Invalid logical operator.");
        }

        sc.close();
    }
}