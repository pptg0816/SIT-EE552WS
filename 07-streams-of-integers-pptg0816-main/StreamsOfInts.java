import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;

public class StreamsOfInts {
  public static List<Integer> getOdds(){
    // Write code here - use the **filter** method and produce a List<Integer
    return IntStream.range(0,100).filter(i -> i % 2 != 0).boxed().collect(Collectors.toList());
  }

  public static List<Integer> getEvens(){
    // Write code here - use the **filter** method and produce a List<Integer>
    return IntStream.range(0,100).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
  }


  public static List<Integer> getPowersOfTwo() {
    // Write code here - use the **map** method and produce a List<Integer>
    return IntStream.range(0,13).map(i -> (int)(Math.pow(2,i))).boxed().collect(Collectors.toList());
    }


  public static void main(String[] args){
    System.out.println(getOdds());
    System.out.println(getEvens());
    System.out.println(getPowersOfTwo());
  }
}
