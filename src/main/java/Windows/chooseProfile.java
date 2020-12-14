/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 *
 * @author Matt
 */
public class chooseProfile extends Stage {
 
    Button Exit;
    Button Choose;
    ComboBox Profiles;
    Scene chooseProfile;
   public chooseProfile (String Title) {
  
        //setting title for window
        this.setTitle(Title);
        this.initModality(Modality.APPLICATION_MODAL);
        
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(35);
        ComboBox Profiles = new ComboBox();
        Button Choose = new Button("Choose Profile");
        Button Exit = new Button("Back");
        
        Exit.setOnAction(e -> this.close());
        
        mainMenu mainMenuObj = new mainMenu("Title main menu");
        
        Choose.setOnAction(e -> {
            this.setScene(mainMenuObj.getMainMenu());
            this.hide();
            ;
                });
        
        layout.getChildren().addAll(Profiles,Choose,Exit);
        
        
        
        Scene chooseProfile = new Scene(layout, 300, 380);
        this.setScene(chooseProfile);
        
        this.showAndWait();
        
    }

    public Scene getChooseProfile() {
        return chooseProfile;
    }
   
}
