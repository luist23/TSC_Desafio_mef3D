package main.java.com.luist23.mef3d.scenes.fin;

import javafx.beans.value.ChangeListener;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import main.java.com.luist23.mef3d.Main;
import main.java.com.luist23.mef3d.scenes.numeracion.TypeScene;
import main.java.com.luist23.mef3d.utils.Utiles;


public class SceneEnsamblaje {


    //private Text titulo;
    //private Text subtitulo;
    private VBox content;

    private HBox presentacion;
    private Button nodos, tetraedros, condicion, matriz;

    private ScrollPane vista = new ScrollPane();

    private HBox naveacion,h;
    private HBox anterior;
    private HBox miniatura;
    public static ImageView a,b,c;

    private TypeScene preview;
    private Scene scene;
    //private ImageView instruccion = new ImageView();

    //private int flag = 0;

    public SceneEnsamblaje(Stage stage){
        stage.setTitle("Ensamblaje");
        //next=TypeScene.PASO1;
        preview=TypeScene.MATRICES;


        //botones---------------------------------
        //siguiente= new HBox();
        anterior= new HBox();
        ImageView a,b,c;
        miniatura= new HBox();

        anterior.setBackground(Utiles.background("navegacion/preview",stage.getHeight()*0.2,stage.getHeight()*0.2*4));


        anterior.setOnMouseClicked(e -> {
            Main.setSceneFactory(preview);
        });

        nodos = new Button("Ensamblaje 1");
        tetraedros = new Button("Ensamblaje 2");
        condicion = new Button("Aplicando Condiciones");
        matriz = new Button("Matriz");
        String style = "-fx-background-color: \n" +
                "        #000000,\n" +
                "        linear-gradient(#7ebcea, #2f4b8f),\n" +
                "        linear-gradient(#426ab7, #263e75),\n" +
                "        linear-gradient(#395cab, #223768);\n" +
                "    -fx-background-insets: 0,1,2,3;\n" +
                "    -fx-background-radius: 3,2,2,2;\n" +
                "    -fx-text-fill: white;";

        nodos.setStyle(style);
        tetraedros.setStyle(style);
        condicion.setStyle(style);
        matriz.setStyle(style);
        Tooltip tooltip = new Tooltip();
        tooltip.setText("hola");

        matriz.setOnMouseClicked(e -> {
            vista.setVvalue(0.5);
            vista.setHvalue(0.5);
            vista.setContent(Utiles.imagen("datos/matricesfinalfinal",stage.getWidth()*0.1,stage.getWidth()*0.1*3.3));
            miniatura.getChildren().removeAll();
        });
        /*matriz.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
            tooltip.setText(
                    ""
            );
            tooltip.setGraphic(null);
            tooltip.setX(e.getScreenX()-tooltip.getWidth()*0.5);
            tooltip.setY(e.getScreenY()+25);
            tooltip.show(stage);
        });
        matriz.addEventFilter(MouseEvent.MOUSE_EXITED, e->{
            tooltip.hide();
        });*/


        nodos.setOnMouseClicked(e -> {

            //b.setFitHeight(25);
            //b.setFitWidth(50);
            //vista.setContent(Utiles.animation("datos/unnamed",50,50));
            vista.setContent(SceneEnsamblaje.a);
            miniatura.getChildren().removeAll();
            //miniatura.getChildren().add(Utiles.animation("datos/1emsamblajeUno",stage.getWidth()*0.2,stage.getWidth()*0.4));
            vista.setVvalue(0.5);
            vista.setHvalue(0.5);
        });
        nodos.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
            tooltip.setText("Trabajamos con el primer nodo:\n" +
                    "aplicamos ciertas caracteristicas correspondientes \n" +
                    "a las diferentes componentes de la forma que se detalla\n" +
                    "para luego ser pocicionadas en la matriz final");
            tooltip.setGraphic(Utiles.imagen("datos/finalEnsamblaje1",stage.getHeight()*0.4,stage.getHeight()*0.4*3));
            tooltip.setX(e.getScreenX()-tooltip.getWidth()*0.5);
            tooltip.setY(e.getScreenY()+25);
            tooltip.show(stage);
        });
        nodos.addEventFilter(MouseEvent.MOUSE_EXITED, e->{
            tooltip.hide();
        });

        tetraedros.setOnMouseClicked(e -> {
            vista.setContent(SceneEnsamblaje.b);
            miniatura.getChildren().removeAll();
            //miniatura.getChildren().add(Utiles.animation("datos/1emsamblajeDos",stage.getWidth()*0.2,stage.getWidth()*0.4));
            vista.setVvalue(0.5);
            vista.setHvalue(0.5);
        });
        tetraedros.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
            tooltip.setText("Trabajamos con el segundo nodo:\n" +
                    "igualmente aplicamos ciertas caracteristicas correspondientes \n" +
                    "a las diferentes componentes de la forma que se detalla\n" +
                    "para luego ser pocicionadas en la matriz final");
            tooltip.setGraphic(Utiles.imagen("datos/finalEnsamblaje2",stage.getHeight()*0.4,stage.getHeight()*0.4*3));
            tooltip.setX(e.getScreenX()-tooltip.getWidth()*0.5);
            tooltip.setY(e.getScreenY()+25);
            tooltip.show(stage);
        });
        tetraedros.addEventFilter(MouseEvent.MOUSE_EXITED, e->{
            tooltip.hide();
        });
        condicion.setOnMouseClicked(e -> {
            vista.setContent(SceneEnsamblaje.c);
            miniatura.getChildren().removeAll();
            //miniatura.getChildren().add(Utiles.animation("datos/1aplicando-condiciones",stage.getWidth()*0.2,stage.getWidth()*0.4));
            vista.setVvalue(0.5);
            vista.setHvalue(0.5);
        });
        condicion.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
            tooltip.setText("Trabajaremos con las condiciones dadas: \n\n" +
                    "Se rempazan las variables con las condiciones de Neuman:\n" +
                    "en el caso de las As seria en su respectiva posciocion de nodo.\n" +
                    "en cuanto a las Bs en la pocicion nodo + total de nodos.\n\n" +
                    " Se eliminan filas y columnas con las condiciones de Dirichlet:\n" +
                    " las respectivas a los nodos y nodos + total de nodos," +
                    "desplazando los valores de las columnas eliminadas a una nueva columna sumada");
            tooltip.setGraphic(Utiles.imagen("datos/condicionesfinal",stage.getHeight()*0.2,stage.getHeight()*0.3));
            tooltip.setX(e.getScreenX()-tooltip.getWidth()*0.5);
            //tooltip.setMaxWidth(stage.getHeight()*0.3);
            tooltip.setY(e.getScreenY()+25);
            tooltip.show(stage);
        });
        condicion.addEventFilter(MouseEvent.MOUSE_EXITED, e->{
            tooltip.hide();
        });
        tooltip.setTextAlignment(TextAlignment.CENTER);
        //tooltip.text




        //iniciando contenedores-------------------
        h= new HBox(vista);
        presentacion= new HBox(matriz,nodos,tetraedros,condicion);
        naveacion = new HBox(anterior,miniatura);
        content = new VBox(presentacion,h,naveacion);

        content.setAlignment(Pos.CENTER);
        h.setAlignment(Pos.CENTER);
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
        vista.setContent(Utiles.imagen("datos/matricesfinalfinal",stage.getWidth()*0.1,stage.getWidth()*0.1*3.3));


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
        //siguiente.setPrefHeight(stage.getHeight()*0.2);
        //siguiente.setPrefWidth(stage.getHeight()*0.2*4);
        anterior.setPrefHeight(stage.getHeight()*0.2);
        anterior.setPrefWidth(stage.getHeight()*0.2*4);

        presentacion.setPrefHeight(stage.getHeight()*0.1);
        nodos.setPrefHeight(stage.getHeight()*0.05);
        nodos.setPrefWidth(stage.getHeight()*0.2);
        tetraedros.setPrefHeight(stage.getHeight()*0.05);
        tetraedros.setPrefWidth(stage.getHeight()*0.2);
        condicion.setPrefHeight(stage.getHeight()*0.05);
        condicion.setPrefWidth(stage.getHeight()*0.2);
        matriz.setPrefHeight(stage.getHeight()*0.05);
        matriz.setPrefWidth(stage.getHeight()*0.2);


        vista.setPrefHeight(stage.getHeight()*0.6);
        //vista.setPrefWidth(stage.getWidth());
        h.setPrefWidth(stage.getWidth());

        content.setPrefHeight(stage.getHeight());

    }

    public Scene getScene(){
        return scene;
    }
}
