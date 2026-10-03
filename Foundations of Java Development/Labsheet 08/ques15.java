import java.util.ArrayList;

class Student<T, U, V> {
    private T id;
    private U name;
    private V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    T getId() {
        return id;
    }

    U getName() {
        return name;
    }

    V getMarks() {
        return marks;
    }

    void display() {
        System.out.println(
            "ID: " + id +
            ", Name: " + name +
            ", Marks: " + marks
        );
    }
}

public class ques15 {

    public static void displayStudents(
            ArrayList<Student<Integer, String, Double>> students) {

        System.out.println("All Students:");

        for (Student<Integer, String, Double> student : students) {
            student.display();
        }
    }

    public static void searchStudent(
            ArrayList<Student<Integer, String, Double>> students,
            int searchId) {

        boolean found = false;

        for (Student<Integer, String, Double> student : students) {
            if (student.getId().equals(searchId)) {
                System.out.println("\nStudent Found:");
                student.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent with ID "
                    + searchId + " not found.");
        }
    }

    public static void main(String[] args) {

        ArrayList<Student<Integer, String, Double>> students =
                new ArrayList<>();

        students.add(new Student<>(101, "Rahul", 85.5));
        students.add(new Student<>(102, "Amit", 91.0));
        students.add(new Student<>(103, "Priya", 88.5));
        students.add(new Student<>(104, "Neha", 79.5));
        students.add(new Student<>(105, "Rohan", 94.0));

        displayStudents(students);

        System.out.println("\nUsing get():");
        students.get(0).display();

        System.out.println("\nContains first student: "
                + students.contains(students.get(0)));

        searchStudent(students, 103);

        System.out.println("\nTotal Number of Students: "
                + students.size());

        // Type safety demonstration:
        // The following statement is not allowed because
        // the list requires Student<Integer, String, Double>.
        //
        // students.add(new Student<>("ABC", "Test", "90"));
    }
}