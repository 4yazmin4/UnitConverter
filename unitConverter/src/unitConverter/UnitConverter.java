package unitConverter;
import java.awt.Label;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;


public class UnitConverter extends Application {
		Text label = new Text("Unit Converter");
		
	public static void main(String[] args) {
			launch(args);
	}
	
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Unit Converter");
        GridPane gridPane = new GridPane();
        gridPane.add(label, 0, 0);
        gridPane.setPadding(new Insets(20));
        Scene scene = new Scene(gridPane, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
		
		
	}

}
