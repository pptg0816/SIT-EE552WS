import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamQuestion {
    static List<Integer> buildList(int size, int factor){
        return IntStream.range(1,size).filter(i -> i % factor != 0).boxed().collect(Collectors.toList());
    }


}
