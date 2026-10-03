import java.util.Scanner;

public class ques04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();

            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();

            int a = Integer.parseInt(input1);
            int b = Integer.parseInt(input2);

            int result = a / b;
            System.out.println("Division Result = " + result);

            System.out.print("Enter array index: ");
            String indexInput = sc.nextLine();

            int index = Integer.parseInt(indexInput);

            System.out.println("Array Element = " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }

        sc.close();
    }
}
