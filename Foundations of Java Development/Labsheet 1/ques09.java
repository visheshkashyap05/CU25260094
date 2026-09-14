import java.util.Scanner;

public class ques09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}