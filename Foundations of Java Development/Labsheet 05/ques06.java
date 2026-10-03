class Employee {
    private String name;
    private double salary;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setSalary(double salary) { this.salary = salary; }
    public double getSalary() { return salary; }
}

class Manager extends Employee {
    private String department;

    public void setDepartment(String department) { this.department = department; }
    public String getDepartment() { return department; }

    public void displayManager() {
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment());
    }
}

public class ques06 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("Amit");
        m.setSalary(85000);
        m.setDepartment("IT");
        m.displayManager();
    }
}
