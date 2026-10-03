import java.util.ArrayList;
public class ques01 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Rahul"); students.add("Aman"); students.add("Priya"); students.add("Neha"); students.add("Rohit");
        students.add("Anjali"); students.add("Vikas"); students.add("Sneha"); students.add("Karan"); students.add("Pooja");
        System.out.println("Student Names:");
        for (String student : students) System.out.println(student);
        System.out.println("Total Size: " + students.size());
    }
}
