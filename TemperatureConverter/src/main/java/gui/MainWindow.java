package gui;
import logic.Celsius;
import logic.Fahrenheit;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class MainWindow extends JFrame {

    // Class-level fields
    private JTextField txtInput;
    private JTextField txtOutput;
    private JRadioButton radCelcius;
    private JRadioButton radFahrenheit;
    private JLabel lblTitle;
    private JLabel lblTemp;
    private JButton btnConvert;

    public MainWindow() {
        setTitle("Temperature Converter");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title label
        lblTitle = new JLabel("Celcius Converter", SwingConstants.CENTER);
        lblTitle.setForeground(new Color(255, 0, 51));
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
        add(lblTitle, BorderLayout.PAGE_START);

        // Center panel
        JPanel pnlCenter = new JPanel();
        pnlCenter.setBorder(BorderFactory.createEtchedBorder());
        pnlCenter.setLayout(new BorderLayout());

        // Grid panel
        JPanel pnlGrid = new JPanel();
        pnlGrid.setLayout(new GridLayout(2, 2, 5, 8));

        lblTemp = new JLabel("Temperature in Celcius");
        lblTemp.setForeground(new Color(0, 0, 255));
        lblTemp.setFont(new Font("Tahoma", Font.BOLD, 12));
        pnlGrid.add(lblTemp);

        txtInput = new JTextField(10);
        pnlGrid.add(txtInput);

        btnConvert = new JButton("Convert to Fahrenheit");
        btnConvert.addActionListener(e -> btnConvertActionPerformed(e));
        pnlGrid.add(btnConvert);

        txtOutput = new JTextField(10);
        pnlGrid.add(txtOutput);

        pnlCenter.add(pnlGrid, BorderLayout.PAGE_START);

        // Radio buttons panel
        JPanel pnlRadioButtons = new JPanel();
        pnlRadioButtons.setBorder(BorderFactory.createTitledBorder("Switch To"));

        radCelcius = new JRadioButton("Celcius");
        radFahrenheit = new JRadioButton("Fahrenheit");
        radCelcius.setSelected(true);

        radCelcius.addActionListener(e -> celciusBtnActionPerformed());
        radFahrenheit.addActionListener(e -> fahrenheitBtnActionPerformed());

        pnlRadioButtons.add(radCelcius);
        pnlRadioButtons.add(radFahrenheit);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radCelcius);
        buttonGroup.add(radFahrenheit);

        pnlCenter.add(pnlRadioButtons, BorderLayout.CENTER);

        // Image
        ImageIcon thermometerIcon = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("celcius.jpg")));
        JLabel lblThermometer = new JLabel(thermometerIcon);
        add(lblThermometer, BorderLayout.LINE_END);

        add(pnlCenter, BorderLayout.CENTER);

        // Center the window on screen
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);

        setVisible(true);
    }

    // Convert button event
    private void btnConvertActionPerformed(java.awt.event.ActionEvent e) {
        String inputText = txtInput.getText();
        double temp = Double.parseDouble(inputText);

        if (radCelcius.isSelected()) {
            Celsius c = new Celsius(temp);
            temp = c.getTempInFahrenheit();
        } else if (radFahrenheit.isSelected()) {
            Fahrenheit f = new Fahrenheit(temp);
            temp = f.getTempInCelsius();
        }

        txtOutput.setText(Double.toString(temp));
    }

    // Celsius radio button event
    private void celciusBtnActionPerformed() {
        lblTitle.setText("Converting Celsius to Fahrenheit");
        lblTemp.setText("Temperature in Celsius");
        btnConvert.setText("Convert to Fahrenheit");
        txtInput.setText(null);
        txtOutput.setText(null);
    }

    // Fahrenheit radio button event
    private void fahrenheitBtnActionPerformed() {
        lblTitle.setText("Converting Fahrenheit to Celsius");
        lblTemp.setText("Temperature in Fahrenheit");
        btnConvert.setText("Convert to Celsius");
        txtInput.setText(null);
        txtOutput.setText(null);
    }
}