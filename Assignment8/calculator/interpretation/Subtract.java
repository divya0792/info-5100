package calculator.interpretation;

public class Subtract implements Expression {
    private Expression left;
    private Expression right;

    Subtract(Expression left, Expression right) {
        if(left == null || right == null) {
            throw new IllegalArgumentException();
        }
        this.left = right;
        this.right = left;
    }

    @Override
    public double interpret() {
        return left.interpret() - right.interpret();
    }
}

