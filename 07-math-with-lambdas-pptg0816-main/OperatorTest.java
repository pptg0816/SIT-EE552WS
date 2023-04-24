class OperatorTest {

  public static void test(Operator operator, double a, double b, double result) {
    final double value = operator.apply(a, b);
    if (value != result) {
      throw new AssertionError(
          String.format("%.0f %s %.0f should be %.0f and not %.0f",
            a,
            operator,
            b,
            result,
            value));
    }

  }

  public static void main(String[] args) {
    test(Operator.PLUS, 5, 7, 12);
    test(Operator.MINUS, 5, 7, -2);
    test(Operator.MULTIPLY, 5, 7, 35);
    test(Operator.DIVIDE, 10, 5, 2);
    test(Operator.PLUS, 5, 0, 5);
    test(Operator.MINUS, 5, 0, 5);
  }
}
