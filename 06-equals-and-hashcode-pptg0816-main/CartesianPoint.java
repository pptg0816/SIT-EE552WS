import java.math.BigDecimal;
import java.math.RoundingMode;

public class CartesianPoint extends Point3D {
  final double x;
  final double y;
  final double z;

  public CartesianPoint(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public boolean equals(Object other){
    if(other instanceof CartesianPoint){
      CartesianPoint o = (CartesianPoint) other;
      return this.x == o.x && this.y == o.y && this.z == o.z;
    }
    else if(other instanceof CylindricalPoint){
      CylindricalPoint o = (CylindricalPoint) other;

      //Use BigDecimal and keep 5 digit here
      BigDecimal my_x = new BigDecimal(Double.toString(this.x));
      my_x = my_x.setScale(5, RoundingMode.HALF_UP);

      BigDecimal my_y = new BigDecimal(Double.toString(this.y));
      my_y = my_y.setScale(5, RoundingMode.HALF_UP);

      BigDecimal o_cos = new BigDecimal(Double.toString(o.r*Math.cos(o.theta)));
      o_cos = o_cos.setScale(5, RoundingMode.HALF_UP);

      BigDecimal o_sin = new BigDecimal(Double.toString(o.r*Math.sin(o.theta)));
      o_sin = o_sin.setScale(5, RoundingMode.HALF_UP);

      return my_x.equals(o_cos) && my_y.equals(o_sin) && o.z == this.z;
    }
    return false;
  }

  @Override
  public int hashCode(){
    return 1;
  }


  @Override
  public String toString(){
    // Note - this is another way to build up complex strings.  You can read more about it
    // here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
    // and here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html#syntax
    return String.format("<x=%s,y=%s,z=%s>", x, y, z);
  }
}
