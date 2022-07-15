/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author shyam
 */
public class MyJavaFx extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("OK");
        Scene scene = new Scene(btn,200,250);
        
        primaryStage.setTitle("MyJavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
