public class Main {
  public static void main(String[] args) {

    System.out.println(new BagOfWords("This is Spot see Spot Run Run Spot Run"));
    System.out.println(new BagOfWords("This is Jane See Spot run to Jane"));
    System.out.println(new BagOfWords("Buffalo buffalo Buffalo buffalo buffalo buffalo Buffalo buffalo"));
    System.out.println(new BagOfWords("Row row row your boat " +
        "Gently down the stream " +
        "Merrily merrily merrily merrily " +
        "Life is but a dream "));
    System.out.println(new BagOfWords("It was the best of times, it was the worst of times, it " +
        "was the age of wisdom, it was the age of foolishness, it was the epoch of belief, " +
        "it was the epoch of incredulity, it was the season of light, it was the season of darkness, " +
        "it was the spring of hope, it was the winter of despair."));
  }
}
