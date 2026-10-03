import java.util.HashSet;
public class ques04 {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();
        departments.add("Computer Science"); departments.add("Management"); departments.add("Computer Science");
        departments.add("Electrical"); departments.add("Management"); departments.add("Mechanical");
        System.out.println("Unique Departments:");
        for (String department : departments) System.out.println(department);
    }
}
