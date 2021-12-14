// Stone Barrett
// Assignment 2

package application;

import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.event.EventHandler;


public class InputPane extends GridPane {

	TextField word;
	String wordentered;
	Label Answer;
	
	public InputPane()
	{
		Font font = new Font(18);
		
		Label inputLabel = new Label("Word: ");
		inputLabel.setFont(font);
		GridPane.setHalignment(inputLabel,  HPos.RIGHT);
		
		word = new TextField();
		word.setFont(font);
		word.setPrefWidth(200);
		word.setAlignment(Pos.CENTER);
		
		
		Answer = new Label("---");
		Answer.setFont(font);
		GridPane.setHalignment(Answer, HPos.CENTER);
		
		
		setAlignment (Pos.CENTER);
		setHgap(20);
		setVgap(10);
		setStyle("-fx-background-color: purple");
		
		Button length = new Button ("Calculate Length");
		length.setFont(font);
		GridPane.setHalignment(length,  HPos.RIGHT);
		length.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				wordentered = word.getText();
				String numofletters = Integer.toString(wordentered.length());
				Answer.setText(numofletters);
			}
		});
		
		Button vowels = new Button ("# of Vowels");
		vowels.setFont(font);
		GridPane.setHalignment(vowels,  HPos.RIGHT);
		vowels.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				wordentered = word.getText();
				int count = 0;
				 for (int i=0 ; i<wordentered.length(); i++){
			         char ch = wordentered.charAt(i);
			         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
						count ++;
			         }
			      }
				Answer.setText(Integer.toString(count));
			}
		});
		
		Button uppercase = new Button ("# of Uppercase Letters");
		uppercase.setFont(font);
		GridPane.setHalignment(uppercase, HPos.RIGHT);
		uppercase.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				wordentered = word.getText();
				int caps = 0;
			    for (int i=0; i<wordentered.length(); i++) {

			        if (Character.isUpperCase(wordentered.charAt(i)))caps++;
			    }
				Answer.setText(Integer.toString(caps));
			}
		});
		

		
		add(inputLabel, 0, 0);
		add(word, 1, 0);
		add(length, 0, 1);
		add(vowels,0,2);
		add(Answer,1,2);
		add(uppercase,0,3);
	}
		
	}

