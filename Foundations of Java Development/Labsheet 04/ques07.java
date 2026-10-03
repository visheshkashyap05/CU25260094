class BankAccount {
    long accountNumber;
    double balance;
    static String bankName = "State Bank";

    BankAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        double depositAmount = amount;
        double newBalance = balance + depositAmount;

        balance = newBalance;

        System.out.println("Deposited: " + depositAmount);
        System.out.println("Balance: " + balance);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank: " + bankName);
    }
}

public class ques07 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, 10000);

        account.display();
        account.deposit(5000);
    }
}
