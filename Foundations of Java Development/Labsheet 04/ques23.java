class PrimeChecker {
    static int totalPrimeChecks = 0;

    void check(int number) {
        boolean prime = true;

        if (number <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        totalPrimeChecks++;

        if (prime) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }
    }
}

public class ques23 {
    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();
        p.check(17);

        System.out.println("Total Prime Checks: "
                + PrimeChecker.totalPrimeChecks);
    }
}
