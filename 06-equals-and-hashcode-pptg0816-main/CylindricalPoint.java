import java.math.BigDecimal;
import java.math.RoundingMode;

public class CylindricalPoint extends Point3D {
  final double r;
  final double theta;
  final double z;

  public CylindricalPoint(double r, double theta, double z) {
    this.r = r;
    this.theta = theta;
    this.z = z;
  }


  @Override
  public boolean equals(Object other){
    if(other instanceof CylindricalPoint){
      CylindricalPoint o = (CylindricalPoint) other;
      return this.r == o.r && this.theta == o.theta && this.z == o.z;
    }
    else if(other instanceof CartesianPoint){
      CartesianPoint o = (CartesianPoint) other;

      //Use BigDecimal and keep 5 digit here
      BigDecimal o_x = new BigDecimal(Double.toString(o.x));
      o_x = o_x.setScale(5, RoundingMode.HALF_UP);

      BigDecimal o_y = new BigDecimal(Double.toString(o.y));
      o_y = o_y.setScale(5, RoundingMode.HALF_UP);

      BigDecimal my_cos = new BigDecimal(Double.toString(this.r*Math.cos(this.theta)));
      my_cos = my_cos.setScale(5, RoundingMode.HALF_UP);

      BigDecimal my_sin = new BigDecimal(Double.toString(this.r*Math.sin(this.theta)));
      my_sin = my_sin.setScale(5, RoundingMode.HALF_UP);

      return o_x.equals(my_cos) && o_y.equals(my_sin) && o.z == this.z;
    }
    return false;
  }

  @Override
  public int hashCode(){
    return 1;
  }


  @Override
  public String toString() {
    // Note - this is another way to build up complex strings.  You can read more about it
    // here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
    // and here: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Formatter.html#syntax
    return String.format("<r=%s,theta=%s,z=%s>", r, theta, z);
  }
}
