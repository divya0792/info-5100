package studentportal;

import studentportal.controller.StudentManager;
import studentportal.model.Gender;
import studentportal.model.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class SubmitListener implements ActionListener {
    private final Map<String, Component> components;
    private final StudentManager studentManager;

    SubmitListener(Map<String, Component> components, StudentManager studentManager) {
        this.components = components;
        this.studentManager = studentManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String id = ((JTextField) components.get("id")).getText();
        String name = ((JTextField) components.get("name")).getText();
        String email = ((JTextField) components.get("email")).getText();
        String gender = (String)((JComboBox) components.get("gender")).getSelectedItem();
        Student student = new Student(Long.parseLong(id),name, Gender.valueOf(gender), email);
        studentManager.addStudent(student);
    }
}
