package studentportal;

import studentportal.controller.StudentManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayListener implements ActionListener {
    private final StudentManager manager;

    DisplayListener(StudentManager manager) {
        this.manager = manager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        manager.getAllStudents();

    }
}
