/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Matt
 */
public class mainMenu extends Application{
    
    //Buttons/Labels
    Button shotLogging;
    Button logoutButton;
    Button profileInfo;
   
    
    public static void main(String[] args) {
        launch(args);
    }
  
    @Override
    public void start(Stage primaryStage) throws Exception {

        //setting title for window
        primaryStage.setTitle("Project Apollo - Main Menu");
        
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(35);
        
         layout.getChildren().add(shotLogging);
        layout.getChildren().add(profileInfo);
        layout.getChildren().add(logoutButton);
        Scene scene = new Scene(layout,300,380);
        primaryStage.setScene(scene);
        primaryStage.show();
        

}
     
    }
