class Employee {
    String name;
    double salary;
    static String organization = "Tech Corp";

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    static void compare(Employee e1, Employee e2) {
        double salary1 = e1.salary;
        double salary2 = e2.salary;

        System.out.println("Organization: " + organization);
        System.out.println(e1.name + " Salary: " + salary1);
        System.out.println(e2.name + " Salary: " + salary2);

        if (salary1 > salary2) {
            System.out.println(e1.name + " has higher salary.");
        } else if (salary2 > salary1) {
            System.out.println(e2.name + " has higher salary.");
        } else {
            System.out.println("Both employees have equal salaries.");
        }
    }
}

public class ques29 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", 60000);
        Employee e2 = new Employee("Amit", 50000);

        Employee.compare(e1, e2);
    }
}
