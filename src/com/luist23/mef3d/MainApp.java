package com.luist23.mef3d;

import javafx.application.Application;
import javafx.stage.Stage;
import com.luist23.mef3d.factory.FactoryScene;
import com.luist23.mef3d.scenes.fin.SceneEnsamblaje;
import com.luist23.mef3d.scenes.numeracion.TypeScene;
//export JVM_ARGS="-Xms1024m -Xmx1024m"
import static java.lang.Thread.sleep;


public class MainApp extends Application {

    private static MainApp main;
    private static Stage primary;

    @Override

    public void start(Stage primaryStage) throws Exception {
        primary = primaryStage;
        main = this;
        primary.setMaximized(true);
        Utiles.utiles = new Utiles();
        new Thread(new Runnable() {
            public void run() {
                SceneEnsamblaje.a=Utiles.imagen("datos/emsamblajeUno1", MainApp.primary.getHeight()*0.9, MainApp.primary.getHeight()*0.9*4.52);
                SceneEnsamblaje.a1=Utiles.imagen("datos/emsamblajeUno2", MainApp.primary.getHeight()*0.9, MainApp.primary.getHeight()*0.9*4.52);
                //SceneEnsamblaje.b=SceneEnsamblaje.a1;
                SceneEnsamblaje.b1= Utiles.imagen("datos/emsamblajeDos2", MainApp.primary.getHeight()*0.9, MainApp.primary.getHeight()*0.9*5.52);
                SceneEnsamblaje.c=Utiles.imagen("datos/aplicando-condiciones1", MainApp.primary.getHeight()*0.9, MainApp.primary.getHeight()*0.9*4.79);
                SceneEnsamblaje.c1=Utiles.imagen("datos/aplicando-condiciones22", MainApp.primary.getHeight()*0.9, MainApp.primary.getHeight()*0.9*4.79);
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
