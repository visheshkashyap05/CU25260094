class StudentMarks {
    double marks1;
    double marks2;
    double marks3;
    static String universityName = "COER University";

    StudentMarks(double marks1, double marks2, double marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    void calculateAverage() {
        double total = marks1 + marks2 + marks3;
        double average = total / 3;

        System.out.println("University: " + universityName);
        System.out.println("Average Marks: " + average);
    }
}

public class ques12 {
    public static void main(String[] args) {
        StudentMarks s = new StudentMarks(80, 75, 90);
        s.calculateAverage();
    }
}
