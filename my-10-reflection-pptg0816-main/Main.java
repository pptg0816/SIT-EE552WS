import java.lang.reflect.*;
import java.util.List;

public class Main {
  public static void main(String[] args){
    Class<?> aClass = Cat.class;
    Cat testCat = new Cat("test");


    System.out.println("Fields:");
    // TODO print out all the fields on the Cat class'
    Field[] fields = aClass.getDeclaredFields();

    for(Field field: fields){
      field.setAccessible(true);
      System.out.println(field.getName()+"  "+field.getType().getTypeName());
    }
    System.out.println("\n");


    System.out.println("Constructor:");
    // TODO print out all the constructors on the Cat class
    Constructor[] constructors = aClass.getDeclaredConstructors();
    for(Constructor constructor: constructors){
      constructor.setAccessible(true);
      System.out.println(constructor.getName());
    }
    System.out.println("\n");



    System.out.println("Methods:");
    // TODO print out all the methodss on the Cat class
    Method[] methods = aClass.getDeclaredMethods();
    for(Method method: methods){
      method.setAccessible(true);
      System.out.println(method.getName());
    }
    System.out.println("\n");
  }
}
