class Employee {
    String employeeName;
    int employeeId;

    void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    void writeCode() {
        System.out.println("Developer writes code in " + programmingLanguage + ".");
    }
}

class Manager extends Employee {
    String department;

    void conductMeeting() {
        System.out.println("Manager conducts meeting for " + department + " department.");
    }
}

public class ques12 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.employeeName = "Amit";
        d.employeeId = 101;
        d.programmingLanguage = "Java";

        Manager m = new Manager();
        m.employeeName = "Neha";
        m.employeeId = 102;
        m.department = "IT";

        System.out.println("Developer:");
        d.displayEmployee();
        d.writeCode();

        System.out.println("\nManager:");
        m.displayEmployee();
        m.conductMeeting();
    }
}
