/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import static java.awt.SystemColor.window;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Matt
 */

public class aboutApp {
    // this will be an informational button about the app
    Button Exit;

    public static void about(String Title) {
        
        Stage about = new Stage();
        //setting title for window
        about.setTitle(Title);
        about.initModality(Modality.APPLICATION_MODAL);
        
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(35);

      
        Button Exit = new Button("Back");
        Exit.setOnAction(e -> about.close());
        
        layout.getChildren().add(Exit);
        
        Scene scene = new Scene(layout, 300, 380);
        about.setScene(scene);
        
        about.showAndWait();
        
    }
}
