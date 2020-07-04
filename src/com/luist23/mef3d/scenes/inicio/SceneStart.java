package com.luist23.mef3d.scenes.inicio;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.luist23.mef3d.MainApp;
import com.luist23.mef3d.scenes.numeracion.TypeScene;
import com.luist23.mef3d.utils.Utiles;


public class SceneStart {
    private VBox hBox;
    private HBox button;// = new HBox();

    public SceneStart(Stage stage){
        stage.setTitle("welcome!");
        button = new HBox();

        button.setOnMouseClicked(e -> {
            MainApp.setSceneFactory(TypeScene.MODELO);
            //window.close();
        });
        //Text mensaje = new Text();



        //HBox hBox2= new HBox(button);
        //hBox2.setPrefHeight(stage.getHeight()*0.2);
        //hBox2.setPrefWidth(stage.getWidth()*0.2);
        hBox= new VBox(button);
        hBox.setAlignment(Pos.BOTTOM_LEFT);
        //stage.setHeight(500);
        //stage.setWidth(700);

        hBox.setPrefHeight(stage.getHeight());
        hBox.setPrefWidth(stage.getWidth());

        button.setPrefHeight(stage.getHeight()*0.2);
        button.setPrefWidth(stage.getWidth()*0.2);

        //hBox.getChildren().addAll(Utiles.imagen("background01",hBox.getPrefHeight(),hBox.getWidth()));
        hBox.setBackground(Utiles.background2("imagenes/wellcome",stage.getHeight(),stage.getWidth()));
        button.setBackground( Utiles.background("imagenes/buttonContinue",stage.getHeight()*0.2,stage.getWidth()*0.2));

        stage.heightProperty().addListener((obs, oldVal, newVal) -> {
            redimension(stage);
        });
        //mensaje.setText("Bienvenido! Prro ;v");
    }

    private void redimension(Stage stage) {
        hBox.setPrefHeight(stage.getHeight());
        hBox.setPrefHeight(stage.getWidth());
        button.setPrefHeight(stage.getHeight()*0.2);
        button.setPrefHeight(stage.getHeight()*0.2);
    }

    public Scene getScene(){
        return new Scene(hBox);
    }
}
