import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;

public class fruits {

	protected Shell shell;
	private Text fruitInput;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			fruits window = new fruits();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * VIEW
	 */
	
	protected void createContents() {
		
		// Model
		Set<String> fruits = new HashSet<>();
		  fruits.add("Apple");
		  fruits.add("Mango");
		  fruits.add("Pear");
		  fruits.add("Banana");
		// END Model
			 
		
		
		//View
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Fruit Information");
		
		fruitInput = new Text(shell, SWT.BORDER);
		fruitInput.setBounds(10, 31, 414, 21);
		
		Label output1 = new Label(shell, SWT.NONE);
		output1.setBounds(10, 120, 414, 21);
		
		Label output2 = new Label(shell, SWT.NONE);
		output2.setBounds(10, 147, 414, 104);
		
		Label lblAddAFruit = new Label(shell, SWT.NONE);
		lblAddAFruit.setBounds(10, 10, 414, 15);
		lblAddAFruit.setText("Add a fruit");
		
		Button btnSNFruit = new Button(shell, SWT.NONE);
		btnSNFruit.setBounds(10, 58, 414, 25);
		btnSNFruit.setText("Submit new fruit");
		//End View
		
		
		//Controller
		btnSNFruit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			
			String newFruit = fruitInput.getText();
				
				if (fruits.add(newFruit)) {
				    output1.setText("You just added " + newFruit +"!");
				  } else if (!fruits.add(newFruit)) {
					  output1.setText(newFruit + " is already added to the set");
				  } 
				output2.setText("Here are the saved Fruits:" + fruits);
			}
		});
		//End Controller
	}
}
