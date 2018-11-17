package calculator;

import calculator.component.ComponentHelper;
import calculator.interpretation.Evaluator;
import calculator.interpretation.PostfixConverter;
import calculator.listener.ButtonListener;
import calculator.listener.ComputeListener;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class Frame extends JFrame {

    public static void main(String[] args) {
        Font font = new Font("TimesRoman", Font.PLAIN, 30);

        PostfixConverter postfixConverter = new PostfixConverter();
        Evaluator evaluator = new Evaluator(postfixConverter);

        List<Component> components = new ArrayList<>();

        List<Component> firstPanelComps = new ArrayList<>();
        JTextField field = ComponentHelper.createTextField(13, font);
        firstPanelComps.add(field);
        components.add(ComponentHelper.createPanel(firstPanelComps));

        List<Component> secondPanelComps = new ArrayList<>();
        secondPanelComps.add(ComponentHelper.createButton("7", font, new ButtonListener(field)));
        secondPanelComps.add(ComponentHelper.createButton("8", font, new ButtonListener(field)));
        secondPanelComps.add(ComponentHelper.createButton("9", font, new ButtonListener(field)));
        secondPanelComps.add(ComponentHelper.createButton("%", font, new ButtonListener(field)));
        components.add(ComponentHelper.createPanel(secondPanelComps));

        List<Component> thirdPanelComps = new ArrayList<>();
        thirdPanelComps.add(ComponentHelper.createButton("4", font, new ButtonListener(field)));
        thirdPanelComps.add(ComponentHelper.createButton("5", font, new ButtonListener(field)));
        thirdPanelComps.add(ComponentHelper.createButton("6", font, new ButtonListener(field)));
        thirdPanelComps.add(ComponentHelper.createButton("*", font, new ButtonListener(field)));
        components.add(ComponentHelper.createPanel(thirdPanelComps));

        List<Component> fourthPanelComps = new ArrayList<>();
        fourthPanelComps.add(ComponentHelper.createButton("1", font, new ButtonListener(field)));
        fourthPanelComps.add(ComponentHelper.createButton("2", font, new ButtonListener(field)));
        fourthPanelComps.add(ComponentHelper.createButton("3", font, new ButtonListener(field)));
        fourthPanelComps.add(ComponentHelper.createButton("-", font, new ButtonListener(field)));
        components.add(ComponentHelper.createPanel(fourthPanelComps));

        List<Component> fifthPanelComps = new ArrayList<>();
        fifthPanelComps.add(ComponentHelper.createButton(".", font, new ButtonListener(field)));
        fifthPanelComps.add(ComponentHelper.createButton("0", font, new ButtonListener(field)));
        fifthPanelComps.add(ComponentHelper.createButton("=", font, new ComputeListener(evaluator, field)));
        fifthPanelComps.add(ComponentHelper.createButton("+", font, new ButtonListener(field)));
        components.add(ComponentHelper.createPanel(fifthPanelComps));

        GridLayout layout = new GridLayout(5,4);
        GenericContainer container = new GenericContainer();
        container.addComponents(components, layout);
        container.setParameters(350,400);

    }


}
