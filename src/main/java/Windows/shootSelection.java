/*
 * May implement this
 * 
 * 
 */
package Windows;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Matt
 */
public class shootSelection {
    public static void shotType(String Title){
        Stage shootSelection = new Stage();
        

        Label Selection = new Label("Free Shoot or Round Shoot?");
        Button FreeShot = new Button("Free Shoot");
        //Button RoundShot = new Button("Round Shoot");
        Button Back = new Button("Back");
        shootSelection.initModality(Modality.APPLICATION_MODAL);
        shootSelection.setTitle(Title);
        
        VBox layout = new VBox();
        layout.getChildren().addAll(Selection,FreeShot);
        Scene scene = new Scene(layout,300,380);
        shootSelection.setScene(scene);
        shootSelection.show();
    }
}
