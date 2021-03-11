package Calculator;

public class Operator extends Token {

    private Operation operation;

    // TODO: getOperation or getOperator
    public Operation getOperation(){
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }
}
