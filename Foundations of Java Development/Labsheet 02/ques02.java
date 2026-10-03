import java.util.Scanner;

public class ques02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter time in years: ");
       double t = sc.nextDouble();

        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
        System.out.println("Amount = " + amount);

        sc.close();
    }
}