import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {

    Circle circle = new Circle();

    JLabel headerLbl = new JLabel("Declare and Throw Exception", SwingConstants.CENTER);
    JLabel radiusLbl = new JLabel("Radius");
    JTextField radiusFld = new JTextField(12);
    JButton radiusBtn = new JButton("create circle");

    JLabel areaLbl = new JLabel("Area:");
    JTextField areaFld = new JTextField(12);


    public MainWindow(){
        super("learning java 2 with Tasbeeh");
        JPanel mainSection = new JPanel(new GridLayout(4, 1));

        // -- Header
        headerLbl.setBorder(new EmptyBorder(20, 0, 20,0));
        headerLbl.setFont(new Font("Arial", Font.BOLD, 18));
        mainSection.add(headerLbl);

        // -- Radius + Field
        JPanel radAndFieldPnl = new JPanel(new FlowLayout());
        radAndFieldPnl.add(radiusLbl);
        radAndFieldPnl.add(radiusFld);

        mainSection.add(radAndFieldPnl);

        JPanel createBtnPnl = new JPanel();
        radiusBtn.addActionListener(this);
        createBtnPnl.add(radiusBtn);
        mainSection.add(createBtnPnl);

        // Area
        JPanel areaPnl = new JPanel();
        areaPnl.add(areaLbl);
        areaFld.setEditable(false);
        areaPnl.add(areaFld);

        mainSection.add(areaPnl);


        add(mainSection);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(420, 220));
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        double getUserInput = 0.0;
        if (e.getSource().equals(radiusBtn)) {
            try {
                getUserInput = Double.parseDouble(radiusFld.getText());
                JOptionPane.showMessageDialog(null, "circle created sucefull!!!");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a number!!!");
                radiusFld.setText("");
            }
            try{
                circle.setRadius(getUserInput);
            }catch(IllegalArgumentException ex){
                JOptionPane.showMessageDialog(null, "number must be positive!!!");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

            areaFld.setText(String.valueOf(Math.PI * Math.pow(getUserInput, 2)));


        }
    }
}
