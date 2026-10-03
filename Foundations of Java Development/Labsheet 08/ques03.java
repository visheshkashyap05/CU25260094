class Student<T> {
    private T id;

    Student(T id) {
        this.id = id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }
}

public class ques03 {
    public static void main(String[] args) {
        Student<Integer> student = new Student<>(101);
        student.display();
    }
}