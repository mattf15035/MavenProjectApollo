/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.awt.event.ActionListener;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.TextAlignment;
/**
 *
 * @author Matt
 */
public class createProfile extends Application{
    //Labels & text entries
   Label profileName; 
   TextField pName;
   Label bowType; 
   ComboBox bow;
   Label skillLevel;
   ComboBox sLevel;
   Label bodyType;
   ComboBox bType;
   
   Button back;
   Button forward;


public static void main(String[] args) {
        launch(args);
    }

@Override
    public void start(Stage createprofileStage) throws Exception {

        createprofileStage.setTitle("Create Profile");
        
        profileName = new Label("Profile name: ");
        pName = new TextField();
        bowType = new Label("Bow type: ");
        skillLevel = new Label("Skill level: ");
        bodyType = new Label("Body Type");
        back = new Button("Back");       
        forward = new Button("Forward");       
        ComboBox dropDown = new ComboBox();
        ComboBox dropDown2 = new ComboBox();
        ComboBox dropDown3 = new ComboBox();
        //Setting items for both dropdown boxes
        dropDown.getItems().addAll("Youth Male","Youth Female","Young Adult Male",
                "Young Adult Female","Adult Male","Adult Female","Elder Male",
                "Elder Female");
        dropDown2.getItems().addAll("Beginner","Experienced","Expert");
        dropDown3.getItems().addAll("Recurve","Compound");
        
        bType = new ComboBox(dropDown.getItems());
        sLevel = new ComboBox(dropDown2.getItems());
        bow = new ComboBox(dropDown3.getItems());
       
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        // adds all of the elements to the panel
        layout.setSpacing(20);
        layout.getChildren().add(profileName);
        layout.getChildren().add(pName);
        layout.getChildren().add(skillLevel);
        layout.getChildren().add(sLevel);
        layout.getChildren().add(bowType);
        layout.getChildren().add(bow);
        layout.getChildren().add(bodyType);
        layout.getChildren().add(bType);
        layout.getChildren().add(forward);
        layout.getChildren().add(back);
        
        Scene scene = new Scene(layout,400,520);
        createprofileStage.setScene(scene);
        createprofileStage.show();
        
        
        
    }
}
