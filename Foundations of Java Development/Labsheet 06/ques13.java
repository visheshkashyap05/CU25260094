import java.util.Scanner;

class InvalidDosageException extends Exception {
    public InvalidDosageException(String message) {
        super(message);
    }
}

public class ques13 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter patient name: ");
            String patientName = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drugName = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            String dosageInput = sc.nextLine();

            double dosage = Double.parseDouble(dosageInput);

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException(
                    "Dosage must be between 1 mg and 1000 mg."
                );
            }

            System.out.println("Dosage is valid.");
            System.out.println("Patient Name: " + patientName);
            System.out.println("Drug Name: " + drugName);
            System.out.println("Dosage: " + dosage + " mg");

        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Dosage must be numeric.");
        } finally {
            System.out.println("Dosage validation completed.");
        }

    }
}
