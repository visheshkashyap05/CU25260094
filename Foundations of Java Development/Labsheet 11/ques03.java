import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ques03 extends JFrame implements ActionListener {

    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, resetButton;

    ques03() {
        setTitle("Student Login Form");
        setSize(400, 250);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        resetButton = new JButton("Reset");

        loginButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(loginButton);
        add(resetButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("student") && password.equals("1234")) {
                JOptionPane.showMessageDialog(
                        this,
                        "Login Successful!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Username or Password!",
                        "Login Failed",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        if (e.getSource() == resetButton) {
            usernameField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        new ques03();
    }
}
