import javax.swing.*;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;

public class Main {
    public static void main(String[] args) {
        // 1) Simple show message dialog
//        JOptionPane.showMessageDialog(null, "I'm Saleh Abdulla...");

        // 2) window with ok, cancel and exit, returns int, then we can handle it.
        // there are many options for JOptionPane options

//        int result = JOptionPane.showOptionDialog(null,
//                "choose whatever you want!", "my dialog",  YES_NO_CANCEL_OPTION, QUESTION_MESSAGE,
//                null,
//                new Object[]{"okay", "cancel", "exit"},
//                "okay"
//        );
//
//        switch (result){
//            case 0 -> System.out.println("Ok Clicked");
//            case 1 -> System.out.println("Cancel Clicked");
//            case 2 -> System.out.println("Exit Clicked");
//            default -> System.out.println("dialog dismissed");
//        }

        // 3) show input field, then print whatever the user wrote
        String userMessage = JOptionPane.showInputDialog("Hi, Write something, and we will show it into the screen");
        JOptionPane.showMessageDialog(null, "You Wrote: " + userMessage);

    }
}