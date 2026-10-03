class SimpleInterest {
    double principal;
    double rate;
    double time;
    static String bank = "ABC Bank";

    SimpleInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        System.out.println("Bank: " + bank);
        System.out.println("Principal: " + principal);
        System.out.println("Interest: " + interest);
        System.out.println("Total Amount: " + totalAmount);
    }
}

public class ques15 {
    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest(10000, 5, 2);
        s.calculateInterest();
    }
}
