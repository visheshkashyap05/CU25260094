import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ques08 extends JFrame implements ActionListener {

    JTextArea textArea;

    JMenuItem newItem;
    JMenuItem openItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ques08() {
        setTitle("Simple Notepad");
        setSize(700, 500);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newItem) {
            textArea.setText("");

        } else if (e.getSource() == openItem) {

            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try (BufferedReader reader =
                             new BufferedReader(new FileReader(file))) {

                    textArea.read(reader, null);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Error opening file: " + ex.getMessage()
                    );
                }
            }

        } else if (e.getSource() == saveItem) {

            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(this);

            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();

                try (BufferedWriter writer =
                             new BufferedWriter(new FileWriter(file))) {

                    textArea.write(writer);

                    JOptionPane.showMessageDialog(
                            this,
                            "File saved successfully!"
                    );

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(
                            this,
                            "Error saving file: " + ex.getMessage()
                    );
                }
            }

        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ques08();
    }
}
