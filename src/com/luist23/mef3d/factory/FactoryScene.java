package com.luist23.mef3d.factory;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.luist23.mef3d.scenes.fin.SceneEnsamblaje;
import com.luist23.mef3d.scenes.fin.SceneMatrizComponent;
import com.luist23.mef3d.scenes.inicio.SceneDatos;
import com.luist23.mef3d.scenes.inicio.SceneModelo;
import com.luist23.mef3d.scenes.inicio.SceneStart;
import com.luist23.mef3d.scenes.numeracion.TypeScene;
import com.luist23.mef3d.scenes.pasos.*;

public class FactoryScene {

    public static Scene getScene(TypeScene type, Application app, Stage stage) {
        //Parent fxml;
        switch (type) {
            case MAIN:
                SceneStart sceneStart = new SceneStart(stage);
                return sceneStart.getScene();
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
            case ENSAMBLAJE:
                SceneEnsamblaje sceneEnsamblaje= new SceneEnsamblaje(stage);
                return sceneEnsamblaje.getScene();
        }
        return null;
    }
}
