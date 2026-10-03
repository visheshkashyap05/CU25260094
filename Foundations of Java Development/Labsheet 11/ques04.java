import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ques04 extends JFrame implements ActionListener {

    JTextField englishField, mathsField, javaField;
    JTextField dbmsField, cnField;
    JButton calculateButton;

    ques04() {
        setTitle("Student Marksheet");
        setSize(450, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("English:"));
        englishField = new JTextField();
        add(englishField);

        add(new JLabel("Mathematics:"));
        mathsField = new JTextField();
        add(mathsField);

        add(new JLabel("Java:"));
        javaField = new JTextField();
        add(javaField);

        add(new JLabel("DBMS:"));
        dbmsField = new JTextField();
        add(dbmsField);

        add(new JLabel("Computer Networks:"));
        cnField = new JTextField();
        add(cnField);

        calculateButton = new JButton("Calculate Result");
        calculateButton.addActionListener(this);
        add(calculateButton);
        add(new JLabel(""));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int english = Integer.parseInt(englishField.getText());
            int maths = Integer.parseInt(mathsField.getText());
            int java = Integer.parseInt(javaField.getText());
            int dbms = Integer.parseInt(dbmsField.getText());
            int cn = Integer.parseInt(cnField.getText());

            if (english < 0 || english > 100 ||
                maths < 0 || maths > 100 ||
                java < 0 || java > 100 ||
                dbms < 0 || dbms > 100 ||
                cn < 0 || cn > 100) {
                JOptionPane.showMessageDialog(this,
                        "Marks must be between 0 and 100.");
                return;
            }

            int total = english + maths + java + dbms + cn;
            double percentage = total / 5.0;

            String grade;

            if (percentage >= 90)
                grade = "A+";
            else if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else
                grade = "F";

            boolean pass = english >= 33 &&
                           maths >= 33 &&
                           java >= 33 &&
                           dbms >= 33 &&
                           cn >= 33;

            String status = pass ? "PASS" : "FAIL";

            String result =
                    "Total Marks: " + total +
                    "\nPercentage: " + percentage + "%" +
                    "\nGrade: " + grade +
                    "\nStatus: " + status;

            JOptionPane.showMessageDialog(
                    this,
                    result,
                    "Marksheet Result",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numeric marks."
            );
        }
    }

    public static void main(String[] args) {
        new ques04();
    }
}
