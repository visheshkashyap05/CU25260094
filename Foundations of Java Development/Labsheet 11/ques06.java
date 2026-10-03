import java.awt.*;
import java.awt.event.*;

public class ques06 extends Frame implements ActionListener {

    TextField idField, nameField, departmentField;
    TextField designationField, salaryField;

    Checkbox male, female;
    CheckboxGroup genderGroup;

    Choice departmentChoice;

    TextArea outputArea;

    Button submitButton, clearButton;

    ques06() {
        setTitle("Employee Registration Form");
        setSize(600, 550);
        setLayout(new BorderLayout(10, 10));

        Panel formPanel = new Panel();
        formPanel.setLayout(new GridLayout(7, 2, 10, 10));

        formPanel.add(new Label("Employee ID:"));
        idField = new TextField();
        formPanel.add(idField);

        formPanel.add(new Label("Name:"));
        nameField = new TextField();
        formPanel.add(nameField);

        formPanel.add(new Label("Department:"));
        departmentField = new TextField();
        formPanel.add(departmentField);

        formPanel.add(new Label("Designation:"));
        designationField = new TextField();
        formPanel.add(designationField);

        formPanel.add(new Label("Salary:"));
        salaryField = new TextField();
        formPanel.add(salaryField);

        formPanel.add(new Label("Gender:"));

        Panel genderPanel = new Panel();
        genderGroup = new CheckboxGroup();

        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);

        genderPanel.add(male);
        genderPanel.add(female);
        formPanel.add(genderPanel);

        formPanel.add(new Label("Department Selection:"));

        departmentChoice = new Choice();
        departmentChoice.add("Human Resources");
        departmentChoice.add("IT");
        departmentChoice.add("Finance");
        departmentChoice.add("Marketing");
        departmentChoice.add("Sales");

        formPanel.add(departmentChoice);

        add(formPanel, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();

        submitButton = new Button("Submit");
        clearButton = new Button("Clear");

        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        buttonPanel.add(submitButton);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        outputArea = new TextArea();
        outputArea.setEditable(false);
        add(outputArea, BorderLayout.SOUTH);

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

            outputArea.setText(
                    "EMPLOYEE INFORMATION\n" +
                    "----------------------------\n" +
                    "Employee ID: " + idField.getText() + "\n" +
                    "Name: " + nameField.getText() + "\n" +
                    "Department: " + departmentField.getText() + "\n" +
                    "Designation: " + designationField.getText() + "\n" +
                    "Salary: " + salaryField.getText() + "\n" +
                    "Gender: " + gender + "\n" +
                    "Department Selection: " +
                    departmentChoice.getSelectedItem()
            );
        }

        if (e.getSource() == clearButton) {
            idField.setText("");
            nameField.setText("");
            departmentField.setText("");
            designationField.setText("");
            salaryField.setText("");

            genderGroup.setSelectedCheckbox(null);
            departmentChoice.select(0);

            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new ques06();
    }
}
