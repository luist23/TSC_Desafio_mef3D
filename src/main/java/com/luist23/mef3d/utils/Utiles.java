package main.java.com.luist23.mef3d.utils;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public  class Utiles {
    //private static Utiles = new Utiles;

    public static ImageView imagen(String a){
        Image image = new Image(Utiles.class.getResourceAsStream("../assets/sample001.png"));
        return new ImageView(image);
    }
    public Utiles(){
    }
}
