import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ques07 extends JFrame implements ActionListener {

    JTextField temperatureField;
    JRadioButton cToFButton, fToCButton;
    JButton convertButton, clearButton;
    JLabel resultLabel;
    ButtonGroup group;

    ques07() {
        setTitle("Temperature Converter");
        setSize(500, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Temperature:"));
        temperatureField = new JTextField();
        add(temperatureField);

        add(new JLabel("Conversion:"));

        JPanel radioPanel = new JPanel();

        cToFButton = new JRadioButton("Celsius to Fahrenheit");
        fToCButton = new JRadioButton("Fahrenheit to Celsius");

        group = new ButtonGroup();
        group.add(cToFButton);
        group.add(fToCButton);

        cToFButton.setSelected(true);

        radioPanel.add(cToFButton);
        radioPanel.add(fToCButton);

        add(radioPanel);

        convertButton = new JButton("Convert");
        clearButton = new JButton("Clear");

        convertButton.addActionListener(this);
        clearButton.addActionListener(this);

        add(convertButton);
        add(clearButton);

        add(new JLabel("Result:"));

        resultLabel = new JLabel(" ");
        add(resultLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convertButton) {

            try {
                double temperature =
                        Double.parseDouble(temperatureField.getText());

                double result;

                if (cToFButton.isSelected()) {
                    result = (temperature * 9 / 5) + 32;
                    resultLabel.setText(
                            String.format("%.2f °F", result)
                    );
                } else {
                    result = (temperature - 32) * 5 / 9;
                    resultLabel.setText(
                            String.format("%.2f °C", result)
                    );
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "Please enter a valid temperature.",
                        "Invalid Input",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        if (e.getSource() == clearButton) {
            temperatureField.setText("");
            resultLabel.setText(" ");
            cToFButton.setSelected(true);
        }
    }

    public static void main(String[] args) {
        new ques07();
    }
}
