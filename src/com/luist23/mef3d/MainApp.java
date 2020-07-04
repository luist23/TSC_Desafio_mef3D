package com.luist23.mef3d;

import javafx.application.Application;
import javafx.stage.Stage;
import com.luist23.mef3d.factory.FactoryScene;
import com.luist23.mef3d.scenes.fin.SceneEnsamblaje;
import com.luist23.mef3d.scenes.numeracion.TypeScene;
import com.luist23.mef3d.utils.Utiles;

import static java.lang.Thread.sleep;


public class MainApp extends Application {

    private static MainApp main;
    private static Stage primary;

    @Override

    public void start(Stage primaryStage) throws Exception {
        primary = primaryStage;
        main = this;
        primary.setMaximized(true);
        new Thread(new Runnable() {
            public void a(){

            }
            public void run() {
                SceneEnsamblaje.b= Utiles.animation("datos/1emsamblajeDos", MainApp.primary.getHeight()*0.9, MainApp.primary.getHeight()*0.9*5.52);
                SceneEnsamblaje.a=Utiles.animation("datos/1emsamblajeUno", MainApp.primary.getHeight()*0.9, MainApp.primary.getHeight()*0.9*4.52);
                SceneEnsamblaje.c=Utiles.animation("datos/1aplicando-condiciones", MainApp.primary.getHeight()*0.9, MainApp.primary.getHeight()*0.9*4.79);
                //as.setValue(false);
            }
        }).start();





        setSceneFactory(TypeScene.MAIN);
        //primaryStage.setScene(FactoryScene.getScene(TypeScene.MAIN , this,primaryStage));
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
        //System.out.println(primaryStage);
        //primaryStage.setTitle("example");
        primaryStage.show();

    }

    public static void setSceneFactory(TypeScene a){
        primary.setScene(FactoryScene.getScene(a, main, primary));
    }

    public static void main(String... args) {
        launch(args);

    }

    public static MainApp obtenerdirrectorio() {
        main = new MainApp();
        return main;
    }

    public static MainApp getInstance() {
        return main;
    }
    public static Stage getStage(){
        return primary;
    }

}
