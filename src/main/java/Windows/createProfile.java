/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Matt
 */
public class createProfile {

    //Labels & text entries
    Label profileName;
    TextField pName;
    Label bowType;
    ComboBox bow;
    Label skillLevel;
    ComboBox sLevel;
    Label bodyType;
    ComboBox bType;
    Stage createprofileStage;
    Button back;
    Button forward;

    public static void createProfile(String Title) {

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
        
        Stage createProfile = new Stage();
        createProfile.initModality(Modality.APPLICATION_MODAL);
        createProfile.setTitle(Title);

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
        dropDown.getItems().addAll("Youth Male", "Youth Female", "Young Adult Male",
                "Young Adult Female", "Adult Male", "Adult Female", "Elder Male",
                "Elder Female");
        dropDown2.getItems().addAll("Beginner", "Experienced", "Expert");
        dropDown3.getItems().addAll("Recurve", "Compound");

        bType = new ComboBox(dropDown.getItems());
        sLevel = new ComboBox(dropDown2.getItems());
        bow = new ComboBox(dropDown3.getItems());

        VBox layout = new VBox();

        layout.setAlignment(Pos.CENTER);

        //adds all of the elements to the panel
        layout.setSpacing(17);
        layout.getChildren().add(profileName);
        layout.getChildren().add(pName);
        layout.getChildren().add(skillLevel);
        layout.getChildren().add(sLevel);
        layout.getChildren().add(bowType);
        layout.getChildren().add(bow);
        layout.getChildren().add(bodyType);
        layout.getChildren().add(bType);
        //  layout.getChildren().add(back);       
        // layout.getChildren().add(forward);
        Scene scene = new Scene(layout, 400, 520);

        createProfile.setScene(scene);

        createProfile.showAndWait();

    }
}
