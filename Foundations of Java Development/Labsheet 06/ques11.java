import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class ques11 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("Enter account balance: ");
                String balanceInput = sc.nextLine();

                System.out.print("Enter withdrawal amount: ");
                String withdrawalInput = sc.nextLine();

                double balance = Double.parseDouble(balanceInput);
                double withdrawal = Double.parseDouble(withdrawalInput);

                if (withdrawal < 0) {
                    throw new IllegalArgumentException(
                        "Withdrawal amount cannot be negative."
                    );
                }

                if (withdrawal > balance) {
                    throw new InsufficientBalanceException(
                        "Insufficient balance."
                    );
                }

                balance = balance - withdrawal;

                System.out.println("Withdrawal successful.");
                System.out.println("Remaining balance = " + balance);

            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter valid numeric values.");

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Bank transaction completed.");
            }
        }
    }
}