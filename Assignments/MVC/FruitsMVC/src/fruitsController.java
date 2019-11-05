import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fruitsController {
    
    private fruitsView theView;
    private fruitsModel theModel;
    
    public fruitsController(fruitsView theView, fruitsModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        
        this.theView.addFruitListener(new FruitListener());
           
    }
    
    class FruitListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String firstFruit, secondFruit;
            
            try{
                firstFruit = theView.getFirstFruit();
                secondFruit = theView.getSecondFruit();
                theModel.addTwoFruits(firstFruit, secondFruit);
                theView.setResponse(theModel.getBothFruits());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage("You Need to Enter two Integers");
            }
        }
    }
       
        
 }
