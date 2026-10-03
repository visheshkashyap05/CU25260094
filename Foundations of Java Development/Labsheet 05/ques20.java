interface Researcher {
    void conductResearch();
}

class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }

    public void calculateSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}

class Teacher extends Employee implements Researcher {
    private String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void teach() {
        System.out.println("Teacher is teaching " + subject + ".");
    }

    @Override
    public void conductResearch() {
        System.out.println("Teacher is conducting research.");
    }

    @Override
    public void calculateSalary() {
        double teacherSalary = getSalary() + (getSalary() * 0.10);
        System.out.println("Teacher Salary with 10% allowance: " + teacherSalary);
    }
}

class VisitingTeacher extends Teacher {
    private int hoursWorked;

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void calculateSalary() {
        double hourlyRate = 500;
        double visitingSalary = hoursWorked * hourlyRate;
        System.out.println("Visiting Teacher Salary: " + visitingSalary);
    }
}

class Admin extends Employee {
    private String department;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void manageDepartment() {
        System.out.println("Admin manages the " + department + " department.");
    }

    @Override
    public void calculateSalary() {
        double adminSalary = getSalary() + (getSalary() * 0.05);
        System.out.println("Admin Salary with 5% allowance: " + adminSalary);
    }
}

public class ques20 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher();
        teacher.setEmployeeId(101);
        teacher.setEmployeeName("Rahul");
        teacher.setSalary(50000);
        teacher.setSubject("Java");

        System.out.println("----- TEACHER DETAILS -----");
        teacher.displayDetails();
        System.out.println("Subject: " + teacher.getSubject());
        teacher.teach();
        teacher.conductResearch();
        teacher.calculateSalary();

        VisitingTeacher visitingTeacher = new VisitingTeacher();
        visitingTeacher.setEmployeeId(102);
        visitingTeacher.setEmployeeName("Amit");
        visitingTeacher.setSalary(30000);
        visitingTeacher.setSubject("Python");
        visitingTeacher.setHoursWorked(40);

        System.out.println("\n----- VISITING TEACHER DETAILS -----");
        visitingTeacher.displayDetails();
        System.out.println("Subject: " + visitingTeacher.getSubject());
        System.out.println("Hours Worked: " + visitingTeacher.getHoursWorked());
        visitingTeacher.teach();
        visitingTeacher.conductResearch();
        visitingTeacher.calculateSalary();

        Admin admin = new Admin();
        admin.setEmployeeId(103);
        admin.setEmployeeName("Neha");
        admin.setSalary(60000);
        admin.setDepartment("Administration");

        System.out.println("\n----- ADMIN DETAILS -----");
        admin.displayDetails();
        System.out.println("Department: " + admin.getDepartment());
        admin.manageDepartment();
        admin.calculateSalary();
    }
}
