public class NutritionFactsMain {
  public static void main(String[] args) {
    // TODO use your NutritionFactsBuilder to build the nutrition facts for some of your favorite foods
    NutritionFacts egg = new NutritionFacts("100",
            200,
            0,
            30,
            10,
            5,
            3,
            10,
            10,
            19,
            3,
            13,
            90,
            16,
            7,
            15,
            18,
            9,
            18);

   NutritionFacts meat = NutritionFacts.builder()
           .servingSize("100")
           .calcium(30)
           .iron(10)
           .build();

   System.out.println(egg);
   System.out.println(meat);

  }
}
