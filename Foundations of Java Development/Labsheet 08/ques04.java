class Pair<T, U> {
    private T employeeId;
    private U employeeName;

    Pair(T employeeId, U employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
    }
}

public class ques04 {
    public static void main(String[] args) {
        Pair<Integer, String> employee =
                new Pair<>(101, "Rahul");

        employee.display();
    }
}