package main.java.com.luist23.mef3d.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.MainApp;
import main.java.com.luist23.mef3d.Stage2;
import main.java.com.luist23.mef3d.utils.Utiles;



public class Escene01 {
    private VBox hBox;
    private Button button;

    public Escene01(Stage stage){
        stage.setTitle("welcome!");
        button = new Button("Iniciar");

        button.setOnAction(e -> {
            MainApp.setSceneFactory(TypeScene.MODELO);
            //window.close();
        });
        Text mensaje = new Text();


        hBox= new VBox(mensaje,button);
        hBox.setAlignment(Pos.BOTTOM_CENTER);
        hBox.setPrefHeight(150.0);
        //hBox.getChildren().addAll(Utiles.imagen("background01",hBox.getPrefHeight(),hBox.getWidth()));
        hBox.setBackground(Utiles.background("background01",hBox.getHeight(),hBox.getWidth()));
        mensaje.setText("Bienvenido! Prro ;v");
    }

    public Scene getScene(){
        return new Scene(hBox);
    }
}
