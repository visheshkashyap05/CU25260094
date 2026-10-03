public class ques03 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();

        System.out.println("Original Thread Name: " + t.getName());
        System.out.println("Thread Priority: " + t.getPriority());

        t.setName("MyMainThread");

        System.out.println("Changed Thread Name: " + t.getName());
    }
}
