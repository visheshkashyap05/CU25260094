import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ques06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter("notes.txt");

            writer.write("Java is easy to learn.\n");
            writer.write("Java is widely used for application development.\n");
            writer.write("Learning Java helps in understanding programming.");

            writer.close();

            System.out.print("Enter word to search: ");
            String searchWord = sc.nextLine();

            FileReader reader = new FileReader("notes.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "");

                    if (word.equalsIgnoreCase(searchWord)) {
                        count++;
                    }
                }
            }

            br.close();

            if (count > 0) {
                System.out.println("Word found.");
                System.out.println("Number of occurrences: " + count);
            } else {
                System.out.println("Word not found.");
                System.out.println("Number of occurrences: 0");
            }
        } catch (IOException e) {
            System.out.println("Error while accessing the file.");
        }

        sc.close();
    }
}
