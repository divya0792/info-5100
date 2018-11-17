package calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class GenericContainer extends JFrame {

    public GenericContainer() {
        super();
    }

    public void addComponents(Collection<Component> components, LayoutManager manager) {
        if(components == null) {
            throw new IllegalArgumentException("no components to add");
        }
        if(manager == null) {
            throw new IllegalArgumentException("no layout");
        }
        Container container = getContentPane();
        container.setLayout(manager);

        for(Component component : components) {
            container.add(component);
        }

    }

    public void setParameters(int width, int height) {
        setSize(width,height);
    }

    public void setVisibility(boolean isVisible) {
        setVisible(isVisible);
    }
}
