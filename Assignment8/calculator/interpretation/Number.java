package calculator.interpretation;

public class Number implements Expression {
    private final double number;

    Number(double number) {
        this.number = number;
    }

    @Override
    public double interpret() {
        return number;
    }
}
