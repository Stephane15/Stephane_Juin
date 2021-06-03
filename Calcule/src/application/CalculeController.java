/*
* Author : stephanerheaume
* Date : Jun. 3, 2021
* Description : Utiliser SceneBuilder pour fair le calcule (comparer au binding)
*/


package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculeController {

    @FXML
    private Label lbl1;

    @FXML
    private TextField  nmr2 ;

    @FXML
    private TextField nmr1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl3;

    
   
    @FXML
    void ajouter()
    {
    	int nm1int = Integer.parseInt(nmr1.getText());
    	int nm2int = Integer.parseInt(nmr2.getText());
    	
    	String nm1string = nmr1.getText();
    	String nm2string = nmr2.getText();    	
    	
    	lbl1.setText(nm1string);
    	lbl2.setText(nm2string);
    	
    	int nm3int = nm1int + nm2int;
    	
    	lbl3.setText(String.valueOf(nm3int));
    	
    }
    
    
    
    
    
}
