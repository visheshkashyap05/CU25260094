class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    void calculateSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(double salary) {
        super(salary);
    }

    @Override
    void calculateSalary() {
        double managerSalary = salary + (salary * 0.20);
        System.out.println("Manager Salary with 20% bonus: " + managerSalary);
    }
}

public class ques14 {
    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        Manager manager = new Manager(50000);

        emp.calculateSalary();
        manager.calculateSalary();
    }
}
