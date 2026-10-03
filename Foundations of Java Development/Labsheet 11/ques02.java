import java.awt.*;
import java.awt.event.*;

public class ques02 extends Frame implements ActionListener {

    TextField num1Field, num2Field, resultField;
    Button addButton, subButton, mulButton, divButton;

    ques02() {
        setTitle("Simple Calculator");
        setSize(450, 300);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new Label("First Number:"));
        num1Field = new TextField();
        add(num1Field);

        add(new Label("Second Number:"));
        num2Field = new TextField();
        add(num2Field);

        add(new Label("Result:"));
        resultField = new TextField();
        resultField.setEditable(false);
        add(resultField);

        addButton = new Button("Addition");
        subButton = new Button("Subtraction");
        mulButton = new Button("Multiplication");
        divButton = new Button("Division");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1Field.getText());
            double b = Double.parseDouble(num2Field.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = a + b;
            } else if (e.getSource() == subButton) {
                result = a - b;
            } else if (e.getSource() == mulButton) {
                result = a * b;
            } else if (e.getSource() == divButton) {
                if (b == 0) {
                    resultField.setText("Cannot divide by zero");
                    return;
                }
                result = a / b;
            }

            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new ques02();
    }
}
