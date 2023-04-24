import java.util.List;
import java.util.ArrayList;

public class ListsOfInts {
  public static List<Integer> getOdds(){
    // Write code here
    List<Integer> Odds = new ArrayList<>();
    for (int i = 0; i < 100; i++){
      if(i % 2 != 0){
        Odds.add(i);
      }
    }
    return Odds;
  }

  public static List<Integer> getEvens(){
    // Write code here
    List<Integer> Evens = new ArrayList<>();
    for (int i = 0; i < 100; i++){
      if(i % 2 == 0){
        Evens.add(i);
      }
    }
    return Evens;
  }

  public static List<Integer> getPowersOfTwo(){
    // Write code here
    List<Integer> PowerOfTwo = new ArrayList<>();
    int i = 1;
    while (i <= 4096){
      PowerOfTwo.add(i);
      i = i * 2;
    }
    return PowerOfTwo;
  }


  public static void main(String[] args){
    System.out.println(getOdds());
    System.out.println(getEvens());
    System.out.println(getPowersOfTwo());
  }
}
