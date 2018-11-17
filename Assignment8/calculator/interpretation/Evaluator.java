package calculator.interpretation;

import java.util.Stack;

public class Evaluator {

    private static final String WHITE_SPACE = " ";
    private final PostfixConverter postfixConverter;

    public Evaluator(PostfixConverter postfixConverter) {
        this.postfixConverter = postfixConverter;
    }

    public double interpret(String expression) {
        expression = postfixConverter.convert(expression);
        String[] operators = expression.split(WHITE_SPACE);
        Stack<Expression> stack = new Stack<>();

        for(String operator : operators) {
            switch (operator) {
                case "*":
                    stack.push(new Multiply(stack.pop(), stack.pop()));
                    break;
                case "+":
                    stack.push(new Sum(stack.pop(), stack.pop()));
                    break;
                case "-":
                    stack.push(new Subtract(stack.pop(), stack.pop()));
                    break;
                case "%":
                    stack.push(new Divide(stack.pop(), stack.pop()));
                    break;
                default:
                    stack.push(new Number(Double.parseDouble(operator)));
                    break;
            }
        }

        return stack.pop().interpret();
    }
}
