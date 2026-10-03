import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ques09 extends JFrame implements ActionListener {

    JTextField nameField, rollField, courseField;

    JRadioButton excellent, veryGood, good, average, poor;
    ButtonGroup ratingGroup;

    JCheckBox teaching, laboratory, courseMaterial, assignments;

    JTextArea commentsArea;

    JButton submitButton, resetButton;

    ques09() {
        setTitle("Student Feedback Form");
        setSize(650, 600);
        setLayout(new BorderLayout(10, 10));

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(7, 2, 10, 10));

        formPanel.add(new JLabel("Student Name:"));
        nameField = new JTextField();
        formPanel.add(nameField);

        formPanel.add(new JLabel("Roll Number:"));
        rollField = new JTextField();
        formPanel.add(rollField);

        formPanel.add(new JLabel("Course:"));
        courseField = new JTextField();
        formPanel.add(courseField);

        formPanel.add(new JLabel("Rating:"));

        JPanel ratingPanel = new JPanel();

        excellent = new JRadioButton("Excellent");
        veryGood = new JRadioButton("Very Good");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        poor = new JRadioButton("Poor");

        ratingGroup = new ButtonGroup();

        ratingGroup.add(excellent);
        ratingGroup.add(veryGood);
        ratingGroup.add(good);
        ratingGroup.add(average);
        ratingGroup.add(poor);

        ratingPanel.add(excellent);
        ratingPanel.add(veryGood);
        ratingPanel.add(good);
        ratingPanel.add(average);
        ratingPanel.add(poor);

        formPanel.add(ratingPanel);

        formPanel.add(new JLabel("Feedback Areas:"));

        JPanel feedbackPanel = new JPanel();

        teaching = new JCheckBox("Teaching");
        laboratory = new JCheckBox("Laboratory");
        courseMaterial = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");

        feedbackPanel.add(teaching);
        feedbackPanel.add(laboratory);
        feedbackPanel.add(courseMaterial);
        feedbackPanel.add(assignments);

        formPanel.add(feedbackPanel);

        formPanel.add(new JLabel("Comments:"));

        commentsArea = new JTextArea(5, 20);
        formPanel.add(new JScrollPane(commentsArea));

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        submitButton.addActionListener(this);
        resetButton.addActionListener(this);

        formPanel.add(submitButton);
        formPanel.add(resetButton);

        add(formPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == submitButton) {

            String rating = "Not Selected";

            if (excellent.isSelected())
                rating = "Excellent";
            else if (veryGood.isSelected())
                rating = "Very Good";
            else if (good.isSelected())
                rating = "Good";
            else if (average.isSelected())
                rating = "Average";
            else if (poor.isSelected())
                rating = "Poor";

            StringBuilder feedback = new StringBuilder();

            if (teaching.isSelected())
                feedback.append("Teaching, ");
            if (laboratory.isSelected())
                feedback.append("Laboratory, ");
            if (courseMaterial.isSelected())
                feedback.append("Course Material, ");
            if (assignments.isSelected())
                feedback.append("Assignments, ");

            String result =
                    "Student Name: " + nameField.getText() +
                    "\nRoll Number: " + rollField.getText() +
                    "\nCourse: " + courseField.getText() +
                    "\nRating: " + rating +
                    "\nFeedback Areas: " + feedback +
                    "\nComments: " + commentsArea.getText();

            JOptionPane.showMessageDialog(
                    this,
                    result,
                    "Student Feedback",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        if (e.getSource() == resetButton) {

            nameField.setText("");
            rollField.setText("");
            courseField.setText("");

            ratingGroup.clearSelection();

            teaching.setSelected(false);
            laboratory.setSelected(false);
            courseMaterial.setSelected(false);
            assignments.setSelected(false);

            commentsArea.setText("");
        }
    }

    public static void main(String[] args) {
        new ques09();
    }
}
