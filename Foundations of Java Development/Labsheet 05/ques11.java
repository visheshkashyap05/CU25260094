class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    String course;

    void study() {
        System.out.println("Student is studying " + course + ".");
    }
}

class Teacher extends Person {
    String subject;

    void teach() {
        System.out.println("Teacher is teaching " + subject + ".");
    }
}

public class ques11 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.course = "BCA";

        Teacher t = new Teacher();
        t.name = "Mr. Sharma";
        t.subject = "Java";

        System.out.println("Student Details:");
        s.displayName();
        s.study();

        System.out.println("\nTeacher Details:");
        t.displayName();
        t.teach();
    }
}
