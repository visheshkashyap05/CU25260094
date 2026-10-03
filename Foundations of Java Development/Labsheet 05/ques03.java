class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public int getEmployeeId() { return employeeId; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public String getEmployeeName() { return employeeName; }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be negative.");
        } else if (salary > 1000000) {
            System.out.println("Salary cannot be greater than 1,000,000.");
        } else {
            this.salary = salary;
            System.out.println("Salary updated successfully.");
        }
    }

    public double getSalary() { return salary; }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

public class ques03 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeId(101);
        emp.setEmployeeName("Amit");
        emp.setSalary(750000);
        emp.displayDetails();

        System.out.println("\nTesting invalid salary:");
        emp.setSalary(-5000);
        emp.setSalary(1500000);
    }
}
