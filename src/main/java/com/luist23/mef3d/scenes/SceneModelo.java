package main.java.com.luist23.mef3d.scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.MainApp;
import main.java.com.luist23.mef3d.utils.Utiles;

public class SceneModelo {
    private HBox presentacion;
    private HBox naveacion;
    private Text titulo;
    private Text subtitulo;
    private VBox content;
    private Button siguiente,anterior;
    private TypeScene next,preview;
    private Scene scene;
    private final String[] images= {
            "Modelo_01","Modelo_02","Modelo_03","Modelo_04","Modelo_05"
    };
    private final String[] titulos= {
            "Figura",
            "Geometria",
            "Malla","Nodos","Tetraedros"
    };
    private int flag = 0;

    public SceneModelo(Stage stage){
        stage.setTitle("Modelo");
        next=TypeScene.STAGE2;
        preview=TypeScene.STAGE2;

        //botones---------------------------------
        siguiente = new Button("Continuar");
        anterior = new Button("Retroceder");
        siguiente.setOnAction(e -> {
            MainApp.setSceneFactory(next);
        });
        anterior.setOnAction(e -> {
            MainApp.setSceneFactory(preview);
        });

        //-----------------------------------------
        //Mensaje ---------------------------------
        titulo= new Text();
        subtitulo= new Text();
        titulo.setTextAlignment(TextAlignment.CENTER);
        titulo.setFill(Color.BLUE);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 18));
        subtitulo.setTextAlignment(TextAlignment.CENTER);
        subtitulo.setFill(Color.RED);
        subtitulo.setFont(Font.font(null, FontWeight.BOLD, 30));
        titulo.setText("Primeramente nos familisialermos con nuestro modelo: \n" +
                "Utilizaremos un cubo rectanular con un ancho de 1, largo de 3 y alto de 1");
        subtitulo.setText(titulos[flag]);

        //-----------------------------------------
        //iniciando contenedores-------------------
        presentacion= new HBox();
        naveacion = new HBox(anterior,siguiente);
        content = new VBox(titulo,subtitulo,presentacion,naveacion);
        content.setAlignment(Pos.CENTER);
        scene =new Scene(content,stage.getWidth(),stage.getHeight());
        naveacion.setSpacing(stage.getWidth()/2);
        naveacion.setAlignment(Pos.CENTER);
        //------------------------------------------

        redimension(stage);
        stage.heightProperty().addListener((obs, oldVal, newVal) -> {
            redimension(stage);
        });

        content.setBackground(Utiles.background("background01",stage.getHeight(),stage.getWidth()));
        //presentacion.setAlignment(Pos.CENTER);
        //presentacion.setMaxHeight(stage.getHeight()*0.8);
        //text.maxHeight(stage.getHeight()*0.1);
        //naveacion.setMaxHeight(stage.getHeight()*0.1);
        //hBox.setPrefHeight(content.getHeight()*0.9);
        //naveacion.setPrefHeight(stage.getHeight()*0.1);

        ImageView imageView = Utiles.animation("a",stage.getHeight()*0.2,stage.getWidth()*0.2);
        presentacion.getChildren().addAll(imageView);

        presentacion.setBackground(Utiles.background(images[flag],scene.getHeight()*0.1,scene.getWidth()*0.1));


        imageView.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
            //stage.close();
        });

        scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> {

            switch (e.getCode()){
                case LEFT:
                    flag--;
                    if(flag<0){
                        flag=images.length-1;
                    }
                    //camera.setScaleX(camera.getScaleX()-5);
                    //camera.setRotate(camera.getRotate()-5);
                    //camera.setTranslateX((camera.getScaleX() - (1/50)));
                    break;
                case RIGHT:
                    flag++;
                    if(flag > (images.length-1)){
                        flag=0;
                    }
                    //camera.setScaleX(camera.getScaleX()+5);

                    //camera.setRotate(camera.getRotate()+5);
                    //camera.setTranslateX((camera.getScaleX() + 50));
                    break;
                case UP:
                    //camera.setTranslateY((camera.getScaleY() + 50));
                    break;
                case DOWN:
                    //camera.setTranslateY((camera.getScaleY() - 50));
                    break;


            }
            subtitulo.setText(titulos[flag]);
            presentacion.setBackground(Utiles.background(images[flag],presentacion.getHeight(),presentacion.getWidth()));

        });
    }

    private void redimension(Stage stage){
        content.setPrefHeight(stage.getHeight());
        titulo.prefHeight(stage.getHeight()*0.1);
        subtitulo.prefHeight(stage.getHeight()*0.1);
        presentacion.setPrefHeight(stage.getHeight()*0.7);
        naveacion.setPrefHeight(stage.getHeight()*0.1);
    }

    public Scene getScene(){
        return scene;
    }
}
