import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    public InsufficientMedicineStockException(String message) {
        super(message);
    }
}

public class ques15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter medicine name: ");
            String medicineName = sc.nextLine();

            System.out.print("Enter available quantity: ");
            String availableInput = sc.nextLine();

            System.out.print("Enter required quantity: ");
            String requiredInput = sc.nextLine();

            int availableQuantity = Integer.parseInt(availableInput);
            int requiredQuantity = Integer.parseInt(requiredInput);

            if (availableQuantity < 0 || requiredQuantity < 0) {
                throw new InvalidQuantityException(
                    "Quantity cannot be negative."
                );
            }

            if (requiredQuantity > availableQuantity) {
                throw new InsufficientMedicineStockException(
                    "Required quantity is greater than available stock."
                );
            }

            System.out.println("Medicine issued successfully.");
            System.out.println("Medicine: " + medicineName);
            System.out.println("Quantity issued: " + requiredQuantity);
            System.out.println(
                "Remaining quantity: " +
                (availableQuantity - requiredQuantity)
            );

        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(
                "Error: Please enter valid numeric quantities."
            );
        } finally {
            System.out.println(
                "Inventory transaction completed."
            );
        }

    }
}
