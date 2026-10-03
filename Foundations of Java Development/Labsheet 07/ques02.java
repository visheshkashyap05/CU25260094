class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Vishesh");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ques02 {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
    }
}
