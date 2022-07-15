package assignment2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.util.*;
import javafx.scene.layout.*;
import javafx.scene.effect.*;
import javafx.geometry.*;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.stage.Window;
import javafx.scene.text.*;
import java.util.regex.*;
import javafx.beans.value.*;
import javafx.collections.FXCollections;

/**
 *
 * @author RATHI B. SONEJI
 */
public class Assignment2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        String  T1 = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                     "[a-zA-Z0-9_+&*-]+)*@" +
                     "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                     "A-Z]{2,7}$";
        
        String  fn = "[a-zA-Z]+";
        
        GridPane pane=new GridPane();
        pane.setAlignment(Pos.TOP_CENTER);
        pane.setHgap(10);
        pane.setVgap(20);
        pane.setPadding(new Insets(25, 25, 25, 25));
        
        Text T=new Text("      Registration Form");
        T.setStroke(Color.CRIMSON);
        T.setFill(Color.AQUA);
        T.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 40));
        pane.add(T, 0, 0, 2, 1);
        
        Label F_Name=new Label("First Name");
        F_Name.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(F_Name, 0, 1);
        
        TextField f_name=new TextField();
        f_name.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(f_name, 1, 1);

        Label M_Name=new Label("Middle Name");
        M_Name.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(M_Name, 0, 2);
        
        TextField m_name=new TextField();
        m_name.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(m_name, 1, 2);

        Label L_Name=new Label("Last Name");
        L_Name.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(L_Name, 0, 3);
        
        TextField l_name=new TextField();
        l_name.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(l_name, 1, 3);
        l_name.getText();

        Label E=new Label("Email");
        E.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(E, 0, 4);
       
        TextField em=new TextField();
        em.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(em, 1, 4);
        
        Label Mo=new Label("Mobile No.");
        Mo.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(Mo, 0, 5);
        String T2 = "\\d{8}|\\d{10}";
        
        TextField mo=new TextField();
        mo.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(mo, 1, 5);
        
        mo.lengthProperty().addListener(new ChangeListener<Number>()
        {
                @Override
                public void changed(ObservableValue<? extends Number> observableValue, Number oldValue,Number newValue)
                {
                    if(newValue.intValue() > oldValue.intValue())
                    {
                        if(mo.getText().length()>10)
                        {
                            mo.setText(mo.getText().substring(0, 10));
                        }
                    }
                }
        });

        Label DOB=new Label("Date of Birth");
        DOB.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(DOB, 0, 6);
        
        String[] days = {"Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        ComboBox date = new ComboBox<>(FXCollections.observableArrayList(days));
        date.setValue("Date");
        
        String[] months = {"Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        ComboBox month = new ComboBox<>(FXCollections.observableArrayList(months));
        month.setValue("Month");
        
        String[] years = {"Year", "1991", "1992", "1993", "1994" , "1995" , "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004" , "2005" , "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
        ComboBox year = new ComboBox<>(FXCollections.observableArrayList(years));
        year.setValue("Year");
        HBox h4 = new HBox();
        h4.setSpacing(8);
        h4.getChildren().addAll(date,month,year);
        pane.add(h4, 1, 6);
        
        Label G=new Label("Gender");
        G.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(G, 0, 7);
        ToggleGroup g=new ToggleGroup();
        
        RadioButton m=new RadioButton("Male");
        m.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(m, 1, 7);
        
        RadioButton f=new RadioButton("Female");
        f.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(f, 1, 8);
        
        m.setToggleGroup(g);
        f.setToggleGroup(g);

        Label Lan=new Label("Language Known");
        Lan.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(Lan, 0, 9);
    
        CheckBox Hindi=new CheckBox("Hindi");
        Hindi.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(Hindi, 1, 9);
        
        CheckBox Gujrati=new CheckBox("Gujrati");
        Gujrati.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(Gujrati, 1, 10);
        
        CheckBox English=new CheckBox("English");
        English.setFont(Font.font("Arial", FontWeight.THIN, FontPosture.REGULAR, 14));
        pane.add(English, 1, 11);
                        
        Button S=new Button("SUBMIT");
        S.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(S, 2, 12);
        S.setAlignment(Pos.BOTTOM_LEFT);

        Button C=new Button("RESET");
        C.setFont(Font.font("Algerian", FontWeight.SEMI_BOLD, FontPosture.REGULAR, 16));
        pane.add(C, 0, 12);
        
        S.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                if ((f_name.getText() == null || !f_name.getText().matches(fn)))
                {
                    Alert first= new Alert(Alert.AlertType.ERROR);
                    first.setTitle("Validation of First Name");
                    first.setHeaderText(null);
                    first.setContentText("Enter Your First Name.");
                    first.showAndWait();
                    f_name.getText();
                }
                
                if ((m_name.getText() == null || !m_name.getText().matches(fn)))
                {
                    Alert middle= new Alert(Alert.AlertType.ERROR);
                    middle.setTitle("Validation of Middle Name");
                    middle.setHeaderText(null);
                    middle.setContentText("Enter Your Middle Name.");
                    middle.showAndWait();
                    m_name.getText();
                }
                
                if ((l_name.getText() == null || !l_name.getText().matches(fn)))
                {
                    Alert last= new Alert(Alert.AlertType.ERROR);
                    last.setTitle("Validation Of Last Name");
                    last.setHeaderText(null);
                    last.setContentText("Enter Your Last Name.");
                    last.showAndWait();
                    l_name.getText();
                }

                if(!em.getText().matches(T1))
                {
                    Alert email= new Alert(Alert.AlertType.ERROR);
                    email.setTitle("Validation of Email");
                    email.setHeaderText(null);
                    email.setContentText("The Email must be like :- example@gmail.com");
                    email.showAndWait();
                }
                
                if(!mo.getText().matches(T2))
                {
                    Alert mobile = new Alert(Alert.AlertType.ERROR);
                    mobile.setTitle("Validate Number");
                    mobile.setHeaderText(null);
                    mobile.setContentText("Enter 10 Digits Mobile Number.");
                    mobile.showAndWait();
                }
                
                else
                {
			GridPane pane2 = new GridPane();
                    Scene scene2 = new Scene(pane2, 1000, 300);
                    pane2.setStyle("-fx-font: 120px CENTER"); // Setting GridPane styling and Allignment
                    pane2.setAlignment(Pos.CENTER);
                    Label welcomePage = new Label();
                    pane2.setStyle("-fx-background-color:LIGHTCYAN");
                    
                    primaryStage.setScene(scene2);
                    String name = f_name.getText() + " " + l_name.getText();
                    welcomePage.setText("Welcome " + name + " to this submit Window");
                    pane2.add(welcomePage, 1, 1);                
                }
            }
            
       });
        
        C.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent e)
            {
                f_name.clear();
                m_name.clear();
                l_name.clear();
                em.clear();
                mo.clear();
                date.setValue("Date");
                month.setValue("Month");
                year.setValue("Year");
                m.setSelected(false);
                f.setSelected(false);
                Hindi.setSelected(false);
                Gujrati.setSelected(false);
                English.setSelected(false);
            }
        });
        
        Scene scene=new Scene(pane, 1000, 780);
        pane.setStyle("-fx-background-color:BURLYWOOD");
        
        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}