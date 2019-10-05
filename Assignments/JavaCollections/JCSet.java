//Set----------------------------------------------------
import java.util.*;
class Main {
  public static void main(String[] args) {

  //Java Collections List
  System.out.println("The following is a set of fruits. In a set the data can't be duplicated:");

  Set<String> fruits = new HashSet<>();
  fruits.add("Apple");
  fruits.add("Mango");
  fruits.add("Pear");
  fruits.add("Banana");
  System.out.println(fruits);

  Scanner input = new Scanner(System.in);
  System.out.print("Please enter a new fruit (or a duplicate to test):");
  String newFruit = input.next();
  //fruits.add(newFruit);

  if (fruits.add(newFruit)) {
    System.out.println("You just added " + newFruit +"!");
  } else if (!fruits.add(newFruit)) {
    System.out.println(newFruit + " is already added to the set");
  } 

  System.out.println(fruits);
  // End of Sets
  }
}