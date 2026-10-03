import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ques10 extends JFrame implements ActionListener {

    JTextField accountField;
    JTextField customerField;
    JTextField balanceField;
    JTextField amountField;

    JButton depositButton;
    JButton withdrawButton;
    JButton checkButton;
    JButton clearButton;

    double balance;

    ques10() {
        setTitle("Mini Banking Application");
        setSize(500, 400);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Account Number:"));
        accountField = new JTextField();
        add(accountField);

        add(new JLabel("Customer Name:"));
        customerField = new JTextField();
        add(customerField);

        add(new JLabel("Current Balance:"));
        balanceField = new JTextField();
        add(balanceField);

        add(new JLabel("Amount:"));
        amountField = new JTextField();
        add(amountField);

        depositButton = new JButton("Deposit");
        withdrawButton = new JButton("Withdraw");
        checkButton = new JButton("Check Balance");
        clearButton = new JButton("Clear");

        depositButton.addActionListener(this);
        withdrawButton.addActionListener(this);
        checkButton.addActionListener(this);
        clearButton.addActionListener(this);

        add(depositButton);
        add(withdrawButton);
        add(checkButton);
        add(clearButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == depositButton) {

                double amount =
                        Double.parseDouble(amountField.getText());

                if (amount <= 0) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Enter a valid deposit amount."
                    );
                    return;
                }

                balance += amount;
                balanceField.setText(String.valueOf(balance));

                JOptionPane.showMessageDialog(
                        this,
                        "Amount deposited successfully!"
                );

            } else if (e.getSource() == withdrawButton) {

                double amount =
                        Double.parseDouble(amountField.getText());

                if (amount <= 0) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Enter a valid withdrawal amount."
                    );
                    return;
                }

                if (amount <= balance) {

                    balance -= amount;
                    balanceField.setText(String.valueOf(balance));

                    JOptionPane.showMessageDialog(
                            this,
                            "Amount withdrawn successfully!"
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Insufficient balance!",
                            "Transaction Failed",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

            } else if (e.getSource() == checkButton) {

                JOptionPane.showMessageDialog(
                        this,
                        "Current Balance: ₹" + balance,
                        "Balance",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else if (e.getSource() == clearButton) {

                accountField.setText("");
                customerField.setText("");
                balanceField.setText("");
                amountField.setText("");

                balance = 0;
            }

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please enter a valid numeric amount.",
                    "Invalid Input",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args) {
        new ques10();
    }
}
