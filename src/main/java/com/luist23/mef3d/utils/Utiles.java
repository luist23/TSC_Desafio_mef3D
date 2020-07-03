package main.java.com.luist23.mef3d.utils;

import javafx.animation.Animation;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public  class Utiles {
    //private static Utiles = new Utiles;

    public static ImageView imagen(String a, double height, double width){
        //System.out.println(a + " "+height+ " "+width);
        Image image = new Image(Utiles.class.getResourceAsStream("../assets/"+ a +".png"));
        ImageView view = new ImageView(image);
        view.setPreserveRatio(false);
        view.setFitHeight(height);
        view.setFitWidth(width);
        return view;
    }

    public static void animation(ImageView view, String a, double height, double width){
        //ImageView view = new ImageView();
        Image image = new Image(Utiles.class.getResource("../assets/"+a+".gif").toExternalForm());
        view.setImage(image);
        //view.setLayoutX(width);
        //view.setLayoutY(height);

        view.setPreserveRatio(true);
        view.setFitHeight(height);
        view.setFitWidth(width);
        //return view;
    }

    public static Background background(String a, double height ,double width){
        //System.out.println(a);
        BackgroundSize backgroundSize = new BackgroundSize(width,
                height,
                true,
                true,
                true,
                false);
        BackgroundImage image = new BackgroundImage(new Image(Utiles.class.getResourceAsStream("../assets/"+a+".png")),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize);

        return new Background(image);
    }

    public static Background background2(String a, double height ,double width){
        //System.out.println(a);
        BackgroundSize backgroundSize = new BackgroundSize(width,
                height,
                true,
                true,
                true,
                true);
        BackgroundImage image = new BackgroundImage(new Image(Utiles.class.getResourceAsStream("../assets/"+a+".png")),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize);

        return new Background(image);
    }

    public Utiles(){
    }
}
