class Employee {
    private String name;
    private int employeeId;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void displayEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

interface Programmer {
    void writeCode();
}

interface Researcher {
    void conductResearch();
}

class Developer extends Employee implements Programmer, Researcher {
    @Override
    public void writeCode() {
        System.out.println("Developer is writing code.");
    }

    @Override
    public void conductResearch() {
        System.out.println("Developer is conducting research.");
    }
}

public class ques19 {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setName("Rahul");
        developer.setEmployeeId(105);

        developer.displayEmployee();
        developer.writeCode();
        developer.conductResearch();
    }
}
