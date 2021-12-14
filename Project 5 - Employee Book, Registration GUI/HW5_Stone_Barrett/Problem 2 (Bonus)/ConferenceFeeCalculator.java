// Stone Barrett
// Assignment 5 - Problem 2 (Bonus)

// Importing libraries
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Open class inherit from Application library
public class ConferenceFeeCalculator extends Application 
{
    // Initializing UI elements
    RadioButton genReg, stuReg;
    ToggleGroup group;
    CheckBox dinner;
    Text totalText;
    ChoiceBox<String> precon;

    // String array holding topics
    String[] precon_names = {"Introduction to E-commerce ($350)", "The Future of the Web ($300)",
        "Advanced Java Programming ($400)", "Network Security ($450)"};

    // Double array holding conference costs
    double[] precon_costs = {350, 300, 400, 450};

   @Override

    public void start(Stage primaryStage) 
   {
        // Creating grid pane
        GridPane root = new GridPane();

        // Spacing
        root.setHgap(20);
        root.setVgap(20);
        root.setPadding(new Insets(30));

        // User data
        genReg = new RadioButton("General ($800)");
        genReg.setUserData(800.0);

        // Updating
        genReg.setOnAction(e -> update());
        stuReg = new RadioButton("Student ($450)");
        stuReg.setUserData(450.0);
        stuReg.setOnAction(e -> update());

        // Toggle group, only one can be selected
        group = new ToggleGroup();
        genReg.setToggleGroup(group);
        stuReg.setToggleGroup(group);
        genReg.setSelected(true);
        dinner = new CheckBox("Opening Night Dinner with a Keynote speech ($30)");
        dinner.setUserData(30.0);
        dinner.setOnAction(e -> update());

        // Creating choice box
        precon = new ChoiceBox<>(FXCollections.observableArrayList(precon_names));

        // Updating
        precon.getSelectionModel().selectedIndexProperty().addListener(e->update());

        totalText = new Text();

        // Adding components to root
        root.add(new Label("Registration Type: "), 0, 0);
        root.add(genReg, 0, 1);
        root.add(stuReg, 1, 1);
        root.add(new Label("Optional: "), 0, 2);
        root.add(dinner, 0, 3);
        root.add(new Label("Preconference Workshops: "), 0, 4);
        root.add(precon, 0, 5);
        root.add(new Label("Total: "), 0, 9);
        root.add(totalText, 1, 9);

        // Setting scene and displaying
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Conference Registration");
        primaryStage.show();

        // Updating
        update();
    }

    // Event handler
    private void update() 
    {
        // Total cost
        double total = 0;

        // Adding radio button selection to total
        total += (Double) group.getSelectedToggle().getUserData();

        // Adding other selections to total
        if (dinner.isSelected())
        {
            total += (Double) dinner.getUserData();
        }

        // Getting choice box selection
        int index=precon.getSelectionModel().getSelectedIndex();

        // Adding choice box selection to total
        if(index!=-1)
        {
            total+=precon_costs[index];
        }

        // Final cost
        totalText.setText(String.format("$%.2f", total));
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}