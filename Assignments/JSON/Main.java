package Main;

import org.json.simple.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            JSONParser userParser = new JSONParser();
            JSONObject fruitJson = (JSONObject) userParser.parse(new FileReader("src/main/fruits.json"));
            
            Integer totalItems = fruitJson.size();
            Integer fruitSelected;
            Integer fruitRating;


            for (int i = 0; i < totalItems; i++) {
            	System.out.println(fruitJson[i]);
            }

            Scanner in = new Scanner(System.in);
			System.out.println("Which fruit would you like to add a Rating to? (enter a number) ");
			fruitSelected = Integer.parseInt(in.nextLine());

			System.out.println("What rating would you like to give this fruit? (1-10)");
			fruitRating = Integer.parseInt(in.nextLine());


            System.out.println("Fruit JSON: \n" + fruitJson + "\n");
            
            fruitJson[fruitSelected].put("Rating", fruitRating);
            
            System.out.println("Rating has been added." + fruitJson[fruitSelected])
        } 
        catch (IOException | ParseException e) {
        }
    }
}