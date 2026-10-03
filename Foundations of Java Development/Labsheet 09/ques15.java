import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;
public class ques15 {
    static ArrayList<String> studentRecords = new ArrayList<>();
    static HashSet<Integer> studentIds = new HashSet<>();
    static TreeSet<Integer> sortedStudentIds = new TreeSet<>();
    static Scanner sc = new Scanner(System.in);
    public static void addStudent() {
        System.out.print("Enter Student ID: "); int id = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Student Name: "); String name = sc.nextLine();
        if (studentIds.contains(id)) { System.out.println("Student ID already exists."); return; }
        studentRecords.add(id + " - " + name); studentIds.add(id); sortedStudentIds.add(id);
        System.out.println("Student added successfully.");
    }
    public static void removeStudent() {
        System.out.print("Enter Student ID to remove: "); int id = sc.nextInt(); sc.nextLine();
        boolean found = false;
        for (int i = 0; i < studentRecords.size(); i++) if (studentRecords.get(i).startsWith(id + " - ")) { studentRecords.remove(i); found = true; break; }
        if (found) { studentIds.remove(id); sortedStudentIds.remove(id); System.out.println("Student removed successfully."); }
        else System.out.println("Student not found.");
    }
    public static void searchStudent() {
        System.out.print("Enter Student ID to search: "); int id = sc.nextInt(); sc.nextLine();
        boolean found = false;
        for (String student : studentRecords) if (student.startsWith(id + " - ")) { System.out.println("Student Found: " + student); found = true; break; }
        if (!found) System.out.println("Student not found.");
    }
    public static void displayStudents() {
        System.out.println("\nStudent Records:");
        if (studentRecords.isEmpty()) { System.out.println("No students available."); return; }
        for (String student : studentRecords) System.out.println(student);
    }
    public static void countStudents() {
        System.out.println("Total Students: " + studentRecords.size());
        System.out.println("Unique Student IDs: " + studentIds.size());
    }
    public static void iterateStudents() {
        if (studentRecords.isEmpty()) { System.out.println("No students available."); return; }
        ListIterator<String> iterator = studentRecords.listIterator();
        System.out.println("\nForward Traversal:"); while (iterator.hasNext()) System.out.println(iterator.next());
        System.out.println("\nBackward Traversal:"); while (iterator.hasPrevious()) System.out.println(iterator.previous());
    }
    public static void displayCollections() {
        System.out.println("\nArrayList (List):"); System.out.println(studentRecords);
        System.out.println("\nHashSet (Set):"); System.out.println(studentIds);
        System.out.println("\nTreeSet (SortedSet):"); System.out.println(sortedStudentIds);
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== STUDENT COLLECTION MANAGEMENT =====");
            System.out.println("1. Add Student"); System.out.println("2. Remove Student"); System.out.println("3. Search Student");
            System.out.println("4. Display Students"); System.out.println("5. Count Students"); System.out.println("6. Iterate Students");
            System.out.println("7. Display List, Set and SortedSet"); System.out.println("8. Exit");
            System.out.print("Enter your choice: "); choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1: addStudent(); break; case 2: removeStudent(); break; case 3: searchStudent(); break;
                case 4: displayStudents(); break; case 5: countStudents(); break; case 6: iterateStudents(); break;
                case 7: displayCollections(); break; case 8: System.out.println("Program exited."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 8);
        sc.close();
    }
}
