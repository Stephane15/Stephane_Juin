/*
* Author : stephanerheaume
* Date : Jun. 3, 2021
* Description : 
*/

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calcule extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Group group =new Group();
		Scene scene=new Scene(group,400,400);
		
		
		TextField txt1=new TextField("0");
		TextField txt2=new TextField("0");
		Label lbl1=new Label("0");
		Label lbl2=new Label("0");
		Label lbl3=new Label("0");
		Label lbl4=new Label("0");
		Label lbl5=new Label("0");
		
		txt1.setLayoutX(100);
		txt1.setLayoutY(100);
		
		txt2.setLayoutX(100);
		txt2.setLayoutY(140);
		
		lbl1.setLayoutX(100);
		lbl1.setLayoutY(180);
		
		lbl2.setLayoutX(120);
		lbl2.setLayoutY(180);
		
		lbl3.setLayoutX(140);
		lbl3.setLayoutY(180);
		
		lbl4.setLayoutX(160);
		lbl4.setLayoutY(180);
		
		lbl5.setLayoutX(180);
		lbl5.setLayoutY(180);
		
		
		lbl1.textProperty().bind(txt1.textProperty());
		lbl3.textProperty().bind(txt2.textProperty());
		
		lbl3.textProperty().addListener((observable,oldValue,newValue);
		if(!newValue.matches("^[0-9](\\.[0.9]+)?$"))
		{
			txt2.setText(STYLESHEET_CASPIAN);
		}
		
	}
	
	

}
