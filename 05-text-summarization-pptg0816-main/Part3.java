import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Part3 {
  public static void main(String[] args) {

    final BagOfWords bagOfWords1 = new BagOfWords("This is Spot. See Spot run. Run, Spot, Run.");
    final BagOfWords bagOfWords2 = new BagOfWords("This is Jane. See Spot run to Jane.");

    final List<BagOfWords> documents = Arrays.asList(
        bagOfWords1, bagOfWords2
    );
    final List<String> vocab = BagOfWords.getVocabulary(documents);
    System.out.println(inverseDocumentFrequency(vocab, documents));
  }

  static List<Double> inverseDocumentFrequency(List<String> vocabulary, List<BagOfWords> documents){
    // TODO implement this method using the formula in the assignment description

    // HINT this requires iteration through both the vocabulary and the documents lists

    double N = documents.size();// total document number
    double dft = 0.0; // the number of document that contain checked words
    List<Double> idf = new ArrayList<>();

    for(String v: vocabulary){

      for(BagOfWords bag: documents){

        if(bag.bagOfWords.containsKey(v)){
          dft++;
        }
      }
      idf.add(Math.log(N/dft));
      dft = 0.0;
    }
    return idf;
  }
}
