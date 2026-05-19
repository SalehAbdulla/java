import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

class DeserializeDisplay extends JFrame {

    private JTextArea displayArea;

    public DeserializeDisplay() {
        setTitle("Display Employees");
        setSize(500, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Title
        JLabel titleLabel = new JLabel("Employee Information");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        // Text area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(displayArea);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton deserializeBtn = new JButton("Deserialize and Display");
        JButton closeBtn = new JButton("Close");

        buttonPanel.add(deserializeBtn);
        buttonPanel.add(closeBtn);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Action listeners
        deserializeBtn.addActionListener(e -> deserializeAndDisplay());
        closeBtn.addActionListener(e -> dispose());

        add(panel);
    }

    @SuppressWarnings("unchecked")
    private void deserializeAndDisplay() {
        try (FileInputStream fis = new FileInputStream("employees.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            ArrayList<Employee> employees = (ArrayList<Employee>) ois.readObject();

            displayArea.setText("");
            displayArea.append("========== EMPLOYEE LIST ==========\n\n");

            for (int i = 0; i < employees.size(); i++) {
                Employee emp = employees.get(i);
                displayArea.append("Employee #" + (i + 1) + ":\n");
                displayArea.append(emp.toString());
                displayArea.append("-----------------------------------\n");
            }

            displayArea.append("\nTotal Employees: " + employees.size());

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this,
                    "File not found!\nPlease serialize employees first.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error reading file:\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this,
                    "Class not found:\n" + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
