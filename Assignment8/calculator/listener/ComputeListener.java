package calculator.listener;

import calculator.interpretation.Evaluator;

import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComputeListener implements ActionListener {
    private Evaluator evaluator;
    private JTextField field;

    public ComputeListener(Evaluator evaluator, JTextField field) {
        this.evaluator = evaluator;
        this.field = field;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double result = evaluator.interpret(field.getText());
        field.setText(String.valueOf(result));
    }
}
