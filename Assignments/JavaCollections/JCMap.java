//Map-----------------------------------------------------
import java.util.*;
class Main {
  public static void main(String[] args) {

  //Java Collections List
  System.out.println("The following is an example of map java collections. In this example I have a fruit and a rating between 0-10 10 being the best tasting:");

  Map<String, Integer> fruitRatings = new HashMap<>();
  fruitRatings.put("Apple", 6);
  fruitRatings.put("Mango", 4);
  fruitRatings.put("Pear", 7);
  fruitRatings.put("Banana", 5);
  System.out.println(fruitRatings);

  System.out.println("With this you can filter a whole list of fruits based on your rating that way you don't buy fruits you dont like!");
  
  // End of Maps
  }
}