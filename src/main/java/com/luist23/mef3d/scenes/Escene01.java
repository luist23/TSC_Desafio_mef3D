package main.java.com.luist23.mef3d.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.MainApp;
import main.java.com.luist23.mef3d.Stage2;
import main.java.com.luist23.mef3d.utils.Utiles;

public class Escene01 {
    private HBox hBox;
    private Button button;

    public Escene01(Stage stage){
        stage.setTitle("welcome!");
        button = new Button("Next page");

        button.setOnAction(e -> {
            MainApp.setSceneFactory(TypeScene.STAGE2);
            //window.close();
        });

        hBox= new HBox(button);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPrefHeight(150.0);
        hBox.getChildren().addAll(Utiles.imagen("a",hBox.getPrefHeight()));
        hBox.setBackground(Utiles.background("a",hBox.getHeight(),hBox.getWidth()));
    }

    public Scene getScene(){
        return new Scene(hBox);
    }
}
