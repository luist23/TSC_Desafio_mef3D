package com.luist23.mef3d.scenes.inicio;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.luist23.mef3d.MainApp;
import com.luist23.mef3d.scenes.numeracion.TypeScene;
import com.luist23.mef3d.utils.Utiles;

public class SceneDatos {


    //private Text titulo;
    //private Text subtitulo;
    private VBox content;
    private HBox h;

    private HBox presentacion;
    private Button nodos, tetraedros, condicion;

    private ScrollPane vista = new ScrollPane();

    private HBox naveacion;
    private HBox siguiente,anterior;

    private TypeScene next,preview;
    private Scene scene;
    //private ImageView instruccion = new ImageView();

    //private int flag = 0;

    public SceneDatos(Stage stage){
        stage.setTitle("Datos");
        next=TypeScene.PASO1;
        preview=TypeScene.MODELO;

        //botones---------------------------------
        siguiente= new HBox();
        anterior= new HBox();
        //siguiente.setPrefHeight(stage.getHeight()*0.2);
        //siguiente.setPrefWidth(stage.getHeight()*0.2*4);
        //anterior.setPrefHeight(stage.getHeight()*0.2);
        //anterior.setPrefWidth(stage.getHeight()*0.2*4);
        siguiente.setBackground(Utiles.background("navegacion/next",stage.getHeight()*0.2,stage.getHeight()*0.2*4));
        anterior.setBackground(Utiles.background("navegacion/preview",stage.getHeight()*0.2,stage.getHeight()*0.2*4));

        siguiente.setOnMouseClicked(e -> {
            MainApp.setSceneFactory(next);
        });
        anterior.setOnMouseClicked(e -> {
            MainApp.setSceneFactory(preview);
        });

        nodos = new Button("Nodos");
        tetraedros = new Button("Tetraedros");
        condicion = new Button("Condiciones");
        String style = "-fx-background-color: \n" +
                "        #000000,\n" +
                "        linear-gradient(#7ebcea, #2f4b8f),\n" +
                "        linear-gradient(#426ab7, #263e75),\n" +
                "        linear-gradient(#395cab, #223768);\n" +
                "    -fx-background-insets: 0,1,2,3;\n" +
                "    -fx-background-radius: 3,2,2,2;\n" +
                "    -fx-padding: 12 30 12 30;\n" +
                "    -fx-text-fill: white;";

        nodos.setStyle(style);
        tetraedros.setStyle(style);
        condicion.setStyle(style);

        nodos.setOnMouseClicked(e -> {
            vista.setVvalue(0.0);
            vista.setContent(Utiles.imagen("datos/nodos",stage.getWidth()*1.49*0.3,stage.getWidth()*0.3));
        });
        tetraedros.setOnMouseClicked(e -> {
            vista.setVvalue(0.0);
            vista.setContent(Utiles.imagen("datos/tetraedros",stage.getWidth()*2.72*0.3,stage.getWidth()*0.3));
        });
        condicion.setOnMouseClicked(e -> {
            vista.setVvalue(0.0);
            vista.setContent(Utiles.imagen("datos/Condiciones",stage.getWidth()*0.3*0.6,stage.getWidth()*0.3));
        });



        //iniciando contenedores-------------------
        h = new HBox(vista);
        h.setAlignment(Pos.CENTER);
        presentacion= new HBox(nodos,tetraedros,condicion);
        naveacion = new HBox(anterior,siguiente);
        content = new VBox(presentacion,h,naveacion);

        content.setAlignment(Pos.CENTER);
        scene =new Scene(content,stage.getWidth(),stage.getHeight());
        naveacion.setSpacing(30);
        naveacion.setAlignment(Pos.CENTER);
        presentacion.setSpacing(30);
        presentacion.setAlignment(Pos.CENTER);

        //------------------------------------------

        redimension(stage);
        stage.heightProperty().addListener((obs, oldVal, newVal) -> {
            redimension(stage);
        });

        content.setBackground(Utiles.background("background01",stage.getHeight(),stage.getWidth()));

        vista.setFitToWidth(true);
        vista.setStyle("-fx-background: transparent;\n -fx-background-color: transparent;\n -fx-aling-items: center; \n -fx-justify-content: center;");
        vista.setContent(Utiles.imagen("datos/nodos",stage.getWidth()*1.49*0.3,stage.getWidth()*0.3));


        //Utiles.animation( instruccion, "teclas",stage.getHeight()*0.2,stage.getHeight()*0.2*1.5);
        //presentacion.getChildren().addAll(imageView);

        //presentacion.setBackground(Utiles.background(images[flag],stage.getHeight()*0.6,presentacion.getPrefWidth()));
        //presentacion.getChildren().add(Utiles.imagen(images[flag], presentacion.getPrefHeight(),presentacion.getPrefWidth()));
        /*
        imageView.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
            //stage.close();
        });

         */

    }

    private void redimension(Stage stage){
        naveacion.setPrefHeight(stage.getHeight()*0.2);
        siguiente.setPrefHeight(stage.getHeight()*0.2);
        siguiente.setPrefWidth(stage.getHeight()*0.2*4);
        anterior.setPrefHeight(stage.getHeight()*0.2);
        anterior.setPrefWidth(stage.getHeight()*0.2*4);

        h.setPrefWidth(stage.getWidth());

        presentacion.setPrefHeight(stage.getHeight()*0.1);
        nodos.setPrefHeight(stage.getHeight()*0.05);
        nodos.setPrefWidth(stage.getHeight()*0.2);
        tetraedros.setPrefHeight(stage.getHeight()*0.05);
        tetraedros.setPrefWidth(stage.getHeight()*0.2);
        condicion.setPrefHeight(stage.getHeight()*0.05);
        condicion.setPrefWidth(stage.getHeight()*0.2);

        vista.setPrefHeight(stage.getHeight()*0.6);
        //vista.setPrefWidth(stage.getWidth());

        content.setPrefHeight(stage.getHeight());

    }

    public Scene getScene(){
        return scene;
    }
}
