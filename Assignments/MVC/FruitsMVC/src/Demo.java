
	public class Demo {
	    
	    public static void main(String[] args) {
	    	fruitsView theView = new fruitsView();
	    	fruitsModel theModel = new fruitsModel();
	        fruitsController theController = new fruitsController(theView,theModel);
	        theView.setVisible(true);
	    }
	}
	