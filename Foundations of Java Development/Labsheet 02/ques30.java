import java.util.Scanner;

public class ques30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("The number is not a power of 4.");
            sc.close();
            return;
        }

        // Check power of 4 using right shift by 2 positions
        int temp = num;

        while ((temp & 3) == 0) {
            temp >>= 2;
        }

        if (temp != 1) {
            System.out.println(num + " is not a power of 4.");
            sc.close();
            return;
        }

        System.out.println(num + " is a power of 4.");

        // Toggle the 3rd bit
        int toggled = num ^ (1 << 2);

        System.out.println("After toggling the 3rd bit = " + toggled);

        System.out.println("Multiplication table:");

        for (int i = 1; i <= 20; i++) {

            if (i % 6 == 0) {
                continue;
            }

            int result = toggled * i;

            if (result % 48 == 0) {
                System.out.println("Multiple of 48 reached at " + i);
                break;
            }

            System.out.println(toggled + " x " + i + " = " + result);
        }

        sc.close();
    }
}