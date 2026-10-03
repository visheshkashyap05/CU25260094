import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ques02 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("Contents of student.txt:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt file does not exist.");
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file.");
        }
    }
}
