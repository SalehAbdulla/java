package GUI;

import Logic.CompRepairClub;
import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class EditRepairFrame extends JFrame {

    private CompRepairClub club;
    private JComboBox<Integer> comboRepairId;
    private JTextField txtMake, txtModel, txtName, txtPhone;
    private JTextArea txtProblem;

    public EditRepairFrame(CompRepairClub club) {
        this.club = club;

        setTitle("Edit Repair Details");
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Edit Repair Details");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(new Color(0, 0, 255)); // Blue color
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        gbc.gridwidth = 1;

        // Repair ID combo box
        JLabel lblRepairId = new JLabel("Please choose the id of the repair you wish to edit :");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(lblRepairId, gbc);

        comboRepairId = new JComboBox<>();
        populateComboBox();
        gbc.gridy = 2;
        panel.add(comboRepairId, gbc);

        gbc.gridwidth = 1;

        // Info label
        JLabel lblInfo = new JLabel("Please enter the new information of the items you wish to edit :");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(lblInfo, gbc);

        gbc.gridwidth = 1;

        // Make and Model on same row
        JLabel lblMake = new JLabel("Make :");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(lblMake, gbc);

        txtMake = new JTextField(8);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(txtMake, gbc);

        JLabel lblModel = new JLabel("Model :");
        gbc.gridx = 2;
        panel.add(lblModel, gbc);

        txtModel = new JTextField(15);
        gbc.gridx = 3;
        panel.add(txtModel, gbc);

        // Problem Description
        JLabel lblProblem = new JLabel("Problem Description :");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        panel.add(lblProblem, gbc);

        txtProblem = new JTextArea(4, 30);
        txtProblem.setLineWrap(true);
        txtProblem.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(txtProblem);
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(scrollPane, gbc);

        // Name and Phone on same row
        JLabel lblName = new JLabel("Name :");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(lblName, gbc);

        txtName = new JTextField(8);
        gbc.gridx = 1;
        panel.add(txtName, gbc);

        JLabel lblPhone = new JLabel("Phone :");
        gbc.gridx = 2;
        panel.add(lblPhone, gbc);

        txtPhone = new JTextField(12);
        gbc.gridx = 3;
        panel.add(txtPhone, gbc);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btnSave = new JButton("Save");
        JButton btnClose = new JButton("Close");

        buttonPanel.add(btnSave);
        buttonPanel.add(btnClose);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(buttonPanel, gbc);

        // Action listeners
        btnSave.addActionListener(e -> saveChanges());
        btnClose.addActionListener(e -> dispose());

        add(panel);
    }

    private void populateComboBox() {
        comboRepairId.removeAllItems();

        if (club.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No repairs in the system!",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Set<Integer> repairIds = club.getAllRepairIds();
        for (Integer id : repairIds) {
            comboRepairId.addItem(id);
        }
    }

    private void saveChanges() {
        if (comboRepairId.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this,
                    "No repairs to edit!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        Integer selectedId = (Integer) comboRepairId.getSelectedItem();

        if (selectedId == null) {
            JOptionPane.showMessageDialog(this,
                    "Please select a repair ID!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String make = txtMake.getText().trim();
        String model = txtModel.getText().trim();
        String name = txtName.getText().trim();
        String phone = txtPhone.getText().trim();
        String problem = txtProblem.getText().trim();

        if (club.updateRepair(selectedId, problem, make, model, name, phone)) {
            JOptionPane.showMessageDialog(this,
                    "Repair updated successfully!",
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);

            // Clear fields
            txtMake.setText("");
            txtModel.setText("");
            txtName.setText("");
            txtPhone.setText("");
            txtProblem.setText("");
        } else {
            JOptionPane.showMessageDialog(this,
                    "Error updating repair!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}