import java.util.Set;
import java.util.HashSet;

public class AppleBasket implements Comparable<AppleBasket> {
  Set<Apple> apples = new HashSet<>();

  public AppleBasket addApple() {
    apples.add(new Apple());
    return this;
  }

  @Override
  public int compareTo(AppleBasket o) {
    // TODO implement this method
    int my_count = apples.size();
    int other_count = o.apples.size();
    return my_count - other_count;
  }

  public static class Apple {

  }
}
