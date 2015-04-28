package application;

import java.util.Calendar;
import java.util.Date;

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
	
	

	Calendar currentDate = Calendar.getInstance();
	
	
	private Main main;
	
		@FXML
		private void initialize(){	
		
		String currentDay;
		currentDay = String.valueOf(currentDate.get(Calendar.DAY_OF_MONTH));
		dayBox.setValue(currentDay);
		
		
		String currentYear;
		currentYear = String.valueOf(currentDate.get(Calendar.YEAR));
		yearBox.setValue(currentYear);
		
		Integer currentMonth;
		currentMonth = (currentDate.get(Calendar.MONTH) + 1);
			
	
	
		
		switch(currentMonth) {
		case 1 : monthBox.setValue("January");
				break; 
				
		case 2 : monthBox.setValue("February");
				break;
				
		case 3 : monthBox.setValue("March");
				break;		
		
		case 4 : monthBox.setValue("April");
				break;
				
		case 5 : monthBox.setValue("May");
				break;
		
		case 6 : monthBox.setValue("June");
				break;
		case 7 : monthBox.setValue("July");
				break;
		
		case 8 : monthBox.setValue("August");
				break;
		
		case 9 : monthBox.setValue("September");
				break;
		
		case 10 : monthBox.setValue("October");
				break;
		
		case 11: monthBox.setValue("November");
				break;
		
		case 12: monthBox.setValue("December");
				break;
		}
				
		
		
		
			
			
			
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
		}
	
		
		
		
			@FXML
			public void handleYear(){
				
			if(monthBox.getValue().toString().equals("February")){
				if(yearBox.getValue().toString().equals("2012") || yearBox.getValue().toString().equals("2016") ||yearBox.getValue().toString().equals("2020")){
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


	
		


