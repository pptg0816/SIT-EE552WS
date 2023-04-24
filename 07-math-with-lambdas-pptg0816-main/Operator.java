import java.util.function.BinaryOperator;

public enum Operator {

  // TODO add four enum values corresponding to the PLUS, MINUS, MULTIPLY, DIVIDE
  // TODO for each enum value, set op to the right lambda expression
  MULTIPLY((n1, n2) -> n1 * n2),
  PLUS(Double::sum),
  MINUS((n1, n2) -> n1 - n2),
  DIVIDE((n1, n2) -> n1 / n2);

  private final BinaryOperator<Double> op;

  Operator(BinaryOperator<Double> op) {
    this.op = op;
  }

  public double apply(double n1, double n2) {
    return op.apply(n1, n2);
  }
}

