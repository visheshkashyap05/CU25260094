class StudentGrade {
    String name;
    int marks;
    static int passingMarks = 40;

    StudentGrade(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void assignGrade() {
        char grade;

        if (marks < passingMarks) {
            grade = 'F';
        } else if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}

public class ques17 {
    public static void main(String[] args) {
        StudentGrade s = new StudentGrade("Ravi", 82);
        s.assignGrade();
    }
}
