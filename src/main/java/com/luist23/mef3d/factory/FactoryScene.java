package main.java.com.luist23.mef3d.factory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.*;

import java.io.IOException;

public class FactoryScene {

    public static Scene getScene(TypeScene type, Application app, Stage stage) {
        //Parent fxml;
        switch (type) {
            case MAIN:
                Escene01 escene01 = new Escene01(stage);
                return escene01.getScene();
            case STAGE2:
                Escene02 escene02 = new Escene02(stage);
                return escene02.getScene();
            case S3D:
                Escene3D escene3D = new Escene3D(stage);
                return escene3D.getScene();
            case MODELO:
                SceneModelo sceneModelo = new SceneModelo(stage);
                return sceneModelo.getScene();
            case PASO1:
                ScenePaso1 scenePaso1=new ScenePaso1(stage);
                return  scenePaso1.getScene();
        }
        return null;
    }
}
