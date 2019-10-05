//Lists--------------------------------------------------
import java.util.*;
class Main {
  public static void main(String[] args) {

  //Java Collections List
  System.out.println("The following is an example of an array list:");

  List<String> fruits = new LinkedList<String>();
  fruits.add("Apple");
  fruits.add("Mango");
  fruits.add("Pear");
  fruits.add("Banana");
  System.out.println(fruits);

  System.out.println("And now for fun lets sort by alphabetical order:");
  fruits.sort(Comparator.comparing(String::toString));
  System.out.println(fruits);
  // End of lists
  }
}