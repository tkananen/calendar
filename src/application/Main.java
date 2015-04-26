package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private Stage calendarStage;
	private AnchorPane calendarAnchor;
	@Override
	public void start(Stage calendarStage ){
		this.calendarStage = calendarStage;
		this.calendarStage.setTitle("Calendar App");
		showcalendarAnchor();
		
	}
	
	private void showcalendarAnchor(){
		try{
			FXMLLoader calendarLoader = new FXMLLoader();
			calendarLoader.setLocation(Main.class.getResource("calendar_xml.fxml"));
			calendarAnchor = (AnchorPane) calendarLoader.load();
			Scene scene = new Scene(calendarAnchor);
			calendarStage.setScene(scene);
			calendarController calendarControl = calendarLoader.getController();
			calendarControl.setMain(this);
			calendarStage.show();
		}
		catch(IOException e){
			e.printStackTrace();
					
		}
	}
	
	public static void main(String[] args){
		launch(args);
	}
	
}
	
	