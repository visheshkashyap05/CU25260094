import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        boolean leapYear = (year % 400 == 0) ||
                           (year % 4 == 0 && year % 100 != 0);

        boolean inRange = year >= lower && year <= upper;

        if (leapYear && inRange) {
            System.out.println("The year is a leap year and is within the range.");
        } else {
            System.out.println("The condition is not satisfied.");
        }

        sc.close();
    }
}