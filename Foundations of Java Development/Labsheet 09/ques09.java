import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class ques09 {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("Java"); courses.add("Python"); courses.add("C++");
        System.out.println("Original List: " + courses);
        ListIterator<String> iterator = courses.listIterator();
        while (iterator.hasNext()) {
            String course = iterator.next();
            if (course.equals("Python")) { iterator.set("JavaScript"); iterator.add("HTML"); }
        }
        System.out.println("Modified List: " + courses);
    }
}
