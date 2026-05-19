package GUI;

import Logic.CompRepairClub;
import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class CompleteRepairFrame extends JFrame {

    private CompRepairClub club;
    private JComboBox<Integer> comboRepairId;

    public CompleteRepairFrame(CompRepairClub club) {
        this.club = club;

        setTitle("Complete Repair");
        setSize(800, 600);

        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15, 15, 15, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Complete Repair");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(new Color(0, 0, 255)); // Blue color
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        gbc.gridwidth = 1;

        // Repair ID label
        JLabel lblRepairId = new JLabel("Please choose the id of the repair you wish to complete :");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(lblRepairId, gbc);

        // Combo box
        comboRepairId = new JComboBox<>();
        populateComboBox();
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(comboRepairId, gbc);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnRemove = new JButton("Remove");
        JButton btnClose = new JButton("Close");

        buttonPanel.add(btnRemove);
        buttonPanel.add(btnClose);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(buttonPanel, gbc);

        // Action listeners
        btnRemove.addActionListener(e -> removeRepair());
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

    private void removeRepair() {
        if (comboRepairId.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this,
                    "No repairs to remove!",
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

        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to complete and remove Repair ID: " + selectedId + "?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            if (club.removeRepair(selectedId)) {
                JOptionPane.showMessageDialog(this,
                        "Repair completed and removed successfully!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                populateComboBox(); // Refresh combo box
            } else {
                JOptionPane.showMessageDialog(this,
                        "Error removing repair!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}