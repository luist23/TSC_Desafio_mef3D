package main.java.com.luist23.mef3d;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.factory.FactoryScene;
import main.java.com.luist23.mef3d.scenes.TypeScene;


public class MainApp extends Application {

    private static MainApp main;
    private static Stage primary;

    @Override

    public void start(Stage primaryStage) throws Exception {
        primary = primaryStage;
        main = this;
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
