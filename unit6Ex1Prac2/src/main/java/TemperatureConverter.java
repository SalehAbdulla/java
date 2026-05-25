import javax.swing.*;
import java.awt.*;

public class TemperatureConverter extends JFrame {

    private JTextField inputField, resultField;
    private JRadioButton celsiusBtn, fahrenheitBtn;
    private boolean convertingFromCelsius = true;

    public TemperatureConverter() {
        setTitle("Temperature Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // ── NORTH: Title ──────────────────────────────────────
        JLabel title = new JLabel("Celcius Converter", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setForeground(Color.RED);
        title.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(title, BorderLayout.NORTH);

        // ── CENTER: Main area ─────────────────────────────────
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Left panel — 3 rows
        JPanel leftPanel = new JPanel(new GridLayout(3, 1, 5, 10));
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

        // Row 1: Label + Input
        JPanel row1 = new JPanel(new GridLayout(1, 2, 5, 0));
        JLabel inputLabel = new JLabel("Temperature in Celcius :");
        inputLabel.setFont(new Font("Arial", Font.BOLD, 13));
        inputLabel.setForeground(new Color(0, 0, 180));
        inputField = new JTextField();
        row1.add(inputLabel);
        row1.add(inputField);

        // Row 2: Button + Result
        JPanel row2 = new JPanel(new GridLayout(1, 2, 5, 0));
        JButton convertBtn = new JButton("Convert to Farhenheit");
        resultField = new JTextField();
        resultField.setEditable(false);
        convertBtn.addActionListener(e -> convert());
        row2.add(convertBtn);
        row2.add(resultField);

        // Row 3: Switch To (radio buttons in titled border panel)
        JPanel row3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 10));
        row3.setBorder(BorderFactory.createTitledBorder("Switch To"));
        celsiusBtn    = new JRadioButton("celcius", true);
        fahrenheitBtn = new JRadioButton("fahrenheit");
        ButtonGroup group = new ButtonGroup();
        group.add(celsiusBtn);
        group.add(fahrenheitBtn);

        celsiusBtn.addActionListener(e -> switchMode(true));
        fahrenheitBtn.addActionListener(e -> switchMode(false));

        row3.add(celsiusBtn);
        row3.add(fahrenheitBtn);

        leftPanel.add(row1);
        leftPanel.add(row2);
        leftPanel.add(row3);

        // Right panel: Thermometer image
        JLabel thermometer = new JLabel(new ImageIcon("thermometer.png"));
        thermometer.setPreferredSize(new Dimension(150, 300));
        thermometer.setHorizontalAlignment(SwingConstants.CENTER);

        mainPanel.add(leftPanel, BorderLayout.CENTER);
        mainPanel.add(thermometer, BorderLayout.EAST);
        add(mainPanel, BorderLayout.CENTER);

        pack();
        setSize(750, 450);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void convert() {
        try {
            double input = Double.parseDouble(inputField.getText());
            double result = convertingFromCelsius
                    ? (input * 9 / 5) + 32      // °C → °F
                    : (input - 32) * 5 / 9;     // °F → °C
            resultField.setText(String.format("%.2f", result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter a valid number.");
        }
    }

    private void switchMode(boolean fromCelsius) {
        convertingFromCelsius = fromCelsius;
        inputField.setText("");
        resultField.setText("");
        // Update labels based on mode
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TemperatureConverter::new);
    }
}