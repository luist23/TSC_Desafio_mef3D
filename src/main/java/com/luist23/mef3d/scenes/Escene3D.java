package main.java.com.luist23.mef3d.scenes;

import javafx.scene.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class Escene3D {
    private Box box;
    private Scene scene;

    public Escene3D(Stage stage){
        // crear un cubo 3D, anchura, altura y profundidad
        box = new Box(100, 100, 300);

        // crear una luz puntual
        PointLight light = new PointLight();
        light.setTranslateX(-350);
        light.setTranslateY(-180);
        light.setTranslateZ(-500);

        Group root = new Group(box, light);

        // crear la escena, true para activar el buffer de profindidad
        scene = new Scene(root, 580, 408, true, SceneAntialiasing.BALANCED);

        // crear una camara en perspectiva
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setTranslateX(scene.getWidth() / -2.0);
        camera.setTranslateY((scene.getHeight() / -2.0) - 150);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> {
            System.out.println( e);
            switch (e.getCode()){
                case LEFT:
                    camera.setScaleX(camera.getScaleX()-5);
                    //camera.setRotate(camera.getRotate()-5);
                    //camera.setTranslateX((camera.getScaleX() - (1/50)));
                    return;
                case RIGHT:
                    camera.setScaleX(camera.getScaleX()+5);
                    
                    //camera.setRotate(camera.getRotate()+5);
                    //camera.setTranslateX((camera.getScaleX() + 50));
                    return;
                case UP:
                    camera.setTranslateY((camera.getScaleY() + 50));
                    return;
                case DOWN:
                    camera.setTranslateY((camera.getScaleY() - 50));
                    return;


            }

        });

        scene.setCamera(camera);
    }

    public Scene getScene(){
        return scene;
    }
}
