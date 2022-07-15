/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

public class Login_Page extends Application {

    /**
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        Label lab1 = new Label("UserName:");
        TextField t = new TextField("Email/Phone");
        Label lab2 = new Label("PassWord :");
        TextField p = new TextField("Password");
        Button submit = new Button("Submit");
        Button clear = new Button("Clear");
        
        
        FlowPane root = new FlowPane();
        root.getChildren().add(lab1);
        root.getChildren().add(t);
        root.getChildren().add(lab2);
        root.getChildren().add(p);
        root.getChildren().add(submit);
         root.getChildren().add(clear);

        Scene scene = new Scene(root, 250, 300);
        primaryStage.setTitle("Welcome to Login Page");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String args[]) {
        Application.launch(args);
    }
}
