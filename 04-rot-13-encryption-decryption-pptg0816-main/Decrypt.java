import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Decrypt {

  /**
   * Reads the contents of the file into a String
   * @param filename the name of the file to read
   * @return the contents of the file
   */
  public static String readFile(String filename){
    StringBuilder AllLine = new StringBuilder();
    String line; // use a BufferedReader to read this from the file
    try {
      BufferedReader reader = Files.newBufferedReader(Paths.get("encrypted.txt"), StandardCharsets.UTF_8);
      while((line = reader.readLine())!=null){
        AllLine.append(line);
        AllLine.append('\n');
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return AllLine.toString();
  }

  public static void writeToFile(String filename, String contents){
    // use a BufferedWriter to write the string contents to the file
    BufferedWriter writer = null;
    try {
      writer = Files.newBufferedWriter(Path.of(filename), StandardCharsets.UTF_8);
      writer.write(contents);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  /**
   * Loops through each character in the string and, if the character is a letter,
   * transforms it with the ROT13 cipher.  If the character is not a letter, it should
   * just return the same character unchanged.
   *
   * @param str the input  string
   * @return the encrypted string
   */
  public static String rot13(String str){
    /*
      Hint 1: Remember each character has a numerical value, which means you can
              do math with characters.
      Hint 2: In ASCII, all of the capital letters have consecutive numerical values
              and all of the lowercase letters have consecutive values, BUT there is a gap
              between capital 'Z' and lowercase 'a'
      Hint 3: You can use concatenation here to assemble th new string, however, the better way to
              do it would be using something called a StringBuilder.  We will cover StringBuilder in
              more detail next week, but you may want to read the documentation for that class and
              experiment with using it in this assignment.
     */
    StringBuilder decrypted = new StringBuilder();
    char[] chars = str.toCharArray();
    int Acsii;
    for(int i = 0; i< chars.length; i++){
      Acsii = chars[i];
      // decrypting Aa to Mm
      if(65 <= Acsii && Acsii <= 77 || 97 <= Acsii && Acsii <= 109){
        Acsii = Acsii + 13;
        chars[i] = (char) Acsii;
      }
      // decrypting Nn to Zz
      else if(78 <= Acsii && Acsii <= 90 || 110 <= Acsii && Acsii <= 122){
        Acsii = Acsii - 13;
        chars[i] = (char) Acsii;
      }

      decrypted.append(chars[i]);
    }
    return decrypted.toString();
  }

  public static void main(String[] args){
    writeToFile("decrypted.txt", rot13(readFile("encrypted.txt")));
  }
}
