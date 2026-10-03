import java.util.Random;

class MyTask extends Thread {
    MyTask(String name) {
        super(name);
    }

    public void run() {
        Random random = new Random();
        int time = random.nextInt(501);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(getName() + " : Thread is executing");
    }
}

public class ques05 {
    public static void main(String[] args) {
        MyTask reader = new MyTask("Reader");
        MyTask writer = new MyTask("Writer");
        MyTask logger = new MyTask("Logger");

        reader.start();
        writer.start();
        logger.start();
    }
}
