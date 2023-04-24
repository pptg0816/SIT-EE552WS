import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part2 {
  public static void main(String[] args) {
    // TODO copy your solution to the Bag of Words Assignment into the Bag of Words class in this assignment

    final BagOfWords bagOfWords1 = new BagOfWords("This is Spot. See Spot run. Run, Spot, Run.");
    final BagOfWords bagOfWords2 = new BagOfWords("This is Jane. See Spot run to Jane.");

    // TODO implement the method getVocabulary in BagOfWords
    final List<String> vocab = BagOfWords.getVocabulary(
        Arrays.asList(
            bagOfWords1, bagOfWords2
        ));

    System.out.println(termFrequency(
        vocab,
        bagOfWords1
    ));

    System.out.println(termFrequency(
        vocab,
        bagOfWords2
    ));

  }

  static List<Double> termFrequency(List<String> vocabulary, BagOfWords bagOfWords){
    // TODO implement this calculate method per the formula in the assignment description
    // HINT - I added a size method to the BagOfWords class that you can use for part of this calculation
    List<Double> termFrequency = new ArrayList<>();
    double counter = 0.0;

    for(String v: vocabulary){

      //check all words in vocabulary, store how many times they appear in bagOfWords.
      // counter means how many kinds of words are there in bagOfWords(except stop words)
      if(bagOfWords.bagOfWords.containsKey(v)){
       double a = bagOfWords.get(v);
       termFrequency.add(a);
       counter++;
      }
      else{
        termFrequency.add(0.0);
      }

    }


    for(int i = 0; i < termFrequency.size(); i++){
      termFrequency.set(i, termFrequency.get(i)/counter );
    }
    return termFrequency;
  }
}
