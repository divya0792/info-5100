package calculator.interpretation;

public class Multiply implements Expression {
    private Expression left;
    private Expression right;

    Multiply(Expression left, Expression right) {
        if(left == null || right == null) {
            throw new IllegalArgumentException();
        }
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() * right.interpret();
    }
}
