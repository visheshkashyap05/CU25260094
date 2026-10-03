import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    public InvalidExamMarksException(String message) {
        super(message);
    }
}

public class ques14 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter student marks: ");
            String marksInput = sc.nextLine();

            double marks = Double.parseDouble(marksInput);

            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException(
                    "Marks must be between 0 and 100."
                );
            }

            System.out.println("Marks are valid.");

            if (marks >= 40) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }

        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric marks.");
        } finally {
            System.out.println("Exam evaluation completed.");
        }

    }
}
