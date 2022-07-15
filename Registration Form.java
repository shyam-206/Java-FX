/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package main;


import javafx.application.Application;
import javafx.collections.FXCollections;
import java.util.regex.Pattern;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author shyam
 */
public class Assignment2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
 
        primaryStage.setTitle("Registration Page");
       
        //Adding Gridpane for the label and textfield name as grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BASELINE_CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        //here the first declare a label and then add into a grid then
        Label fname = new Label("First Name :");
        grid.add(fname,0,1);//(name-of-field,column,row) structure
        //textfield use for write a name 
        TextField fnTextField = new TextField();
        fnTextField.setPromptText("Enter Your first name");
        grid.add(fnTextField,1,1);
        
        Label mname = new Label("Middle Name :");
        grid.add(mname,0,2);
        TextField mnTextField = new TextField();
        mnTextField.setPromptText("Enter Your middle name");
        grid.add(mnTextField,1,2);
        
        Label lname = new Label("Last Name :");
        grid.add(lname,0,3);
        TextField lnTextField = new TextField();
        lnTextField.setPromptText("Enter Your last name");
        grid.add(lnTextField,1,3);
        
        Label email = new Label("Email ID :");
        grid.add(email,0,4);
        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter Your Email ID");
        grid.add(emailTextField,1,4);
                
        Label mobile_no = new Label("Mobile No :");
        grid.add(mobile_no,0,5);
        TextField mobTextField = new TextField();
        mobTextField.setPromptText("Enter Your Mobile No.");
        grid.add(mobTextField,1,5);
        
        // Label for the Date of Birth
        Label Dob = new Label("Date of Birth:");
        Label Day = new Label("Day");
        Label Month = new Label("Month");
        Label Year = new Label("Year");

        //first create a string and then the value assign to the string arry and 
        //then we make a combobox and then use a inbuild library of collections framework
         String date[] = {"1","2","3","4","5","6","7","9","10","11","12","13","14","15",
         "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
         String month[] = {"January","February","March","April","May","June","July",
                            "August","September","October","November","December"}; 
         String year[] = {"1995","1996","1997","1998","1999","2000","2001","2002","2003",
                          "2004","2005","2006"};
         ComboBox cb_Day  = new ComboBox(FXCollections.observableArrayList(date));
         ComboBox cb_Month = new ComboBox(FXCollections.observableArrayList(month));
         ComboBox cb_Year = new ComboBox(FXCollections.observableArrayList(year));
         //adding a label and combobox in grid 
         grid.add(Dob, 0, 6);
         grid.add(Day,0,7);
         grid.add(Month,0,8);
         grid.add(Year,0,9);
         grid.add(cb_Day, 1, 7);
         grid.add(cb_Month, 1, 8);
         grid.add(cb_Year, 1, 9);
         
         //Label for the gender
         //radio btn 1 for male
         //radio btn 2 for female
         Label gender = new Label("Gender:");
         grid.add(gender, 0, 10);
         ToggleGroup group = new ToggleGroup();
         RadioButton rb1 = new RadioButton("Male");
         rb1.setToggleGroup(group);
         rb1.setSelected(true);
         RadioButton rb2 = new RadioButton("Female");
         rb2.setToggleGroup(group);

         grid.add(rb1, 1, 10);
         grid.add(rb2, 1, 11);

         Label language = new Label("Language:");
         grid.add(language, 0, 12);

         //checkbox for the lagnguage
         //checkbox 1 for english
         //checkbox 2 for gujarati
         //checkbox 2 for hindi
         CheckBox cb1 = new CheckBox("English");
         CheckBox cb2 = new CheckBox("Gujarati");
         CheckBox cb3 = new CheckBox("Hindi");

         grid.add(cb1, 1,12);
         grid.add(cb2, 1, 13);
         grid.add(cb3, 1, 14);

        
        Button submit = new Button("Submit");
        Button reset = new Button("Reset");
        grid.add(submit,0,15);
        grid.add(reset, 1, 15);
        
        //when you submit sucsuessfully then new scene will be open
        GridPane grid2 = new GridPane();
        Scene sc1 = new Scene(grid2,1000,500);
        Label WelcomePage = new Label();
        WelcomePage.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(grid,650,550);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        submit.setOnAction(e->{
           
            //for name validation
            String fml="[A-Za-z\\s]+";
            Pattern p=Pattern.compile(fml);
            //first name validation
            //textfield name for first name is fnTextField
            Boolean a = p.matcher(fnTextField.getText()).matches();
            if (!a){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Name Warning");
                alert.setHeaderText(null);
                alert.setContentText("First name must be Charcter and it should not be null");
                alert.showAndWait();
            }
            
            //for the middle name validation
            //textfield name for middle name is mnTextField
            Boolean b = p.matcher(mnTextField.getText()).matches();
            if (!b){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Name Warning");
                alert.setHeaderText(null);
                alert.setContentText("Middle name must be Charcter and it should not be null");
                alert.showAndWait();
            }
            // for the last name validation
            //textfield name for last name is lnTextField
            Boolean c = p.matcher(lnTextField.getText()).matches();
            if (!c){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Name Warning");
                alert.setHeaderText(null);
                alert.setContentText("Last name must be Charcter and it should not be null");
                alert.showAndWait();
            }
            
             //Email validation
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            p=Pattern.compile(emailRegex);
            //textfield name of email is emailTextField
            Boolean eChecker = p.matcher(emailTextField.getText()).matches();
            if (!eChecker){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Email Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please Enter Valid Email ID");
                alert.showAndWait();
            }

            //Mobile validation
            String numberRegex = "[6-9][0-9]{9}";
            p = Pattern.compile(numberRegex);
            Boolean numChecker = p.matcher(mobTextField.getText()).matches();
            if (!numChecker){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Mobile Warning");
                alert.setHeaderText(null);
                alert.setContentText("Mobile number must be in 10 digit");
                alert.showAndWait();
            }

            //Combobox validation
            //ComboBox validation for Days
            Boolean d = cb_Day.getSelectionModel().isEmpty();
            if (d){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Day Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please select Day");
                alert.showAndWait();
            }
            //ComboBox validation for Month
            Boolean m = cb_Month.getSelectionModel().isEmpty();
            if (m){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Month Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please select Month");
                alert.showAndWait();
            }
            //ComboBox validation for year  
            Boolean y = cb_Year.getSelectionModel().isEmpty();
            if (y){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Year Warning");
                alert.setHeaderText(null);
                alert.setContentText("Please select Year");
                alert.showAndWait();
            }
            //Radio button validation
            //rb1 is equal to radiobox for male 
            //rb2 is equal to radiobox for female
            Boolean mf=((rb1.isSelected())|| (rb2.isSelected()));
            if (!mf){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle(" Validate Field");
                alert.setHeaderText(null);
                alert.setContentText("Please Select Gender");
                alert.showAndWait();
            }
            //Checkbox validation
            //cb1 means checkbox for english lag.
            //cb2 means checkbox for gujarati lag.
            //cb3 means checkbox for hindi lag.
            Boolean Ehg=((cb1.isSelected())|| (cb2.isSelected()) || (cb3.isSelected())) ;
            if (!Ehg){
                Alert alert=new Alert(Alert.AlertType.WARNING);
                alert.setTitle(" Validate Field");
                alert.setHeaderText(null);
                alert.setContentText("Please Select Language");
                alert.showAndWait();
            }   
            
            if (a && b && c && eChecker && numChecker && !d && !m && !y && mf && Ehg ) {
                primaryStage.setScene(sc1);
                String name=fnTextField.getText()+" "+lnTextField.getText();
                WelcomePage.setText("Welcome to new page\n "+ name);
                grid2.setAlignment(Pos.CENTER);
                grid2.add(WelcomePage,1,1);
                grid2.setStyle("-fx-background-color:rgb(153, 204, 255);-fx-font:40px CENTER");
            }

            
        });
        
       // for the action on the reset button when the reset btn is click all the contents are the clear 
        reset.setOnAction(e->{
            fnTextField.clear();
            mnTextField.clear();
            lnTextField.clear();
            emailTextField.clear();
            mobTextField.clear();
            cb_Day.getSelectionModel().clearSelection();
            cb_Month.getSelectionModel().clearSelection();
            cb_Year.getSelectionModel().clearSelection();
            rb1.setSelected(false);
            rb2.setSelected(false);
            cb1.setSelected(false);
            cb2.setSelected(false);
            cb3.setSelected(false);
        });
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
