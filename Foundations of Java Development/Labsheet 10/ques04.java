import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ques04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("students.txt", true);

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            int roll = sc.nextInt();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            writer.write("Name: " + name + ", Roll Number: " + roll
                    + ", Marks: " + marks + "\n");

            writer.close();

            System.out.println("Student record appended successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing to the file.");
        }

        sc.close();
    }
}
