package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class calendarController  extends Main {	
	
	@FXML
	ComboBox<String> monthBox = new ComboBox<String>();
	@FXML
	ComboBox<String> dayBox = new ComboBox<String>();
	@FXML
	ComboBox<String> yearBox = new ComboBox<String>();
	
	
	private Main main;
	
		@FXML
		private void initialize(){	
		
		monthBox.getItems().addAll(
				"January",
					"February",
					"March",
					"April",
					"May",
					"June",
					"July",
					"August",
					"September",
					"October",
					"November",
					"December");	
		monthBox.setValue("April");
		
		yearBox.getItems().addAll(
				"2010",
				"2011",
				"2012",
				"2013",
				"2014",
				"2015",
				"2016",
				"2017",
				"2018",
				"2019",
				"2020");
		yearBox.setValue("2015");
		
		dayBox.setValue("25");
		}
		
		
		
		
			@FXML
			public void handleYear(){
				if(yearBox.getValue().toString().equals("2012") || yearBox.getValue().toString().equals("2016") ||yearBox.getValue().toString().equals("2020")){
					if(monthBox.getValue().toString().equals("February")){
						dayBox.getItems().clear();
						dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
		 						"20", "21", "22", "23", "24", "25", "26", "27", "28", "29");}
					else{
						dayBox.getItems().clear();
						dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
		 						"20", "21", "22", "23", "24", "25", "26", "27", "28");}
					}
					
				}
			
		
			
			@FXML
			public void handleMonth(){
				if (monthBox.getValue().toString().equals("January")){
	 				dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 						"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");}
	 			
	 			if (monthBox.getValue().toString().equals("February")){
	 				if(yearBox.getValue().toString().equals("2012") || yearBox.getValue().toString().equals("2016")||yearBox.getValue().toString().equals("2020")){
	 					dayBox.getItems().clear();
	 					dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 						"20", "21", "22", "23", "24", "25", "26", "27", "28", "29");}
	 				else{
	 					dayBox.getItems().clear();
	 					dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
		 						"20", "21", "22", "23", "24", "25", "26", "27", "28");}
	 				}	 			
	 			
	 			if(monthBox.getValue().toString().equals("March")){
	 				dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 						"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");}
	 				
	 				
	 			if(monthBox.getValue().toString().equals("April")){
	 				dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 						"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30");}

	 			if(monthBox.getValue().toString().equals("May")){
	 	 			dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 	 					"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");}

	 	 		if(monthBox.getValue().toString().equals("June")){
	 	 	 		dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 	 	 				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30");}

	 	 	 				
	 	 	 	if(monthBox.getValue().toString().equals("July")){
	 	 	 		dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 	 	 	 			"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");}

	 	 	 	 if(monthBox.getValue().toString().equals("August")){
	 	 	 		 dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 	 	 				 "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");}

	 	 	 	 				
	 	 	 	 if(monthBox.getValue().toString().equals("September")){
	 	 	 	 	dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 	 	 	 			"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30");}

	 	 	 	 				
	 	 	 	 if(monthBox.getValue().toString().equals("October")){
	 	 	 		 dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 	 	 	 				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");}

	 	 	 	 				
	 	 	 	 	if(monthBox.getValue().toString().equals("November")){
	 	 	 	 		dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 	 	 	 				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30");}

	 	 	 	 				
	 	 	 	 	if(monthBox.getValue().toString().equals("December")){
	 	 	 	 		dayBox.getItems().addAll("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19",
	 	 	 	 				"20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");}
				
				
				
			}
			
			public void setMain(Main main){
				this.main = main;
			}
			
		
		
		
		
	}


	
		


