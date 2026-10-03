public class ques07 {

    public static <T> void display(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        display(100);
        display(99.99);
        display("Hello Java");
        display('A');
    }
}