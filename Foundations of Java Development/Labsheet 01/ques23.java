import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int celsius = sc.nextInt();

        double fahrenheit = ((double) celsius * 9 / 5) + 32;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();
    }
}