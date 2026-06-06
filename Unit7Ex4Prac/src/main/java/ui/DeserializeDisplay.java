package ui;

import logic.Serializer;
import model.Employee;
import ui.components.UIComponents;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class DeserializeDisplay extends JFrame implements ActionListener {
    JLabel empInfoLbl = UIComponents.createHeader("Employee Information");
    JButton deSerializeAndDispBtn = UIComponents.createSecondaryButton("De-serialize and Display");
    JButton closeBtn = UIComponents.createSecondaryButton("Close");

    JTextArea jTextArea = new JTextArea(15, 20); // Adjusted dimensions for a better aspect ratio
    JScrollPane jScrollPane = new JScrollPane(jTextArea);

    Serializer serializer;

    public DeserializeDisplay(Serializer serializer){
        super("Employee Info"); // Matches the clean look
        this.serializer = serializer;
        // Main background panel
        JPanel mainPnl = new JPanel(new GridBagLayout());
        mainPnl.setBorder(new EmptyBorder(25, 25, 25, 25));
        mainPnl.setBackground(new Color(216, 228, 240)); // Approximate light blue/grey from image

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Generous padding between elements
        gbc.fill = GridBagConstraints.BOTH;

        // 1. Header (Top Right)
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0.0;
        empInfoLbl.setHorizontalAlignment(SwingConstants.LEFT);
        mainPnl.add(empInfoLbl, gbc);

        // 2. De-serialize and Display Button (Middle Left)
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL; // Keep button natural width but filled horizontally if needed
        gbc.anchor = GridBagConstraints.CENTER;
        deSerializeAndDispBtn.addActionListener(this);
        mainPnl.add(deSerializeAndDispBtn, gbc);

        // 3. Scroll Pane with Text Area (Middle Right, spanning down)
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 2; // Spans across the rows of both buttons
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        // Optional: Ensure the text area is non-editable like a display sheet
        jTextArea.setEditable(false);
        mainPnl.add(jScrollPane, gbc);

        // 4. Close Button (Bottom Left)
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.weightx = 0.0;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.SOUTH; // Pushes it towards the bottom
        mainPnl.add(closeBtn, gbc);

        // Frame Setup
        add(mainPnl);
        pack(); // Packs components tightly to respect preferred sizes
        setSize(new Dimension(650, 400)); // Standard wide aspect ratio matching your image
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(deSerializeAndDispBtn)) {
            try {
                ArrayList<Employee> employeeArrayList = (ArrayList<Employee>) (serializer.deserializeObject());
                StringBuilder buff = new StringBuilder();
                for (Employee emp: employeeArrayList) {

                    buff.append(emp.getFirstName() + "\n" + emp.getLastName() + "\n" + emp.getAddress() + "\n" + emp.getPhone() + "\n"
                    + "--".repeat(10)
                    );

                    System.out.println(emp.getFirstName());
                    System.out.println(emp.getLastName());
                    System.out.println(emp.getAddress());
                    System.out.println(emp.getPhone());
                    System.out.println("--".repeat(30));
                }

                jTextArea.setText(buff.toString());

            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }

    }
}