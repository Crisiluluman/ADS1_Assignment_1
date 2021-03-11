package Calculator;

public interface Calculator {
    int getResult() throws MalformedExpressionException; // TODO: What is this exception?

    class MalformedExpressionException extends Exception {
    }
}
