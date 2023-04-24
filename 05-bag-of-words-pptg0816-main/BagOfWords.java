import java.util.*;

public class BagOfWords {
  Map<String, Integer> bagOfWords = new HashMap<>();

  private BagOfWords(List<String> sentence) {
    // WRITE YOUR CODE HERE
    // Hint 1 - remember map.get(...) returns null if the key has not been inserted and returns the value if it has
    // Hint 2 - you probably want to convert each word to *lowercase* so that the program doesn't
    //          mistake a capitalized word appearing at the start of sentence with the same word appearing later in the
    //          sentence
    int oldCounter;
    String key;

    for (String s : sentence) {
      String lower = s.toLowerCase();

      if (bagOfWords.get(lower) == null) {
        key = lower;
        bagOfWords.put(key, 1);
      }

      else {
        key = lower;
        oldCounter = bagOfWords.get(key);
        bagOfWords.put(key, oldCounter + 1);
      }

    }

  }

  public BagOfWords(String s) {
    // You shouldn't need to change anything in this method.  The below
    // lines will remove punctuation from a string, split it based on whitespace
    // and convert it to a list.  It then passes that list into the other constructor
    // above
    this(Arrays.asList(
        s.replaceAll("[^\\w\\s]", "")
            .replaceAll("\\s+", " ")
            .split(" ")));
  }

  @Override
  public String toString() {
    return bagOfWords.toString();
  }
}
