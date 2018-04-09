

	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.layout.HBox;
	import javafx.stage.Stage;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;


	public class Buttons extends Application  {


	    @Override
	    public void start(Stage primaryStage) throws Exception {
	        primaryStage.setTitle("Button Experiment 1");

	        Button button1 = new Button("F");
	        Button button2 = new Button("U");
	        Button button3 = new Button("C");
	        Button button4 = new Button("K");

	        button1.setStyle("-fx-background-color: #FFE4C4");
	        button2.setStyle("-fx-background-color: #DEB887");
	        button3.setStyle("-fx-background-color: #FF7F50");
	        button4.setStyle("-fx-background-color: #D2691E");


	        HBox hbox = new HBox(button1, button2, button3, button4);


	        Scene scene = new Scene(hbox, 400, 100);
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        Application.launch(args);
	    }
	}

