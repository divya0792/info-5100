package calculator.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.List;

public class ComponentHelper {

    public static JButton createButton(String text, Font font, ActionListener listener) {
        JButton button = new JButton(text);
        button.setFont(font);
        button.addActionListener(listener);
        return button;
    }

    public static JTextField createTextField(int cols, Font font) {
        JTextField field = new JTextField(cols);
        field.setFont(font);
        return field;
    }

    public static JPanel createPanel(Collection<Component> components) {
        JPanel panel = new JPanel();
        for(Component component : components) {
            panel.add(component);
        }
        return panel;
    }
}
