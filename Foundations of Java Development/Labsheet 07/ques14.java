class Lock1 {
}

class Lock2 {
}

class ThreadOne extends Thread {
    Lock1 lock1;
    Lock2 lock2;

    ThreadOne(Lock1 lock1, Lock2 lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock1) {
            System.out.println("Thread One acquired Lock1");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Thread One waiting for Lock2");

            synchronized (lock2) {
                System.out.println("Thread One acquired Lock2");
            }
        }
    }
}

class ThreadTwo extends Thread {
    Lock1 lock1;
    Lock2 lock2;

    ThreadTwo(Lock1 lock1, Lock2 lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    public void run() {
        synchronized (lock2) {
            System.out.println("Thread Two acquired Lock2");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println("Thread Two waiting for Lock1");

            synchronized (lock1) {
                System.out.println("Thread Two acquired Lock1");
            }
        }
    }
}

public class ques14 {
    public static void main(String[] args) {
        Lock1 lock1 = new Lock1();
        Lock2 lock2 = new Lock2();

        ThreadOne t1 = new ThreadOne(lock1, lock2);
        ThreadTwo t2 = new ThreadTwo(lock1, lock2);

        t1.start();
        t2.start();
    }
}
