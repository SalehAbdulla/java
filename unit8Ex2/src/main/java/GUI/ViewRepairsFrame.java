package GUI;

import Logic.CompRepairClub;
import Logic.Repair;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Set;
// Optional Feat
public class ViewRepairsFrame extends JFrame {

    private CompRepairClub club;
    private JTable table;
    private DefaultTableModel tableModel;

    public ViewRepairsFrame(CompRepairClub club) {
        this.club = club;

        setTitle("View All Repairs");
        setSize(800, 500);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Title
        JLabel titleLabel = new JLabel("All Repairs in System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(new Color(0, 0, 255));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        // Create table
        String[] columnNames = {"Repair ID", "Make", "Model", "Customer Name", "Phone", "Problem"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make table read-only
            }
        };

        table = new JTable(tableModel);
        table.setRowHeight(25);
        table.getColumnModel().getColumn(5).setPreferredWidth(200); // Problem column wider

        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Button panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton btnRefresh = new JButton("Refresh");
        JButton btnClose = new JButton("Close");

        buttonPanel.add(btnRefresh);
        buttonPanel.add(btnClose);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        // Action listeners
        btnRefresh.addActionListener(e -> loadRepairs());
        btnClose.addActionListener(e -> dispose());

        add(panel);

        // Load repairs on opening
        loadRepairs();
    }

    private void loadRepairs() {
        // Clear existing rows
        tableModel.setRowCount(0);

        if (club.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "No repairs in the system!",
                    "Info",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Set<Integer> repairIds = club.getAllRepairIds();
        for (Integer id : repairIds) {
            Repair repair = club.getRepair(id);
            if (repair != null) {
                Object[] row = {
                        repair.getRepairId(),
                        repair.getMake(),
                        repair.getModel(),
                        repair.getCustomerName(),
                        repair.getCustomerPhone(),
                        repair.getProblemDescription()
                };
                tableModel.addRow(row);
            }
        }
    }
}