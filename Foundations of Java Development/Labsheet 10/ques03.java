import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ques03 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("data.txt");

            writer.write("Java is a programming language.\n");
            writer.write("Java supports object oriented programming.\n");
            writer.write("File handling is an important concept.");

            writer.close();

            FileReader reader = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            int lines = 0;
            int words = 0;
            int characters = 0;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();

                String[] wordArray = line.trim().split("\\s+");

                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            br.close();

            System.out.println("Number of Lines: " + lines);
            System.out.println("Number of Words: " + words);
            System.out.println("Number of Characters: " + characters);
        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
        }
    }
}
