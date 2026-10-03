import java.io.File;
import java.util.Scanner;

public class ques07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        System.out.println("\nFile Information:");

        System.out.println("File exists: " + file.exists());

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Is a file: " + file.isFile());
            System.out.println("Is a directory: " + file.isDirectory());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("The specified file does not exist.");
        }

        sc.close();
    }
}
