import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) throws IOException,InterruptedException {

    // TOOD the next few lines will load your apiKey from the file src/main/resources/api.properties replace the xxx in that file with your API key
    Properties props = new Properties();
    InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("api.properties");
    if (inputStream != null) {
      props.load(inputStream);
    }
    final String apiKey = props.getProperty("apiKey");

    // TODO write a loop to take input from the user one symbol at a time until the user inputs an empty line
    System.out.println("input one symbol at a time; input an empty line as the end");

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> useInput = new ArrayList<>();

    do {
      String eachLine = scanner.nextLine();
      if (eachLine.equals("")) {
        break;
      }
      useInput.add(eachLine);
    }
    while (true);




    // TODO for each symbol input, query the finnhub API, read the response into a class, and print out the data with meaningful labels
    for(String eachLine: useInput ){
      StringBuilder s = new StringBuilder();
      String myUrl = String.valueOf(s.append("https://finnhub.io/api/v1/quote?symbol=").append(eachLine).append("&token=").append(apiKey));

      HttpClient httpClient = HttpClient.newHttpClient();

      HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(myUrl)).build();

        HttpResponse<String> response = httpClient.send(
                request,
                HttpResponse.BodyHandlers.ofString()
        );

        String information = response.body();

        information = information.replaceFirst("\"c\"","\"Current price\"")
                .replaceFirst("\"d\"","\"Change\"")
                .replaceFirst("\"dp\"","\"Percent change\"")
                .replaceFirst("\"h\"","\"High price of the day\"")
                .replaceFirst("\"l\"","\"Low price of the day\"")
                .replaceFirst("\"o\"","\"Open price of the day\"")
                .replaceFirst("\"pc\"","\"Previous close price\"")
                .replaceFirst("\"t\"","\"Timestamp\"");
        System.out.println(eachLine + information);

    }
  }
}

