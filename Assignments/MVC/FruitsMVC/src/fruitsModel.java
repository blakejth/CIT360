public class fruitsModel {
        private fruitsView theView;

    // Holds the value of the sum of the numbers
    // entered in the view
    
    private String theFruits;
    
    
    
    public void addTwoFruits(String firstFruit, String secondFruit){
        theFruits = "I also think that " + firstFruit + " and " + secondFruit + " are delishious!";
    }
    public String getBothFruits(){
        return theFruits;
    }
}