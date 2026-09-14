import java.util.Scanner;

public class ques21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;

        System.out.println("Factors of " + num + ":");

        do {
            if (num % i == 0) {
                System.out.print(i + " ");
            }

            i++;
        } while (i <= num);

        sc.close();
    }
}