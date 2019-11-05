
import java.awt.event.ActionListener;

import javax.swing.*;

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



public class fruitsView extends JFrame{

    private JTextField firstFruit  = new JTextField(10);
    private JTextField secondFruit = new JTextField(10);
    private JButton submitButton = new JButton("Submit");
    private final JLabel lblTest = new JLabel("Add your two favorite Fruits!");
    private final JLabel fruitOutput = new JLabel("");


    fruitsView(){

        // Sets up view and adds components

        JPanel fruitWindow = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550, 200);
        
        fruitWindow.add(lblTest);
        fruitWindow.add(firstFruit);
        fruitWindow.add(secondFruit);
        fruitWindow.add(submitButton);
        fruitWindow.add(fruitOutput);
                
                
        getContentPane().add(fruitWindow);

    }

    public String getFirstFruit(){
        return (firstFruit.getText());
    }

    public String getSecondFruit(){
        return (secondFruit.getText());
    }

    public String getFruitSolution(){
        return fruitOutput.getText();
    }

    public void setResponse(String response){
    	fruitOutput.setText(response);
    }


    void addFruitListener(ActionListener listenForSubButton){
        submitButton.addActionListener(listenForSubButton);
    }

    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}