public class Point3D implements Comparable<Point3D> {
  final float x;
  final float y;
  final float z;

  public Point3D(float x, float y, float z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public int compareTo(Point3D o) {
    // TODO implement this method
    double my_dis = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    double other_dis = Math.sqrt(o.x * o.x + o.y * o.y + o.z * o.z);
    return (int) (my_dis - other_dis);
  }
}
