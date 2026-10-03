import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ques08 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("input.txt");

            writer.write("Java Programming 123");

            writer.close();

            FileReader reader = new FileReader("input.txt");

            int character;
            int vowels = 0;
            int consonants = 0;
            int digits = 0;
            int spaces = 0;

            while ((character = reader.read()) != -1) {
                char ch = (char) character;

                if (Character.isLetter(ch)) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isDigit(ch)) {
                    digits++;
                } else if (ch == ' ') {
                    spaces++;
                }
            }

            reader.close();

            System.out.println("Number of Vowels: " + vowels);
            System.out.println("Number of Consonants: " + consonants);
            System.out.println("Number of Digits: " + digits);
            System.out.println("Number of Spaces: " + spaces);
        } catch (IOException e) {
            System.out.println("Error while handling the file.");
        }
    }
}
