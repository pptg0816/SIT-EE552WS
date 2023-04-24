import java.util.*;
import java.util.stream.Collectors;
public class LambdaExample {

    public static class RepetitiveLyric {
        private final String input;
        private final int times;

        public RepetitiveLyric(String input, int times) {
            this.input = input;
            this.times = times;
        }

        public String repeat() {
            return this.input.repeat(times);
        };
    }

    public static void main(String[] args) {

        List<String> lyrics =
                List.of(
                                new RepetitiveLyric("in radio c'è un pulcino ", 2),
                                new RepetitiveLyric("è il pulcino pio ", 6))
                        .stream()
                        .map(RepetitiveLyric::repeat)
                        .collect(Collectors.toList());

        System.out.println(lyrics);
    }

}