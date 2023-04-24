public class Person implements Comparable<Person> {

  final String firstName;
  final String lastName;

  public Person(String firstName, String lastName) {
    // Note - this is not particularly relevant to this assignment, but this is not the best way to store
    // peoples' names.  Every programmer should read this: https://www.kalzumeus.com/2010/06/17/falsehoods-programmers-believe-about-names/
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public int compareTo(Person o) {
    // TODO implement this method
    // Check and compare char in two last names one by one
    if (!this.lastName.equals(o.lastName)){
      int check_length = Math.min(this.lastName.length(), o.lastName.length());
      for(int i = 0; i < check_length; i++){
        char my_l = this.lastName.charAt(i);
        char other_l = o.lastName.charAt(i);
        if(my_l - other_l != 0){
          return my_l - other_l;
        }
      }
    }

    // Check and compare char in two first names one by one
    else{
      int check_length = Math.min(this.firstName.length(), o.firstName.length());
      for(int i = 0; i < check_length; i++){
        char my_f = this.firstName.charAt(i);
        char other_f = o.firstName.charAt(i);
        if(my_f - other_f != 0){
          return my_f - other_f;
        }
      }
    }
    return 0;
  }
}

