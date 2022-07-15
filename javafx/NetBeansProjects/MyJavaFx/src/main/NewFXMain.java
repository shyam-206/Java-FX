package main;

import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.event.ActionEvent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
        
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label l1=new Label("First Name : ");
        TextField fname=new TextField();
        
        Label l2=new Label("Middle Name : ");
        TextField mname=new TextField();
        
        Label l3=new Label("Last Name : ");
        TextField lname=new TextField();
        
        Label l4=new Label("Email : ");
        TextField email=new TextField();
        
        email.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                String emailc=email.getText();
                int v1=0,v2=0;
                char[] emaila=emailc.toCharArray();
                for(int i=0;i<emaila.length;i++){
                    if(Character.isLetter(emaila[i])){
                        if(Character.isLowerCase(emaila[i]));
                        v2=1;
                    }   
                    if(emaila[i]=='@' && emaila[i+1]!='.' && i>=8)
                            v1++;
                }
                if(v1>0 && v2==1)
                    email.setStyle("-fx-border-color: green");
                else
                    email.setStyle("-fx-border-color: red");
            }
        });
        
        Label l5=new Label("Mobile Number : ");
        TextField mno=new TextField();
        
        mno.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                String mnoc=mno.getText();
                char[] mnoa=mnoc.toCharArray();
                if(mnoa.length==9)
                        mno.setStyle("-fx-border-color: green");
                else
                        mno.setStyle("-fx-border-color: red");
                
            }
        });
        
        Label l6=new Label("Date Of Birth(dd//mm//yyyy) : ");
        ComboBox date=new ComboBox();
        for(int i=1;i<32;i++){
            date.getItems().add(i);
        }
        ComboBox month=new ComboBox();
            month.getItems().addAll("January","February","March","April","May","June","July","August","September","October","November","December");
        ComboBox year=new ComboBox();
        for(int i=1950;i<2023;i++){
            year.getItems().add(i);
        }
        date.valueProperty().set(1);
        month.valueProperty().set("January");
        year.valueProperty().set(1950);
        
        ToggleGroup g1=new ToggleGroup();
        Label l7=new Label("Gender : ");
        RadioButton rb1=new RadioButton("Female");
        RadioButton rb2=new RadioButton("Male");
        RadioButton rb3=new RadioButton("Other");
        rb1.setToggleGroup(g1);
        rb1.setSelected(true);
        rb2.setToggleGroup(g1);
        rb3.setToggleGroup(g1);
        
        Label l8=new Label("Languages known : ");
        CheckBox ch3=new CheckBox("English");
        CheckBox ch2=new CheckBox("Hindi");
        CheckBox ch1=new CheckBox("Gujarati");
        ch1.setSelected(true);
        
        Button submit=new Button("Submit");
        submit.setStyle("-fx-background-color: green; -fx-text-fill: white;");
        
        submit.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
             boolean textFieldValidation = false;
                boolean emailValidation = false;
                boolean mobileValidation = false;
                boolean dobValidation = false;
                boolean genderValidation = false;
                boolean languageValidation = false;

                if(fname.getLength() > 0 && mname.getLength() > 0 && lname.getLength() > 0){
                    textFieldValidation = true;
                }
                if(email.getStyle() == "-fx-border-color: green"){
                    emailValidation = true;
                }
                if(mno.getStyle() == "-fx-border-color: green"){
                    mobileValidation = true;
                }
                if((date.getValue() != null) && (month.getValue() != null) && (year.getValue() != null)) {
                    dobValidation = true;
                }
                if(rb1.isSelected() == true || rb2.isSelected() == true||rb3.isSelected()==true){
                    genderValidation = true;
                }
                if(ch1.isSelected() == true || ch2.isSelected() == true || ch3.isSelected() == true){
                    languageValidation = true;
                }

                if(textFieldValidation == true && emailValidation == true && mobileValidation ==true && dobValidation == true && genderValidation == true && languageValidation == true){
                    Image wcImage = new Image("C:\\Users\\shyam\\Pictures\\Screenshots\\welcome.jpg");
                    ImageView imageView = new ImageView(wcImage);
                    Pane imagePane = new Pane(imageView);
                    Scene sceneWc = new Scene(imagePane);
                    primaryStage.setScene(sceneWc);
                }
                else if(textFieldValidation == false){
//                    System.out.println("Please Enter Your Name Properly");
                    submit.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                }
                else if(emailValidation == false){

//                    System.out.println("Please Enter Your EMail Address Properly");
                    submit.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                }
                else if(mobileValidation == false){
                    System.out.println("Please Enter Your Mobile Number Properly");
                    submit.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                }
                else if(dobValidation == false){
//                    System.out.println("Please Select Your Date of Birth Properly");
                    submit.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                }
                else if(genderValidation == false){
//                    System.out.println("Please Select Your Gender Properly");
                    submit.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                }
                else if(languageValidation == false){
//                    System.out.println("Please Select Your known Languages Properly");
                    submit.setStyle("-fx-background-color: red; -fx-text-fill: white;");
                }
            }
        });


        
            
        
        Button cancel=new Button("Cancel");
        cancel.setStyle("-fx-background-color: darkgrey; -fx-text-fill: black;");
        
        cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
             public void handle(ActionEvent event) {
                fname.clear();
                mname.clear();
                lname.clear();
                email.clear();
                email.setStyle(null);
                mno.clear();
                mno.setStyle(null);
                date.valueProperty().set(1);
                month.valueProperty().set("January");
                year.valueProperty().set(1950);
                rb2.setSelected(false);
                rb3.setSelected(false);
                ch2.setSelected(false);
                ch3.setSelected(false);
            }
        });    
        
        GridPane root=new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(10,10,10,10));
        root.setVgap(10);
        root.setHgap(10);
        root.add(l1,0,0);
        root.add(fname,1,0);
        root.add(l2,0,1);
        root.add(mname,1,1);
        root.add(l3,0,2);
        root.add(lname,1,2);
        root.add(l4,0,3);
        root.add(email,1,3);
        root.add(l5,0,4);
        root.add(mno,1,4);
        root.add(l6,0,5);
        HBox d=new HBox(10);
        d.getChildren().addAll(date,month,year);
        root.add(d,1,5); 
        HBox g=new HBox(10);
        g.getChildren().addAll(rb1,rb2,rb3);
        root.add(l7,0,6);
        root.add(g,1,6);
        HBox c=new HBox(10);
        c.getChildren().addAll(ch1,ch2,ch3);
        root.add(l8,0,7);
        root.add(c,1,7);
        root.add(submit,0,8);
        root.add(cancel,1,8);
        
        BackgroundFill bg_fill=new BackgroundFill(Color.SNOW,CornerRadii.EMPTY,Insets.EMPTY);
        Background bg=new Background(bg_fill);
        root.setBackground(bg);
        Scene scene = new Scene(root, 700, 550);
        
        primaryStage.setTitle("My Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}