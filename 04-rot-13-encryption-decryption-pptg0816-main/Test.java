import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
public class Test{

        public static <T> List replicate(T value, int count)
        {
                List<T> newlist = new ArrayList<>();
                for(int counter = count; counter > 0; counter--){
                        newlist.add(value);
        }
        return newlist;
        }

        public static void main(String[] args) {

        }
}
