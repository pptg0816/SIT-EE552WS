public class NutritionFacts {
  final String servingSize;
  final double calories;
  final double totalFat;
  final double saturatedFat;
  final double transFat;
  final double polyunsaturatedFat;
  final double monounsaturatedFat;
  final double cholesterol;
  final double sodium;
  final double totalCarbohydrates;
  final double dietaryFiber;
  final double sugars;
  final double addedSugar;
  final double sugarAlcohol;
  final double protein;
  final double calcium;
  final double iron;
  final double vitaminD;
  final double potassium;

  public NutritionFacts(String servingSize,
                        double calories,
                        double totalFat,
                        double saturatedFat,
                        double transFat,
                        double polyunsaturatedFat,
                        double monounsaturatedFat,
                        double cholesterol,
                        double sodium,
                        double totalCarbohydrates,
                        double dietaryFiber,
                        double sugars,
                        double addedSugar,
                        double sugarAlcohol,
                        double protein,
                        double calcium,
                        double iron,
                        double vitaminD,
                        double potassium) {
    this.servingSize = servingSize;
    this.calories = calories;
    this.totalFat = totalFat;
    this.saturatedFat = saturatedFat;
    this.transFat = transFat;
    this.polyunsaturatedFat = polyunsaturatedFat;
    this.monounsaturatedFat = monounsaturatedFat;
    this.cholesterol = cholesterol;
    this.sodium = sodium;
    this.totalCarbohydrates = totalCarbohydrates;
    this.dietaryFiber = dietaryFiber;
    this.sugars = sugars;
    this.addedSugar = addedSugar;
    this.sugarAlcohol = sugarAlcohol;
    this.protein = protein;
    this.calcium = calcium;
    this.iron = iron;
    this.vitaminD = vitaminD;
    this.potassium = potassium;
  }

  public static NutritionFactsBuilder builder(){
    return new NutritionFactsBuilder();
  }

  public String toString(){
    return "servingSize: "+this.servingSize +'\n'+
            "calories: "+this.calories +'\n'+
            "totalFat: "+this.totalFat +'\n'+
            "saturatedFat: " + this.saturatedFat +'\n'+
            "transFat: " + this.totalFat + '\n'+
            "polyunsaturatedFat: " + this.polyunsaturatedFat + '\n'+
            "monounsaturatedFat: " + this.monounsaturatedFat + '\n'+
            "cholesterol: " + this.cholesterol + '\n'+
            "sodium: " + this.sodium + '\n'+
            "totalCarbohydrates: " + this.totalCarbohydrates + '\n'+
            "dietaryFiber: " + this.dietaryFiber + '\n'+
            "sugars: " + this.sugars + '\n'+
            "addedSugar: " + this.addedSugar + '\n'+
            "sugarAlcohol: " + this.sugarAlcohol + '\n'+
            "protein: " + this.protein + '\n'+
            "calcium: " + this.calcium + '\n'+
            "iron: " + this.iron + '\n'+
            "vitaminD: " + this.vitaminD + '\n'+
            "potassium: " + this.potassium + '\n';
  }

  public static class NutritionFactsBuilder {

    String servingSize;
    double calories;
    double totalFat;
    double saturatedFat;
    double transFat;
    double polyunsaturatedFat;
    double monounsaturatedFat;
    double cholesterol;
    double sodium;
    double totalCarbohydrates;
    double dietaryFiber;
    double sugars;
    double addedSugar;
    double sugarAlcohol;
    double protein;
    double calcium;
    double iron;
    double vitaminD;
    double potassium;


    // TODO implement this class using the fluent style presented in class.

    public NutritionFactsBuilder servingSize(String servingSize){
      this.servingSize = servingSize;
      return this;
    }

    public NutritionFactsBuilder calories (double calories){
      this.calories = calories;
      return this;
    }

    public NutritionFactsBuilder totalFat (double totalFat){
      this.totalFat = totalFat;
      return this;
    }

    public NutritionFactsBuilder saturatedFat (double saturatedFat){
      this.saturatedFat = saturatedFat;
      return this;
    }

    public NutritionFactsBuilder transFat (double transFat){
      this.transFat = transFat;
      return this;
    }

    public NutritionFactsBuilder polyunsaturatedFat (double polyunsaturatedFat){
      this.polyunsaturatedFat = polyunsaturatedFat;
      return this;
    }

    public NutritionFactsBuilder monounsaturatedFat (double monounsaturatedFat){
      this.monounsaturatedFat = monounsaturatedFat;
      return this;
    }

    public NutritionFactsBuilder cholesterol (double cholesterol){
      this.cholesterol = cholesterol;
      return this;
    }

    public NutritionFactsBuilder sodium (double sodium){
      this.sodium = sodium;
      return this;
    }

    public NutritionFactsBuilder totalCarbohydrates (double totalCarbohydrates){
      this.totalCarbohydrates = totalCarbohydrates;
      return this;
    }

    public NutritionFactsBuilder addedSugar (double addedSugar){
      this.addedSugar = addedSugar;
      return this;
    }

    public NutritionFactsBuilder sugarAlcohol (double sugarAlcohol){
      this.sugarAlcohol = sugarAlcohol;
      return this;
    }

    public NutritionFactsBuilder sugars (double sugars){
      this.sugars = sugars;
      return this;
    }

    public NutritionFactsBuilder protein (double protein){
      this.protein = protein;
      return this;
    }

    public NutritionFactsBuilder calcium (double calcium){
      this.calcium = calcium;
      return this;
    }

    public NutritionFactsBuilder dietaryFiber (double dietaryFiber){
      this.dietaryFiber = dietaryFiber;
      return this;
    }

    public NutritionFactsBuilder iron (double iron){
      this.iron = iron;
      return this;
    }

    public NutritionFactsBuilder vitaminD (double vitaminD){
      this.vitaminD = vitaminD;
      return this;
    }

    public NutritionFactsBuilder potassium (double potassium){
      this.potassium = potassium;
      return this;
    }

    public NutritionFacts build(){
      // TODO implement this method to call the NutritionFacts constructor
      return new NutritionFacts(servingSize,
      calories,
      totalFat,
      saturatedFat,
      transFat,
      polyunsaturatedFat,
      monounsaturatedFat,
      cholesterol,
      sodium,
      totalCarbohydrates,
      dietaryFiber,
      sugars,
      addedSugar,
      sugarAlcohol,
      protein,
      calcium,
      iron,
      vitaminD,
      potassium);
    }
  }
}
