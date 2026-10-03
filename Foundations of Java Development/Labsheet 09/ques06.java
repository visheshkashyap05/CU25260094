import java.util.ArrayList;
import java.util.Scanner;
public class ques06 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java"); courses.add("Python"); courses.add("C++"); courses.add("Database"); courses.add("Web Development");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter course name: ");
        String course = sc.nextLine();
        if (courses.contains(course)) System.out.println("Course exists in the list.");
        else System.out.println("Course does not exist in the list.");
        sc.close();
    }
}
