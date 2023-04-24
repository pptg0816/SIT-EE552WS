import java.util.HashSet;

public class Test {
  public static void main(String[] args) {
    assertEquals(
        new CylindricalPoint(0, 0, 0),
        new CartesianPoint(0, 0, 0)
    );

    assertEquals(
        new CartesianPoint(0, 0, 0),
        new CylindricalPoint(0, 0, 0)
    );

    assertEquals(
        new CartesianPoint(0, 0, 0),
        new CartesianPoint(0, 0, 0)
    );

    assertEquals(
        new CylindricalPoint(4, 2 * Math.PI / 3, 5),
        new CartesianPoint(-2, 2 * Math.sqrt(3), 5)
    );

    assertEquals(
        new CartesianPoint(-2, 2 * Math.sqrt(3), 5),
        new CylindricalPoint(4, 2 * Math.PI / 3, 5)
    );

    assertEquals(
        new CylindricalPoint(5, Math.PI / 6, 4),
        new CartesianPoint(5 * Math.sqrt(3) / 2, 5.0 / 2.0, 4)
    );

    assertEquals(
        new CartesianPoint(5 * Math.sqrt(3) / 2, 5.0 / 2.0, 4),
        new CylindricalPoint(5, Math.PI / 6, 4)
    );


    final HashSet<Point3D> points = new HashSet<>();
    points.add(new CylindricalPoint(5, Math.PI / 6, 4));
    points.add(new CartesianPoint(5 * Math.sqrt(3) / 2, 5.0 / 2.0, 4));
    points.add(new CartesianPoint(5 * Math.sqrt(3) / 2, 5.0 / 2.0, 4));
    points.add(new CylindricalPoint(5, Math.PI / 6, 4));
    if(points.size() > 1) throw new RuntimeException("Set has more elements than it should");

  }

  private static void assertEquals(Point3D point1, Point3D point2) {
    if (!point1.equals(point2)) {
      throw new AssertionError(String.format("%s != %s", point1, point2));
    }
  }
}
