package Windows;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import static javafx.application.Platform.exit;
import javafx.application.Platform;

/**
 *
 * @author Matt
 */
// Looking at https://www.youtube.com/watch?v=FLkOX4Eez6o which is a JavaFX 
// tutorial to get started
public class appMenu extends Application{
    
    //Buttons/Labels
    Label apolloLabel;
    Button profileButton;
    Button continueButton;
    Button aboutButton;
    Button exitButton;
    Stage appStage;
    
    Scene appMenu;
    
    
   
   
    
    public void appMenu(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        appStage = primaryStage;
        
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
        
        //creating objects to call getters
       aboutApp aboutObj = new aboutApp("Title");
       createProfile createProfileObj = new createProfile("Project Apollo - Create Profile");
       chooseProfile chooseProfileObj = new chooseProfile("Project Apollo - Choose Profile");
       
       exitButton.setOnAction(e -> Platform.exit());
       aboutButton.setOnAction(e -> appStage.setScene(aboutObj.about));
       profileButton.setOnAction(e -> appStage.setScene(createProfileObj.createProfile));
       continueButton.setOnAction(e -> appStage.setScene(chooseProfileObj.getChooseProfile()));
        
        Scene appMenu = new Scene(layout,300,380);
        primaryStage.setScene(appMenu);
        primaryStage.show();
        
        

    }


}
