import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ques05 extends JFrame implements ActionListener {

    JTextField nameField;
    JComboBox<String> courseBox;
    JRadioButton maleButton, femaleButton;
    JCheckBox javaBox, dbmsBox, pythonBox, webBox;
    JButton submitButton, resetButton;
    ButtonGroup genderGroup;

    ques05() {
        setTitle("Course Selection Form");
        setSize(550, 400);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Student Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Course:"));
        courseBox = new JComboBox<>(
                new String[]{"BCA", "B.Tech", "MCA", "BBA"}
        );
        add(courseBox);

        add(new JLabel("Gender:"));

        JPanel genderPanel = new JPanel();
        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        genderPanel.add(maleButton);
        genderPanel.add(femaleButton);
        add(genderPanel);

        add(new JLabel("Subjects:"));

        JPanel subjectPanel = new JPanel();

        javaBox = new JCheckBox("Java");
        dbmsBox = new JCheckBox("DBMS");
        pythonBox = new JCheckBox("Python");
        webBox = new JCheckBox("Web");

        subjectPanel.add(javaBox);
        subjectPanel.add(dbmsBox);
        subjectPanel.add(pythonBox);
        subjectPanel.add(webBox);

        add(subjectPanel);

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(submitButton);
        add(resetButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {

            String gender = "Not Selected";

            if (maleButton.isSelected())
                gender = "Male";
            else if (femaleButton.isSelected())
                gender = "Female";

            StringBuilder subjects = new StringBuilder();

            if (javaBox.isSelected())
                subjects.append("Java, ");
            if (dbmsBox.isSelected())
                subjects.append("DBMS, ");
            if (pythonBox.isSelected())
                subjects.append("Python, ");
            if (webBox.isSelected())
                subjects.append("Web Development, ");

            String result =
                    "Student Name: " + nameField.getText() +
                    "\nCourse: " + courseBox.getSelectedItem() +
                    "\nGender: " + gender +
                    "\nSubjects: " + subjects;

            JOptionPane.showMessageDialog(
                    this,
                    result,
                    "Selected Information",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        if (e.getSource() == resetButton) {
            nameField.setText("");
            courseBox.setSelectedIndex(0);
            genderGroup.clearSelection();

            javaBox.setSelected(false);
            dbmsBox.setSelected(false);
            pythonBox.setSelected(false);
            webBox.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new ques05();
    }
}
