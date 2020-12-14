/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.scene.Group;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Matt
 */
public class Shoot extends Stage {


    public Shoot(String Title) throws FileNotFoundException{
        
        this.initModality(Modality.APPLICATION_MODAL);
        this.setTitle(Title);
        
        //Getting image https://www.tutorialspoint.com/javafx/javafx_images.htm
        InputStream inputStream = getClass().getResourceAsStream("MavenProjectApollo/src/main/resources/shotTarget.png");
        Image target = new Image(inputStream);
        
        
        ImageView imageView = new ImageView(target);
        
        imageView.setX(15);
        imageView.setY(30);
        
        imageView.setFitHeight(750);
        imageView.setFitWidth(900);
        
        imageView.setPreserveRatio(true); 
        
        Button Back = new Button("Back");
        
   
        Button Log = new Button("Log");
        VBox layout = new VBox();
        layout.setAlignment(Pos.CENTER);
        layout.setSpacing(35);
        
        layout.getChildren().add(Back);
        layout.getChildren().add(Log);
        
        //combine imageView and layout to one with group
        Group root = new Group(imageView,layout);
        
        Scene scene = new Scene(root,1600,900);
         
        this.setScene(scene);
        this.show();
    }
}
