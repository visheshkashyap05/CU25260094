import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            File file = new File("employees.txt");

            FileWriter writer = new FileWriter(file);

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            writer.write("Employee ID: " + id + "\n");
            writer.write("Employee Name: " + name + "\n");
            writer.write("Department: " + department + "\n");
            writer.write("Salary: " + salary + "\n");
            writer.write("-------------------------\n");

            writer.close();

            System.out.println("\nEmployee record stored successfully.");

            System.out.print("\nEnter Employee ID to search: ");
            int searchId = sc.nextInt();

            if (!file.exists()) {
                System.out.println("Error: employees.txt file does not exist.");
                sc.close();
                return;
            }

            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Employee ID:")) {
                    int currentId = Integer.parseInt(
                            line.substring("Employee ID:".length()).trim()
                    );

                    if (currentId == searchId) {
                        found = true;

                        System.out.println("\nEmployee Record Found:");
                        System.out.println(line);
                        System.out.println(br.readLine());
                        System.out.println(br.readLine());
                        System.out.println(br.readLine());

                        break;
                    }
                }
            }

            br.close();

            if (!found) {
                System.out.println("Employee record not found.");
            }
        } catch (IOException e) {
            System.out.println("Error while handling the file.");
        }

        sc.close();
    }
}
