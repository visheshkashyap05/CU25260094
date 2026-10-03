class PriorityTask extends Thread {
    PriorityTask(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(
            getName() + " started with priority " + getPriority()
        );

        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Print " + i);
        }

        System.out.println(getName() + " finished.");
    }
}

public class ques09 {
    public static void main(String[] args) {
        PriorityTask t1 = new PriorityTask("Thread-1", 1);
        PriorityTask t2 = new PriorityTask("Thread-2", 3);
        PriorityTask t3 = new PriorityTask("Thread-3", 5);
        PriorityTask t4 = new PriorityTask("Thread-4", 7);
        PriorityTask t5 = new PriorityTask("Thread-5", 10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
