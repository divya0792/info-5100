package studentportal;

import calculator.GenericContainer;
import studentportal.controller.StudentManager;
import studentportal.controller.StudentManagerImpl;
import studentportal.model.DataSource;
import studentportal.model.InMemoryDataSource;
import studentportal.view.StudentTableModel;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;


public class StudentPortal {

    public static void main(String[] args) {
        Font font = new Font("TimesRoman", Font.PLAIN, 30);

        DataSource dataSource = new InMemoryDataSource();
        StudentManager manager = new StudentManagerImpl(dataSource);

        StudentForm form = new StudentForm(manager);
        Collection<Component> components = form.getFormComponents(font);

        GenericContainer formContainer = new GenericContainer();
        formContainer.addComponents(components, new FlowLayout());
        formContainer.setVisibility(true);
        formContainer.setParameters(800,800);

        StudentTableModel model = new StudentTableModel(manager);
        JTable table = new JTable();
        table.setModel(model);


    }
}
