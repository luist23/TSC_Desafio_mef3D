package main.java.com.luist23.mef3d.factory;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.Escene01;
import main.java.com.luist23.mef3d.scenes.Escene02;
import main.java.com.luist23.mef3d.scenes.TypeScene;

import java.io.IOException;

public class FactoryScene {

    public static Scene getScene(TypeScene type, Application app, Stage stage) {
        Parent fxml;
        switch (type) {
            case MAIN:
                Escene01 escene01 = new Escene01(stage);
                return escene01.getScene();
            case STAGE2:
                Escene02 escene02 = new Escene02(stage);
                return escene02.getScene();
        }
        return null;
    }
}
