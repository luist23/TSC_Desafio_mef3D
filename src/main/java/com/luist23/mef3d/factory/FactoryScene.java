package main.java.com.luist23.mef3d.factory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.*;
import main.java.com.luist23.mef3d.scenes.fin.SceneMatrizComponent;
import main.java.com.luist23.mef3d.scenes.inicio.SceneDatos;
import main.java.com.luist23.mef3d.scenes.inicio.SceneModelo;
import main.java.com.luist23.mef3d.scenes.inicio.SceneStart;
import main.java.com.luist23.mef3d.scenes.numeracion.TypeScene;
import main.java.com.luist23.mef3d.scenes.pasos.*;

public class FactoryScene {

    public static Scene getScene(TypeScene type, Application app, Stage stage) {
        //Parent fxml;
        switch (type) {
            case MAIN:
                SceneStart sceneStart = new SceneStart(stage);
                return sceneStart.getScene();
            case STAGE2:
                Escene02 escene02 = new Escene02(stage);
                return escene02.getScene();
            case S3D:
                Escene3D escene3D = new Escene3D(stage);
                return escene3D.getScene();
            case MODELO:
                SceneModelo sceneModelo = new SceneModelo(stage);
                return sceneModelo.getScene();
            case DOMINIO:
                SceneDatos sceneDatos = new SceneDatos(stage);
                return sceneDatos.getScene();
            case PASO1:
                ScenePaso1 scenePaso1=new ScenePaso1(stage);
                return  scenePaso1.getScene();
            case PASO2:
                ScenePaso2 scenePaso2= new ScenePaso2(stage);
                return scenePaso2.getScene();
            case PASO3:
                ScenePaso3 scenePaso3= new ScenePaso3(stage);
                return scenePaso3.getScene();
            case PASO4:
                ScenePaso4 scenePaso4= new ScenePaso4(stage);
                return scenePaso4.getScene();
            case PASO5:
                ScenePaso5 scenePaso5= new ScenePaso5(stage);
                return scenePaso5.getScene();
            case PASO6:
                ScenePaso6 scenePaso6= new ScenePaso6(stage);
                return scenePaso6.getScene();
            case MATRICES:
                SceneMatrizComponent m= new SceneMatrizComponent(stage);
                return m.getScene();
        }
        return null;
    }
}
