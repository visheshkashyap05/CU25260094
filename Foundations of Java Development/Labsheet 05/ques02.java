class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public String getAccountNumber() { return accountNumber; }
    public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
    public String getAccountHolder() { return accountHolder; }
    public void setBalance(double balance) { this.balance = balance; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }
}

public class ques02 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("ACC101");
        account.setAccountHolder("Rahul");
        account.setBalance(10000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(5000);
        account.withdraw(3000);
        account.withdraw(20000);
        account.deposit(-500);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
