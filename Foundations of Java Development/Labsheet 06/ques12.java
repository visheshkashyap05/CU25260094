import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    public InvalidPatientAgeException(String message) {
        super(message);
    }
}

public class ques12 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            String ageInput = sc.nextLine();

            int age = Integer.parseInt(ageInput);

            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException(
                    "Patient age must be between 0 and 120."
                );
            }

            System.out.println("Patient registration successful.");
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);

        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a numeric value.");
        }
    }
}
