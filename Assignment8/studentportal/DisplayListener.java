package studentportal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayListener implements ActionListener {
    public static final String VIEW_TABLE = "View Table";
    public static final String ADD_STUDENT = "Add Student";

    private final JPanel tablePanel;
    private final JPanel formPanel;


    DisplayListener(JPanel tablePanel, JPanel formPanel) {
        this.tablePanel = tablePanel;
        this.formPanel = formPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton btn = (JButton)e.getSource();
        if(e.getActionCommand().equals(VIEW_TABLE)) {
            btn.setText(ADD_STUDENT);
            formPanel.setVisible(false);
            tablePanel.setVisible(true);
        } else {
            btn.setText(VIEW_TABLE);
            formPanel.setVisible(true);
            tablePanel.setVisible(false);
        }

    }
}
