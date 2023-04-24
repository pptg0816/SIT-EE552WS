import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyStore;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Spellcheck {

  private static final Set<String> words = new HashSet<String>();


  public static void main(String[] args) {
    /* HINT - use a BufferedReader to read the words file.  For each line in
              the file, call words.add(line) . We will be covering Sets in detail
              next week, but for now just know that if you are adding each word
              to the set of known words so that spellcheck will work
     */

    try {

      BufferedReader reader = Files.newBufferedReader(Paths.get("words.txt"), StandardCharsets.UTF_8);
      String Line;
      while((Line = reader.readLine()) != null){
        words.add(Line);
      }
      reader.close();

      // write code to read words.txt here

      spellCheckFile("peter-pan.txt");
      spellCheckFile("alice.txt");
      spellCheckFile("original.txt");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Reads the contents of filename line-by-line and prints the line with
   * spellchecking markup.  Please preserve the linebreaks from the original file.
   *
   * NOTE - this method is written with "throws IOException" at the end of the declaration.
   * That means that we are passing the burden of handling the IOException to the code
   * that calls this method.  That means, in turn, that you do not need to use Try/Catch inside
   * this method.
   *
   * @param filename the name of the file to read
   * @throws IOException
   */
  static void spellCheckFile(String filename) throws IOException {
    BufferedReader reader = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8);
    String Line;
    StringBuffer output = new StringBuffer();
    while ((Line = reader.readLine()) != null) {
      String[] word = Line.split(" ");
      for (int i = 0; i < word.length; i++) {
        if (!isSpelledCorrectly(word[i])) {
          word[i] = "[[" + word[i] + "]]";
        }
        output.append(word[i]).append(" ");
      }
      output.append('\n');
    }
    reader.close();
    System.out.println(output);
    /*
    String newFilename = filename+"Revised.txt";
    BufferedWriter writer = Files.newBufferedWriter(Path.of(newFilename), StandardCharsets.UTF_8);
    writer.write(String.valueOf(output));
    writer.close();
     */
  }

  /**
   * Returns true if the word is in the list of known words of false otherwise
   * @param word the word to check
   * @return
   */
  private static boolean isSpelledCorrectly(String word) {
    return words.contains(word) || words.contains(word.toLowerCase(Locale.ROOT));
  }
}
