/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionListener;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.TextAlignment;
import View.createProfile;
import static javafx.application.Application.launch;
import static javafx.application.Platform.exit;
/**
 *
 * @author Matt
 */
// Looking at https://www.youtube.com/watch?v=FLkOX4Eez6o which is a JavaFX 
// tutorial to get started
public class appMenu extends Application implements EventHandler<ActionEvent>{
    
    //Buttons/Labels
    Label apolloLabel;
    Button profileButton;
    Button continueButton;
    Button aboutButton;
    Button exitButton;
   
    
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        //setting title for window
        primaryStage.setTitle("Project Apollo");
        //Label for title
        apolloLabel = new Label("Project Apollo");
       
        //Button 1 for creating a new profile on the login page
        profileButton = new Button("Create Profile");
        
        
        //Button 2 for creating a new profile on the login page
        continueButton = new Button("Use existing profile");
        
        //Button 3 for going to about section
        aboutButton = new Button("About/Help");
        
        exitButton = new Button("Exit");
        
        
        // setting VBox layout to make the labels + buttons have a vertical alignment
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        apolloLabel.setAlignment(Pos.TOP_CENTER);
        layout.setSpacing(35);
        layout.getChildren().add(apolloLabel);
        layout.getChildren().add(profileButton);
        layout.getChildren().add(continueButton);
        layout.getChildren().add(aboutButton);
        layout.getChildren().add(exitButton);
        
        
        exitButton.setOnAction(this);
        
        Scene scene = new Scene(layout,300,380);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        

}

    @Override
    public void handle(ActionEvent event) {
     if(event.getSource()== exitButton) {
         exit();
    }
     if(event.getSource()== profileButton) {
    
    }
     if(event.getSource()== continueButton) {
       
    }
     if(event.getSource()== aboutButton) {
         exit();
    }
     
    }
}