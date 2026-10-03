class Employee<T, U> {
    private T employeeId;
    private U employeeName;

    Employee(T employeeId, U employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

public class ques06 {
    public static void main(String[] args) {
        Employee<Integer, String> employee =
                new Employee<>(1001, "Amit");

        employee.display();
    }
}