package studentportal;

import calculator.GenericContainer;
import calculator.component.ComponentHelper;
import studentportal.controller.StudentManager;
import studentportal.controller.StudentManagerImpl;
import studentportal.model.DataSource;
import studentportal.model.InMemoryDataSource;
import studentportal.view.StudentForm;
import studentportal.view.StudentTableModel;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class StudentPortal {

    public static void main(String[] args) {
        Font font = new Font("TimesRoman", Font.PLAIN, 30);

        DataSource dataSource = new InMemoryDataSource();
        StudentManager manager = new StudentManagerImpl(dataSource);

        StudentForm form = new StudentForm(manager);
        Collection<Component> components = form.getFormComponents(font);

        StudentTableModel model = new StudentTableModel(manager);
        JTable table = new JTable();
        table.setModel(model);

        JPanel formPanel = ComponentHelper.createPanel(components);

        JPanel tablePanel = ComponentHelper.createPanel(Collections.singleton(table));

        JButton button =
                ComponentHelper.createButton("View Students", font, new DisplayListener(tablePanel, formPanel));
        button.setSize(50,50);
        JPanel btnPanel = ComponentHelper.createPanel(Collections.singleton(button));

        GenericContainer formContainer = new GenericContainer();
        formContainer.addComponents(Arrays.asList(formPanel, tablePanel, btnPanel), new GridLayout(7,1));

        formContainer.setParameters(1000,800);
        formContainer.setVisible(true);


    }
}
