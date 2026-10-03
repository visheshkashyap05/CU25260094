import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ques01 {
    public static void main(String[] args) {
        try {
            File file = new File("student.txt");
            FileWriter writer = new FileWriter(file);

            writer.write("Student Name: Vishesh Kashyap\n");
            writer.write("Roll Number: 101\n");
            writer.write("Course: BCA\n");
            writer.write("Semester: 3rd\n");

            writer.close();

            System.out.println("File created and data written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
