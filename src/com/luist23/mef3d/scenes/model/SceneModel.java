package com.luist23.mef3d.scenes.model;

import javafx.application.Platform;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
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
import com.luist23.mef3d.MainApp;
import com.luist23.mef3d.scenes.numeracion.TypeScene;
import com.luist23.mef3d.Utiles;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class SceneModel {
    //public static ScrollPane forHilo;
    private  Stage stageOwner;
    private ScrollPane presentacion = new ScrollPane();
    private HBox naveacion;
    private Text titulo;
    private Text subtitulo;
    private VBox content;
    private HBox siguiente,anterior;
    protected TypeScene next,preview;
    private Scene scene;
    private ImageView instruccion = new ImageView();



    private VBox subpila= new VBox();
    private ArrayList<VBox> pila=new ArrayList<>();
    protected String tituloVentana;
    protected  String[] titulos;
    protected  ArrayList<String[]> subtitulos = new ArrayList<>();
    protected  ArrayList<Integer> transiciones = new ArrayList<>();
    protected ArrayList<ArrayList<ArrayList<String>>> formulasC= new ArrayList<>();
    protected ArrayList<ArrayList<ArrayList<String>>> dimensionesC= new ArrayList<>();
    protected ArrayList<ArrayList<ArrayList<String>>> descripcionC= new ArrayList<>();
    protected String fondo;
    private int flagTrancision = 0;
    private int flagTransicionAux = 0;



    protected void llenar(ArrayList<String> list, String[] e){
        for (int i = 0 ; i < e.length ;i++){
            list.add(e[i]);
        }
    }

    public SceneModel(){

    }

    protected void lanzar(Stage stage){
        //inicializar();
        stageOwner = stage;
        stage.setTitle(tituloVentana);
        fondo="navegacion/pizarra2";

        //botones---------------------------------
        siguiente= new HBox();
        anterior= new HBox();
        siguiente.setPrefHeight(stage.getHeight()*0.2);
        siguiente.setPrefWidth(stage.getHeight()*0.2*4);
        anterior.setPrefHeight(stage.getHeight()*0.2);
        anterior.setPrefWidth(stage.getHeight()*0.2*4);
        siguiente.setBackground(Utiles.background("navegacion/next",stage.getHeight()*0.2,stage.getHeight()*0.2*4));
        anterior.setBackground(Utiles.background("navegacion/preview",stage.getHeight()*0.2,stage.getHeight()*0.2*4));


        ImageView exit = Utiles.animation("datos/unnamed",50,50);

        SimpleBooleanProperty as=new SimpleBooleanProperty(true);
        as.addListener((observable , an, newv)->{
            MainApp.setSceneFactory(next);
        });


        siguiente.setOnMouseClicked(e -> {
            MainApp.setSceneFactory(next);
        });
        anterior.setOnMouseClicked(e -> {
            MainApp.setSceneFactory(preview);
        });

        //-----------------------------------------
        //Mensaje ---------------------------------
        titulo= new Text();
        subtitulo= new Text();
        titulo.setTextAlignment(TextAlignment.CENTER);
        titulo.setFill(Color.RED);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 18));
        subtitulo.setTextAlignment(TextAlignment.CENTER);
        subtitulo.setFill(Color.BLUE);
        subtitulo.setFont(Font.font(null, FontWeight.BOLD, 14));



        naveacion = new HBox(anterior,instruccion,siguiente);
        content = new VBox(titulo,subtitulo,presentacion,naveacion);
        content.setAlignment(Pos.CENTER);
        content.setFillWidth(true);
        scene =new Scene(content,stage.getWidth(),stage.getHeight());
        naveacion.setSpacing(15);
        naveacion.setAlignment(Pos.CENTER);

        titulo.setText(stage.getTitle());

        subpila.setAlignment(Pos.CENTER);


        presentacion.setFitToWidth(true);
        presentacion.setStyle("-fx-background: transparent;\n -fx-background-color: transparent");
        presentacion.setContent(subpila);


        presentacion.viewportBoundsProperty().addListener(
                (observable, oldValue, newValue) -> {
                    //titledPane.layout();
                    Platform.runLater(
                            () -> {
                                presentacion.setVvalue(1.0);
                            }
                    );

                }
        );



        //presentacion.heightProperty()

        pila.add(subpila);
        //presentacion.pre
        //presentacion.getContent().add(subpila);
        subpila.setSpacing(10);
        //------------------------------------------
        Utiles.animation( instruccion, "teclas",stage.getHeight()*0.2,stage.getHeight()*0.2*1.5);
        redimension(stage);
        stage.heightProperty().addListener((obs, oldVal, newVal) -> {
            redimension(stage);
        });
        content.setBackground(Utiles.background(fondo,stage.getHeight(),stage.getWidth()));



        scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> {

            switch (e.getCode()) {
                case LEFT:
                    regresar();
                    break;
                case RIGHT:
                    comenzar();
                    //System.out.println(presentacion.vvalueProperty());
                    //System.out.println(presentacion.vvalueProperty());
                    break;
                //break;
            }

        });
    }

    protected void regresar(){
        //System.out.println("presentacion: "+presentacion.getChildren());
        if(flagTrancision>=transiciones.size()){
            //System.out.println(flagTrancision);
            //pila.remove(flagTrancision);
            flagTrancision=transiciones.size()-1;
            flagTransicionAux = transiciones.get(flagTrancision);
            subpila=pila.get(flagTrancision);
            //System.out.println(flagTrancision);
            //System.out.println(pila);
        }
        if(flagTransicionAux!=0 || flagTrancision!=0){
        if(flagTrancision >= 0) {
            //System.out.println(transiciones.get(flagTrancision));
            if (transiciones.get(flagTrancision) == 0) {

                if (flagTrancision > 0) {
                    subtitulo.setText(subtitulos.get(flagTrancision)[0]);
                    pila.remove(flagTrancision);
                    flagTrancision--;
                    flagTransicionAux = transiciones.get(flagTrancision);
                }


                subpila = pila.get(flagTrancision);
                presentacion.setContent(subpila);
                //presentacion.getChildren().add(subpila);
                titulo.setText(titulos[flagTrancision]);


                //titulo.setText(titulos.get(flagTitulo));
                //flagTitulo--;

            } else {
                if (flagTransicionAux <= transiciones.get(flagTrancision) && flagTransicionAux != 0) {

                    flagTransicionAux--;
                    subtitulo.setText(subtitulos.get(flagTrancision)[flagTransicionAux]);
                    subpila.getChildren().remove(flagTransicionAux);


                    if (flagTransicionAux == 0 && flagTrancision != 0) {
                        if (flagTrancision > 0) {
                            pila.remove(flagTrancision);
                            flagTrancision--;
                            flagTransicionAux = transiciones.get(flagTrancision);
                            subpila = pila.get(flagTrancision);
                            presentacion.setContent(subpila);
                            regresar();
                        }

                    }

                }


            }
        }
        }
    }

    protected void comenzar(){
        //System.out.println(pila);
        //System.out.println(pila.toString());

        if(flagTrancision<transiciones.size()){
            if(transiciones.get(flagTrancision)==0){
                titulo.setText(titulos[flagTrancision]);
                subtitulo.setText(subtitulos.get(flagTrancision)[0]);
                //pila.add(subpila);
                //presentacion.getChildren().remove(subpila);
                subpila = new VBox();
                subpila.setSpacing(10);
                pila.add(subpila);
                presentacion.setContent(subpila);
                //flagTitulo++;
                flagTrancision++;
            }else {
                titulo.setText(titulos[flagTrancision]);
                if (flagTransicionAux < transiciones.get(flagTrancision)) {
                    HBox ecu= new HBox();
                    ecu.setAlignment(Pos.CENTER);
                    ecu.autosize();
                    ecu.setSpacing(3);
                    subtitulo.setText(subtitulos.get(flagTrancision)[flagTransicionAux]);
                    llenarEcuacion(ecu,formulasC.get(flagTrancision).get(flagTransicionAux),
                            dimensionesC.get(flagTrancision).get(flagTransicionAux),
                            descripcionC.get(flagTrancision).get(flagTransicionAux));
                    subpila.getChildren().add(ecu);

                    flagTransicionAux++;

                }else
                if(flagTransicionAux == transiciones.get(flagTrancision)){

                    flagTrancision++;
                    if(transiciones.size()>flagTrancision){
                        //presentacion.getChildren().remove(subpila);
                        subpila = new VBox();
                        subpila.setSpacing(10);
                        pila.add(subpila);
                        presentacion.setContent(subpila);
                    }
                    flagTransicionAux=0;
                    comenzar();
                }

            }

        }
    }

    private void llenarEcuacion(HBox ecu,ArrayList<String> formula,ArrayList<String> dimension,ArrayList<String> evento){
        ImageView imagen;
        for (int i = 0; i < formula.size(); i++) {
            imagen = Utiles.imagen(formula.get(i),30 * Integer.parseInt(String.valueOf(dimension.get(i).charAt(0)))
                    ,30 * Integer.parseInt(String.valueOf(dimension.get(i).charAt(1))));

            if(evento.get(i)!="0"){
                int alto = Integer.parseInt(String.valueOf(evento.get(i).charAt(0)));
                //evento[i].charAt(0)="";
                int ancho = Integer.parseInt(String.valueOf(evento.get(i).charAt(1)));
                //System.out.println("evento: "+evento.get(i));
                Tooltip tooltip = new Tooltip();
                //tooltip.set

                //ecu.getChildren().add(tooltip);
                tooltip.setGraphic(Utiles.imagen(evento.get(i).substring(2),50*alto,75*ancho));//tooltip.setX(Mou);
                /*imagen.setOnMouseEntered(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        tooltip.setX(event.getScreenX());
                        tooltip.setY(event.getScreenY());
                        tooltip.show(stageOwner);
                    }
                });*/
                DropShadow ds1 = new DropShadow();
                ds1.setOffsetY(4.0f);
                ds1.setOffsetX(4.0f);
                ds1.setColor(Color.YELLOW);
                imagen.setEffect(ds1);
                /*imagen.hoverProperty().addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
                    if (newValue) {

                        tooltip.show(stageOwner);
                    } else {
                        tooltip.hide();
                    }
                });
                 */

                imagen.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
                    //System.out.println("mouse");
                    tooltip.setX(e.getScreenX()-tooltip.getWidth()*0.5);
                    tooltip.setY(e.getScreenY()-tooltip.getHeight()*0.5);
                    tooltip.show(stageOwner);
                    //tooltip.setOnAutoHide((EventHandler<MouseEvent>) event -> tooltip.hide());
                });
                //tooltip.addEventFilter(MouseEvent.);
                    //tooltip.setHideOnEscape(true);
                tooltip.addEventFilter(MouseEvent.MOUSE_CLICKED, e->{
                    //System.out.println("unmouse");
                    tooltip.hide();
                });

            };

            ecu.getChildren().add(imagen);
        }
    }

    private void redimension(Stage stage){
        naveacion.setPrefHeight(stage.getHeight()*0.2);
        siguiente.setPrefHeight(stage.getHeight()*0.2);
        siguiente.setPrefWidth(stage.getHeight()*0.2*4);
        anterior.setPrefHeight(stage.getHeight()*0.2);
        anterior.setPrefWidth(stage.getHeight()*0.2*4);
        instruccion.setFitWidth(stage.getWidth()*0.2);
        instruccion.setFitHeight(stage.getHeight()*0.2*1.5);

        content.setPrefHeight(stage.getHeight());
        titulo.prefHeight(stage.getHeight()*0.1);
        subtitulo.prefHeight(stage.getHeight()*0.1);
        presentacion.setPrefHeight(stage.getHeight()*0.6);

    }

    public Scene getScene(){
        return scene;
    }
}

