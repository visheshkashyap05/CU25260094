class Student {
    String name;
    int age;
    static int count = 0;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    void display() {
        String studentName = name;
        int studentAge = age;

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
    }
}

public class ques01 {
    public static void main(String[] args) {
        String name = "Rahul";
        int age = 20;

        Student s1 = new Student(name, age);
        s1.display();

        System.out.println("Total Students: " + Student.count);
    }
}
