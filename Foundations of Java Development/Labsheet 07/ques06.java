class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Thread is running...");
    }
}

public class ques06 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();

        System.out.println("Before starting: " + t.isAlive());

        t.start();

        System.out.println("While running: " + t.isAlive());

        t.join();

        System.out.println("After finishing: " + t.isAlive());
    }
}
