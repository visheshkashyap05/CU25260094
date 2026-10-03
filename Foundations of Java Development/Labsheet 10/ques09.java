import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ques09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("\nEnter details of Student " + i);

                System.out.print("Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                double marks = sc.nextDouble();

                writer.write("Roll Number: " + roll + "\n");
                writer.write("Name: " + name + "\n");
                writer.write("Course: " + course + "\n");
                writer.write("Marks: " + marks + "\n");
                writer.write("-------------------------\n");
            }

            writer.close();

            System.out.println("\nStudent records stored successfully.\n");

            FileReader reader = new FileReader("student_records.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error while handling the file.");
        }

        sc.close();
    }
}
