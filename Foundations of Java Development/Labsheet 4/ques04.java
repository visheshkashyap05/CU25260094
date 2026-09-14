class Employee {
    int empId;
    double salary;
    static String companyName = "Tech Solutions";

    Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        int id = empId;
        double sal = salary;

        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + sal);
        System.out.println("Company: " + companyName);
    }
}

public class ques04 {
    public static void main(String[] args) {
        int id = 101;
        double salary = 50000;

        Employee e = new Employee(id, salary);
        e.display();
    }
}
