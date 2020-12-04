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
public class chooseProfile {
    // this will be an informational button about the app
    Button Exit;
    Button Choose;
    ComboBox Profiles;
    public static void chooseProfile(String Title) {
        
        Stage chooseProfile = new Stage();
        //setting title for window
        chooseProfile.setTitle(Title);
        chooseProfile.initModality(Modality.APPLICATION_MODAL);
        
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(35);
        ComboBox Profiles = new ComboBox();
        Button Choose = new Button("Choose Profile");
        Button Exit = new Button("Back");
        Exit.setOnAction(e -> chooseProfile.close());
        Choose.setOnAction(e -> {
            mainMenu.mainMenu("Project Apollo - Main Menu");
            chooseProfile.hide();
            ;
                });
        
        layout.getChildren().addAll(Profiles,Choose,Exit);
        
        
        
        Scene scene = new Scene(layout, 300, 380);
        chooseProfile.setScene(scene);
        
        chooseProfile.showAndWait();
        
    }
}
