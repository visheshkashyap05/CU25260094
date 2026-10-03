class Armstrong {
    static int totalChecks = 0;

    void check(int number) {
        int original = number;
        int temp = number;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        totalChecks++;

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}

public class ques22 {
    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.check(153);

        System.out.println("Total Checks: " + Armstrong.totalChecks);
    }
}
