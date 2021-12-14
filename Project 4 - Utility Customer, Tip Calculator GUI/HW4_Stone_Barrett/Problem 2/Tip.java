// Stone Barrett
// Assignment 4 - Problem 2

// Importing JavaFX Libraries
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

// Importing number format
import java.text.NumberFormat;

// Class begin
public class Tip extends Application 
{
    // GUI
    GridPane gridPane;
    Label lblMessage,lblTip,lblResult;
    TextField txtAmount;
    RadioButton rdb0,rdb15,rdb18,rdb20;
    ToggleGroup buttonGroup;
    Button btnCalculate;
    
    
    // Value variables
    double amount = 0, tip = 0, salesTax = 0, billAmount = 0;
    
    // For currency format
    NumberFormat  numberFormat= NumberFormat.getCurrencyInstance();
    final double SALES_TAX=0.08;
    
    @Override
    public void start(Stage primaryStage) 
    {
        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        
        
        //first row
        lblMessage = new Label("Enter food Charge: ");
        txtAmount = new TextField();
        txtAmount.setMaxWidth(50);
        gridPane.add(lblMessage,0,0);
        gridPane.add(txtAmount,1,0);
        
        //second row
        lblTip = new Label("Please select tip: ");
        gridPane.add(lblTip,0,1);
        
        //Third row
        rdb0 = new RadioButton("0%");
        rdb15 = new RadioButton("15%");
        rdb18= new RadioButton("18%");
        rdb20 = new RadioButton("20%");
        
        //add to button group
        buttonGroup= new ToggleGroup();
        rdb0.setToggleGroup(buttonGroup);
        rdb20.setToggleGroup(buttonGroup);
        rdb18.setToggleGroup(buttonGroup);
        rdb15.setToggleGroup(buttonGroup);
        rdb0.setSelected(true);
        gridPane.add(rdb0,0,2);
        gridPane.add(rdb15,1,2);
        gridPane.add(rdb18,2,2);
        gridPane.add(rdb20,3,2);
        
        //Forth row
        btnCalculate = new Button("Calculate");
        gridPane.add(btnCalculate,1,3);
        
        //Fifth row
        lblResult = new Label();
        gridPane.add(lblResult,1,4);
        
        //Create stage
        primaryStage.setTitle("Bill Calculator");
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(300);
        primaryStage.show();


        //Add handler to Button
        btnCalculate.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent event) 
            {
                amount = Double.parseDouble(txtAmount.getText());
                if(rdb0.isSelected())
                    tip = 0;
                else if(rdb15.isSelected())
                    tip =0.15;
                else if(rdb18.isSelected())
                    tip = 0.18;
                else if(rdb20.isSelected())
                    tip=0.20;
                tip = amount * tip;
                salesTax = amount * SALES_TAX;
                billAmount = amount + tip + salesTax;
                String result = "Food Charge: " + numberFormat.format(amount) + "\nTip Amount: " + numberFormat.format(tip) + 
                        "\nSales Tax: " + numberFormat.format(salesTax) + 
                        "\nTotal Bill Amount: " + numberFormat.format(billAmount);
                lblResult.setText(result);
            }
        });
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}


