package ui.components;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class UIComponents {

    public static JLabel createHeader(String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        label.setBorder(new EmptyBorder(15, 0, 15, 0));
        return label;
    }

    public static JLabel createSubHeader(String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 13)); // Clean, standard weight
        label.setForeground(new Color(100, 100, 100));    // Professional dark gray text
        label.setBorder(new EmptyBorder(0, 0, 15, 0));   // Margin below the sub-label
        return label;
    }

    public static JButton createPrimaryButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.BOLD, 13));
        button.setFocusPainted(false);
        return button;
    }

    public static JButton createSecondaryButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 13));

        button.setFocusPainted(false);
        return button;
    }

    // Pass 'columns' to easily set the width of the text field when calling it
    public static JTextField createTextField(int columns){
        JTextField textField = new JTextField(columns);

        // Match the clean Arial aesthetic of your app
        textField.setFont(new Font("Arial", Font.PLAIN, 14));

        // Gives the text field a thin gray border with internal padding
        textField.setBorder(new CompoundBorder(
                new LineBorder(Color.LIGHT_GRAY, 1),
                new EmptyBorder(5, 8, 5, 8) // Top, Left, Bottom, Right padding inside the text box
        ));

        return textField;
    }

}