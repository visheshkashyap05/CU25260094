import java.awt.*;
import java.awt.event.*;

public class ques01 extends Frame implements ActionListener {

    TextField nameField, rollField, courseField;
    Checkbox male, female;
    CheckboxGroup genderGroup;
    Choice semesterChoice;
    Button submitButton, resetButton;

    ques01() {
        setTitle("Student Registration Form");
        setSize(450, 400);
        setLayout(new GridLayout(7, 2, 10, 10));

        add(new Label("Student Name:"));
        nameField = new TextField();
        add(nameField);

        add(new Label("Roll Number:"));
        rollField = new TextField();
        add(rollField);

        add(new Label("Course:"));
        courseField = new TextField();
        add(courseField);

        add(new Label("Gender:"));
        Panel genderPanel = new Panel();
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new Label("Semester:"));
        semesterChoice = new Choice();
        semesterChoice.add("1st Semester");
        semesterChoice.add("2nd Semester");
        semesterChoice.add("3rd Semester");
        semesterChoice.add("4th Semester");
        semesterChoice.add("5th Semester");
        semesterChoice.add("6th Semester");
        add(semesterChoice);

        submitButton = new Button("Submit");
        resetButton = new Button("Reset");

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        add(submitButton);
        add(resetButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String gender = genderGroup.getSelectedCheckbox() == null
                    ? "Not Selected"
                    : genderGroup.getSelectedCheckbox().getLabel();

            String message =
                    "Student Name: " + nameField.getText() +
                    "\nRoll Number: " + rollField.getText() +
                    "\nCourse: " + courseField.getText() +
                    "\nGender: " + gender +
                    "\nSemester: " + semesterChoice.getSelectedItem();

            Dialog dialog = new Dialog(this, "Registration Details", true);
            dialog.setLayout(new FlowLayout());
            dialog.add(new TextArea(message, 8, 35, TextArea.SCROLLBARS_BOTH));
            Button ok = new Button("OK");
            ok.addActionListener(ev -> dialog.dispose());
            dialog.add(ok);
            dialog.setSize(400, 250);
            dialog.setVisible(true);
        }

        if (e.getSource() == resetButton) {
            nameField.setText("");
            rollField.setText("");
            courseField.setText("");
            genderGroup.setSelectedCheckbox(null);
            semesterChoice.select(0);
        }
    }

    public static void main(String[] args) {
        new ques01();
    }
}
