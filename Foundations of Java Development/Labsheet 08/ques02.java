class Result<T> {
    private T marks;

    Result(T marks) {
        this.marks = marks;
    }

    void display() {
        System.out.println("Marks: " + marks);
    }
}

public class ques02 {
    public static void main(String[] args) {
        Result<Integer> r1 = new Result<>(85);
        Result<Double> r2 = new Result<>(92.5);

        System.out.println("Integer Result:");
        r1.display();

        System.out.println("Double Result:");
        r2.display();
    }
}