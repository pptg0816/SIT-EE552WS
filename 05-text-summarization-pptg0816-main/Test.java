import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class Test {
  public static CLIOutput run(Runnable runnable){
    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    final PrintStream originalOut = System.out;
    final PrintStream originalErr = System.err;
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));

    runnable.run();

    System.setOut(originalOut);
    System.setErr(originalErr);
    return new CLIOutput(outContent.toString().trim(), errContent.toString().trim());
  }

  public static String readFile(String file){
    try {
      List<String> evens = Files.readAllLines(Paths.get(file));
      return String.join(System.lineSeparator(), evens);
    } catch (IOException e){
      throw new RuntimeException("Could not read test answers", e);
    }
  }

  public static void main(String args[]){
    System.out.println("Part 1...");
    run(()->{
      Part1.main(args);
    })
        .checkOutput(readFile("part1.txt").trim());
    System.out.println("OK");
    
    System.out.println("Part 2...");
    run(()->{
      Part2.main(args);
    })
        .checkOutput(readFile("part2.txt").trim());
    System.out.println("OK");
    
    System.out.println("Part 3...");
    run(()->{
      Part3.main(args);
    })
        .checkOutput(readFile("part3.txt").trim());
    System.out.println("OK");
    
    System.out.println("Part 4...");
    run(()->{
      Part4.main(args);
    })
        .checkOutput(readFile("part4.txt").trim());
    System.out.println("OK");
  }

  public static class CLIOutput {
    private final String stdOut;
    private final String stdErr;

    public CLIOutput(String stdOut, String stdErr){
      this.stdOut = stdOut;
      this.stdErr = stdErr;
    }

    public CLIOutput checkOutput(String expected){
      if(!expected.equals(this.stdOut)){
        System.out.println(this.stdOut);
        throw new RuntimeException("Output does not match");
      }
      return this;
    }

    public CLIOutput checkError(String expected){
      if(!expected.equals(this.stdErr)){
        throw new RuntimeException("Error Stream does not match");
      }
      return this;
    }
  }
}
