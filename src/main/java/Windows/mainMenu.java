/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import Windows.Shoot;
/**
 *
 * @author Matt
 */
public class mainMenu extends Stage{
    
Scene mainMenu;
    

    public mainMenu(String Title) {

        //Buttons/Labels/Stage
        this.initModality(Modality.APPLICATION_MODAL);
        Button shotLogging = new Button("Shoot!");
        Button profileInfo = new Button("Profile Info");
        Button logoutButton = new Button("Logout");
        
        //setting title for window
        this.setTitle(Title);
        
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(35);
        
        layout.getChildren().add(shotLogging);
        layout.getChildren().add(profileInfo);
        layout.getChildren().add(logoutButton);
        Scene mainMenu = new Scene(layout,300,380);
        this.setScene(mainMenu);
        this.show();
        
        shotLogging.setOnAction(e -> {
            try {
                Shoot newChart = new Shoot("shot");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }

 
        });


    }

    public Scene getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(Scene mainMenu) {
        this.mainMenu = mainMenu;
    }
     
}
