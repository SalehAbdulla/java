import javax.swing.*;
import java.awt.*;
import java.io.*;

public class NumberFileWriter extends JFrame {

    private JTextField[] numberFields;
    private int[] numbers;

    public NumberFileWriter() {
        setTitle("Save Numbers to File");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        numbers = new int[5];
        numberFields = new JTextField[5];

        // Main panel
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Enter 5 Numbers");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        mainPanel.add(titleLabel, gbc);

        // Create 5 number fields
        gbc.gridwidth = 1;
        for (int i = 0; i < 5; i++) {
            JLabel label = new JLabel("Number " + (i + 1) + ":");
            gbc.gridx = 0;
            gbc.gridy = i + 1;
            mainPanel.add(label, gbc);

            numberFields[i] = new JTextField(15);
            gbc.gridx = 1;
            mainPanel.add(numberFields[i], gbc);
        }

        // Save Numbers button
        JButton saveNumbersBtn = new JButton("Save Numbers");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        mainPanel.add(saveNumbersBtn, gbc);

        // Save to File button
        JButton saveToFileBtn = new JButton("Save to File");
        gbc.gridy = 7;
        mainPanel.add(saveToFileBtn, gbc);

        // Action listeners
        saveNumbersBtn.addActionListener(e -> saveNumbers());
        saveToFileBtn.addActionListener(e -> saveToFile());

        add(mainPanel);
        setVisible(true);
    }

    private void saveNumbers() {
        try {
            for (int i = 0; i < 5; i++) {
                String text = numberFields[i].getText().trim();
                if (text.isEmpty()) {
                    throw new NumberFormatException("Field " + (i + 1) + " is empty");
                }
                numbers[i] = Integer.parseInt(text);
            }
            JOptionPane.showMessageDialog(this,
                    "Numbers saved successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid integers in all fields!\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveToFile() {
        boolean success = false;

        while (!success) {
            try {
                String filePath = JOptionPane.showInputDialog(this,
                        "Enter file path and name:",
                        "Save File",
                        JOptionPane.PLAIN_MESSAGE);

                if (filePath == null) {
                    // User clicked cancel
                    JOptionPane.showMessageDialog(this,
                            "Save cancelled by user.",
                            "Info",
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }

                File file = new File(filePath);

                // Create PrintStream
                try (PrintStream ps = new PrintStream(file)) {

                    // Write numbers to file
                    // Intentionally cause IndexOutOfBoundsException by changing loop condition
                    // Change i < 5 to i < 6 to trigger the exception
                    for (int i = 0; i < 5; i++) {  // Change to i < 6 to test exception
                        ps.println(numbers[i]);
                    }

                    JOptionPane.showMessageDialog(this,
                            "Numbers saved to file successfully!\n" + filePath,
                            "Success",
                            JOptionPane.INFORMATION_MESSAGE);

                    success = true;

                } catch (IndexOutOfBoundsException e) {
                    JOptionPane.showMessageDialog(this,
                            "Index Out of Bounds Exception occurred!\n" + e.getMessage(),
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

            } catch (FileNotFoundException e) {
                int retry = JOptionPane.showConfirmDialog(this,
                        "File path not found!\n" + e.getMessage() + "\n\nWould you like to try again?",
                        "Error",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.ERROR_MESSAGE);

                if (retry != JOptionPane.YES_OPTION) {
                    return;
                }
            }
        }
    }


}
