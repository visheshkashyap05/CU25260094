class PriorityThread extends Thread {
    PriorityThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName() + " is running.");
    }
}

public class ques08 {
    public static void main(String[] args) {
        PriorityThread high = new PriorityThread("High Priority Thread");
        PriorityThread low = new PriorityThread("Low Priority Thread");

        high.setPriority(Thread.MAX_PRIORITY);
        low.setPriority(Thread.MIN_PRIORITY);

        System.out.println(high.getName() + " Priority: " + high.getPriority());
        System.out.println(low.getName() + " Priority: " + low.getPriority());

        high.start();
        low.start();
    }
}
