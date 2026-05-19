package GUI;

import Logic.CompRepairClub;
import javax.swing.*;
import java.awt.*;

public class MainMenuRepair extends JFrame {

    private CompRepairClub club;

    public MainMenuRepair() {
        setTitle("Bahrain Polytechnic Computer Repairs Club");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        club = new CompRepairClub();

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        JLabel titleLabel = new JLabel("Bahrain Polytechnic Computer Repairs Club");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(new Color(0, 0, 255)); // Blue color
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(titleLabel, gbc);

        // Add Repair button
        JButton btnAddRepair = new JButton("Add Repair");
        btnAddRepair.setPreferredSize(new Dimension(150, 30));
        gbc.gridy = 1;
        mainPanel.add(btnAddRepair, gbc);

        // Complete Repair button
        JButton btnCompleteRepair = new JButton("Complete Repair");
        btnCompleteRepair.setPreferredSize(new Dimension(150, 30));
        gbc.gridy = 2;
        mainPanel.add(btnCompleteRepair, gbc);

        // Edit Repair button
        JButton btnEditRepair = new JButton("Edit Repair");
        btnEditRepair.setPreferredSize(new Dimension(150, 30));
        gbc.gridy = 3;
        mainPanel.add(btnEditRepair, gbc);

        // View All Repairs button
        JButton btnViewRepairs = new JButton("View All Repairs");
        btnViewRepairs.setPreferredSize(new Dimension(150, 30));
        gbc.gridy = 4;
        mainPanel.add(btnViewRepairs, gbc);

        // Exit button
        JButton btnExit = new JButton("Exit");
        btnExit.setPreferredSize(new Dimension(150, 30));
        gbc.gridy = 5;
        mainPanel.add(btnExit, gbc);

        // Action listeners
        btnAddRepair.addActionListener(e -> {
            new AddRepairFrame(club).setVisible(true);
        });

        btnCompleteRepair.addActionListener(e -> {
            new CompleteRepairFrame(club).setVisible(true);
        });

        btnEditRepair.addActionListener(e -> {
            new EditRepairFrame(club).setVisible(true);
        });

        btnViewRepairs.addActionListener(e -> {
            new ViewRepairsFrame(club).setVisible(true);
        });

        btnExit.addActionListener(e -> System.exit(0));

        add(mainPanel);
        setVisible(true);
    }
}