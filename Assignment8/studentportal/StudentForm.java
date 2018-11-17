package studentportal;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

import calculator.component.ComponentHelper;
import studentportal.controller.StudentManager;

public class StudentForm extends JFrame {
    private final StudentManager manager;
    StudentForm(StudentManager manager) {
        this.manager = manager;
    }

    public Collection<Component> getFormComponents(Font font) {
        Map<String, Component> formFields = new HashMap<>();
        List<Component> comps = new ArrayList<>();

        comps.add(new JLabel("Id:"));
        JTextField id = ComponentHelper.createTextField(20, font);
        formFields.put("id", id);
        comps.add(id);

        comps.add(new JLabel("name:"));
        JTextField name = ComponentHelper.createTextField(20, font);
        formFields.put("name", name);
        comps.add(name);

        comps.add( new JLabel("email:"));
        JTextField email = ComponentHelper.createTextField(20, font);
        formFields.put("email", email);
        comps.add(email);

        comps.add(new JLabel("Gender:"));
        String[] genderString = {"MALE", "FEMALE"};
        JComboBox<String> gender = new JComboBox<>(genderString);
        formFields.put("gender", gender);
        comps.add(gender);

        comps.add(ComponentHelper.createButton("Submit",font, new SubmitListener(formFields, manager)));
        comps.add(ComponentHelper.createButton("View Students",font, new DisplayListener(manager)));

        return comps;
    }
}
