package ui;

import logic.Serializer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.exit;

public class MainWindow extends JFrame implements ActionListener {

    Serializer serializer = new Serializer("./src/main/java/Employee.dat");

    JLabel jLbl = new JLabel("Employee Records", SwingConstants.CENTER);
    JButton enterInfoBtn = new JButton("Enter Employee Info and Serialize");
    JButton deSerializeBtn = new JButton("De-Serialize");
    JButton closeBtn = new JButton("Close");



    public MainWindow(){
        super("Unit7 Exercise 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel main = new JPanel(new BorderLayout(0, 20));
        main.setBorder(new EmptyBorder(20, 20, 20, 20));

        jLbl.setFont(new Font("Arial", Font.BOLD, 18));
        jLbl.setBorder(new EmptyBorder(15, 0,0,0));
        main.add(jLbl, BorderLayout.NORTH);

        // 2. Central Panel using GridBagLayout to hold ALL buttons
        JPanel centerPanel = new JPanel(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 20, 0);

        // Row 1: The two main buttons side-by-side
        JPanel actionBtnWrapper = new JPanel();

        enterInfoBtn.addActionListener(this);
        actionBtnWrapper.add(enterInfoBtn);

        actionBtnWrapper.add(deSerializeBtn);
        deSerializeBtn.addActionListener(this);

        centerPanel.add(actionBtnWrapper, gbc);

        // Row 2: The close button right underneath
        gbc.gridy = 1;
        gbc.insets = new Insets(0,0,0,0);
        JPanel closeBtnWrapper = new JPanel();
        closeBtn.addActionListener(this);
        closeBtnWrapper.add(closeBtn);
        centerPanel.add(closeBtnWrapper, gbc);


        main.add(centerPanel, BorderLayout.CENTER);

        add(main);
        setSize(new Dimension(520, 320));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(enterInfoBtn)) {
            new ReadInfoSerialize(serializer);
        } else if (e.getSource().equals(closeBtn)) {
            exit(0);
        } else if (e.getSource().equals(deSerializeBtn)) {
            new DeserializeDisplay(serializer);
        }
    }
}
