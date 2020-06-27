package main.java.com.luist23.mef3d.utils;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public  class Utiles {
    //private static Utiles = new Utiles;

    public static ImageView imagen(String a, double height){
        Image image = new Image(Utiles.class.getResourceAsStream("../assets/sample001.png"));
        ImageView view = new ImageView(image);
        view.setPreserveRatio(true);
        view.setFitHeight(height);
        return view;
    }

    public static Background background(String a, double height ,double width){
        BackgroundSize backgroundSize = new BackgroundSize(width,
                height,
                true,
                true,
                true,
                false);
        BackgroundImage image = new BackgroundImage(new Image(Utiles.class.getResourceAsStream("../assets/background01.jpg")),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize);

        return new Background(image);
    }
    public Utiles(){
    }
}
