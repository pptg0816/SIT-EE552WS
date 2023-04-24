import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

  public static void main(String[] args) {
    final AppleBasket appleBasket1 = new AppleBasket();
    final AppleBasket appleBasket2 = new AppleBasket();

    appleBasket1
        .addApple()
        .addApple()
        .addApple();

    assertGreaterThan(appleBasket1, appleBasket2);
    assertLessThan(appleBasket2, appleBasket1);

    assertGreaterThan(
        new Person("John", "Smith"),
        new Person("James", "Smith")
    );
    assertLessThan(
        new Person("John", "Smith"),
        new Person("James", "Wells")
    );

    assertGreaterThan(
        new BirthdayReminder(7, 31),
        new BirthdayReminder(2, 19)
    );
    assertLessThan(
        new BirthdayReminder(12, 1),
        new BirthdayReminder(12, 31)
    );

    assertGreaterThan(
        new Point3D(10,10,10),
        new Point3D(10, 1, 5)
    );

    assertLessThan(
        new Point3D(10,10,10),
        new Point3D(10, 30, 5)
    );

  }

  private static <T> void assertGreaterThan(Comparable<T> a, T b) {
    final int i = a.compareTo(b);
    if (i <= 0) {
      throw new AssertionError("Comparison failed");
    }
  }

  private static <T> void assertLessThan(Comparable<T> a, T b) {
    if (a.compareTo(b) >= 0) {
      throw new AssertionError("Comparison failed");
    }
  }

}
