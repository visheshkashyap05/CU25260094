class Fibonacci {
    static int seriesCount = 0;

    void display(int n) {
        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        seriesCount++;
    }
}

public class ques24 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        f.display(10);

        System.out.println();
        System.out.println("Series Count: " + Fibonacci.seriesCount);
    }
}
