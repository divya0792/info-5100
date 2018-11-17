package calculator.listener;

import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private JTextField field;

    public ButtonListener(JTextField field) {
        this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().matches("\\d") || e.getActionCommand().equals(".")) {
            field.setText(field.getText() + e.getActionCommand());
        } else {
            field.setText(field.getText() + " " + e.getActionCommand() + " ");
        }
    }
}
