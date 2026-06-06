import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PracticeWindow extends JFrame implements ActionListener {

        JLabel header = new JLabel("Employee Record", SwingConstants.CENTER);

        JButton enterInfoBtn = new JButton("Enter Employee Info and Serialize");
        JButton deSerializeBtn = new JButton("De-Serialise");

        JButton closeBtn = new JButton("Close");

        public PracticeWindow(){
            super("GridBagConstraint Practice");
            // 1- Main Panel
            JPanel mainPnl = new JPanel(new BorderLayout());
            mainPnl.setBorder(new EmptyBorder(10,10,10,10));

            header.setFont(new Font("Arial", Font.BOLD, 18));
            mainPnl.add(header, BorderLayout.NORTH);

            // 2- Center Section
            JPanel centerSection = new JPanel(new GridBagLayout());
                        // Blue-print object, place your component where ever you want
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;

            // Row 1
            JPanel wrapperBtn = new JPanel();
            wrapperBtn.add(enterInfoBtn);
            wrapperBtn.add(deSerializeBtn);
            centerSection.add(wrapperBtn, gbc);

            // Row 2
            JPanel wrapperBtn2 = new JPanel();
            wrapperBtn2.add(closeBtn);

            gbc.gridy = 1;
            centerSection.add(wrapperBtn2, gbc);
            mainPnl.add(centerSection, BorderLayout.CENTER);

            add(mainPnl);
            setSize(420, 420);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }




    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public static void main(String[] args) {
        new PracticeWindow();
    }



}
