import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class TempConverter extends JFrame implements ActionListener {
    private JTextField res;
    private JTextField firstRowField;
    JRadioButton celsius;
    JRadioButton fahrenheit;
    JButton convertBtn;
    JButton testingBtn;

    public TempConverter() {
        super("Temperature Converter");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // --- Title Label ---
        JLabel lbl = new JLabel("Celsius Converter");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        add(lbl, BorderLayout.NORTH);

        // --- LEFT panel (WEST) ---
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

        leftPanel.setPreferredSize(new Dimension(650, 100));

        leftPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10,10,10));
        add(leftPanel, BorderLayout.WEST);
        lbl.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        // --- RIGHT panel (EAST) with image ---
        ImageIcon thermometerImg = new ImageIcon(Objects.requireNonNull(getClass().getResource("/thermometer.jpg")));
        JLabel imgLabel = new JLabel(thermometerImg);
        imgLabel.setBorder(BorderFactory.createEmptyBorder(0,0,0, 30));
        add(imgLabel, BorderLayout.EAST);

        JPanel firstRowPnl = new JPanel();
        firstRowPnl.setLayout(new FlowLayout());

        // first row inside the left pnl
        JLabel firstRowLbl = new JLabel("Temperature in Celsius:");
        firstRowField = new JTextField(15);

        firstRowPnl.add(firstRowLbl);
        firstRowPnl.add(firstRowField);
        leftPanel.add(firstRowPnl);
        firstRowPnl.setMaximumSize(new Dimension(Integer.MAX_VALUE, firstRowPnl.getPreferredSize().height));
        // second row inside left pnl
        JPanel secondRowPnl = new JPanel();
        secondRowPnl.setLayout(new FlowLayout());

        secondRowPnl.setMaximumSize(new Dimension(Integer.MAX_VALUE, secondRowPnl.getPreferredSize().height));

        convertBtn = new JButton("Convert");
        convertBtn.addActionListener(this);

        convertBtn.setSize(new Dimension(30, 30));
        res = new JTextField(15);

        res.setEnabled(false);
        res.setEditable(false);
        secondRowPnl.add(convertBtn);
        secondRowPnl.add(res);

        leftPanel.add(secondRowPnl);

        // Switch Panel
        JPanel switchPnl = new JPanel();
        switchPnl.setLayout(new FlowLayout());

        ButtonGroup btnGroup = new ButtonGroup();
        celsius = new JRadioButton("Celsius");
        celsius.setSelected(true);
        fahrenheit = new JRadioButton("Fahrenheit");

        btnGroup.add(celsius);
        btnGroup.add(fahrenheit);
        switchPnl.setBorder(BorderFactory.createTitledBorder("Switch To"));
        switchPnl.add(celsius);
        switchPnl.add(fahrenheit);
        leftPanel.add(switchPnl);

        JPanel dummyPnl = new JPanel();
        testingBtn = new JButton("Click me to test");
        testingBtn.addActionListener(this);
        dummyPnl.add(testingBtn);

        leftPanel.add(dummyPnl);

        setSize(820, 420);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TempConverter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == convertBtn) {
            // logic for converting
            Integer getUserInput = 0;
            try {
                getUserInput = Integer.parseInt(firstRowField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a number");
            }

            System.out.println(getUserInput);

            if (celsius.isSelected()) {
                res.setText(Double.toString((getUserInput * 9.0 / 5) + 32));
            } else {
                res.setText(Double.toString((getUserInput - 32) * 5 / 9.0));
            }
        } else if (e.getSource() == testingBtn) {
            JOptionPane.showMessageDialog(this, "Just For Testing");
        }
    }
}
