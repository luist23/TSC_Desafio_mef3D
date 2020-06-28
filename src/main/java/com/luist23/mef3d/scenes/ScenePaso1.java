package main.java.com.luist23.mef3d.scenes;

import com.sun.xml.internal.fastinfoset.util.CharArray;
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

import java.util.ArrayList;

public class ScenePaso1 {
    private HBox presentacion;
    private HBox naveacion;
    private Text titulo;
    private Text subtitulo;
    private VBox content;
    private Button siguiente,anterior;
    private TypeScene next,preview;
    private Scene scene;
    private ImageView instruccion = new ImageView();
    private final String[] images= {
            "00","01","02","03","04"//"Modelo_01","Modelo_02","Modelo_03","Modelo_04","Modelo_05"
    };

    private int flag = 0;
    private VBox subpila= new VBox();
    private ArrayList<VBox> pila=new ArrayList<>();
    protected String tituloVentana;
    protected  ArrayList<String> titulos = new ArrayList<>();
    protected  ArrayList<String> subtitulos = new ArrayList<>();
    protected  ArrayList<Integer> transiciones = new ArrayList<>();
    protected ArrayList<ArrayList<String>> ecuaciones= new ArrayList<>();
    protected String fondo;
    private int flagTrancision = 0;
    private int flagTransicionAux = 0;
    private int flagTitulo=0;

    public void inicializar(){
        tituloVentana = "Paso I";
        next=TypeScene.STAGE2;
        preview=TypeScene.STAGE2;
        fondo="background01";

        /*
        ecuaciones = new ArrayList<>();
        titulos = new ArrayList<>();
        muestra = new ArrayList<>();
        */

        transiciones.add(0);
        transiciones.add(4);
        transiciones.add(0);

        String[] ecu1={"n1","H11","igual","H11","n1c","H17"};
        String[] ecu2={"n2","H11","igual","H11","n2c","H11"};
        String[] ecu3={"n3","H11","igual","H11","n3c","H11"};
        String[] ecu4={"n4","H11","igual","H11","n4c","H11"};
        String[] ecuacion =  {
                "",
            "Definimos N sub 1",
            "Definimos N sub 2",
            "Definimos N sub 3",
            "Definimos N sub 4",
                ""
        };
        String[] titu = {

                "Definimos las funciones de forma:0",
                "Definimos las funciones de forma:1",
                "Definimos las funciones de forma: 2"

        };
        llenar(titulos,titu);
        llenar(subtitulos,ecuacion);
        llenarArray(ecuaciones,ecu1);
        llenarArray(ecuaciones,ecu2);
        llenarArray(ecuaciones,ecu3);
        llenarArray(ecuaciones,ecu4);

    }
    public void llenarArray(ArrayList<ArrayList<String>> a, String[] e){
        ArrayList<String> list= new ArrayList<>();
        llenar(list,e);
        a.add(list);
    }
    public void llenar(ArrayList<String> list, String[] e){
        for (int i = 0 ; i < e.length ;i++){
            list.add(e[i]);
        }
    }

    public ScenePaso1(Stage stage){
        inicializar();
        stage.setTitle(tituloVentana);

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
        titulo.setFill(Color.RED);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 23));
        subtitulo.setTextAlignment(TextAlignment.CENTER);
        subtitulo.setFill(Color.BLUE);
        subtitulo.setFont(Font.font(null, FontWeight.BOLD, 18));




        //-----------------------------------------
        //iniciando contenedores-------------------
        //instruccion = Utiles.animation("teclas",stage.getHeight()*0.1,stage.getWidth()*0.1);
        presentacion= new HBox();
        presentacion.setAlignment(Pos.CENTER);
        //presentacion.setFillWidth(true);
        naveacion = new HBox(anterior,instruccion,siguiente);
        content = new VBox(titulo,subtitulo,presentacion,naveacion);
        content.setAlignment(Pos.CENTER);
        content.setFillWidth(true);
        scene =new Scene(content,stage.getWidth(),stage.getHeight());
        naveacion.setSpacing(stage.getWidth()/4);
        naveacion.setAlignment(Pos.CENTER);
        pila.add(subpila);
        presentacion.getChildren().add(subpila);
        //------------------------------------------
        Utiles.animation( instruccion, "teclas",stage.getHeight()*0.2,stage.getWidth()*0.2);
        redimension(stage);
        stage.heightProperty().addListener((obs, oldVal, newVal) -> {
            redimension(stage);
        });
        content.setBackground(Utiles.background(fondo,stage.getHeight(),stage.getWidth()));




        //subtitulo.setText(titulos.get(flag));


        //presentacion.setAlignment(Pos.CENTER);
        //presentacion.setMaxHeight(stage.getHeight()*0.8);
        //text.maxHeight(stage.getHeight()*0.1);
        //naveacion.setMaxHeight(stage.getHeight()*0.1);
        //hBox.setPrefHeight(content.getHeight()*0.9);
        //naveacion.setPrefHeight(stage.getHeight()*0.1);


        //presentacion.getChildren().addAll(imageView);

        //presentacion.setBackground(Utiles.background(images[flag],scene.getHeight()*0.1,scene.getWidth()*0.1));


        instruccion.addEventFilter(MouseEvent.MOUSE_ENTERED, e->{
            //stage.close();
        });

        scene.addEventFilter(KeyEvent.KEY_PRESSED, e -> {

            switch (e.getCode()){
                case LEFT:
                    regresar();
                    flag--;
                    if(flag<0){
                        flag=images.length-1;
                    }
                    //camera.setScaleX(camera.getScaleX()-5);
                    //camera.setRotate(camera.getRotate()-5);
                    //camera.setTranslateX((camera.getScaleX() - (1/50)));
                    break;
                case RIGHT:
                    comenzar();
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
            //subtitulo.setText(titulos.get(flag));
            //presentacion.setBackground(Utiles.background(images[flag],presentacion.getHeight(),presentacion.getWidth()));

        });
    }

    protected void regresar(){
        System.out.println("presentacion: "+presentacion.getChildren());
        if(flagTrancision>=transiciones.size()){
            //System.out.println(flagTrancision);
            pila.remove(flagTrancision);
            flagTrancision=transiciones.size()-1;
            flagTransicionAux = transiciones.get(flagTrancision);
            subpila=pila.get(flagTrancision);
            //System.out.println(flagTrancision);
            System.out.println(pila);
        }
        if(flagTransicionAux!=0 || flagTrancision!=0){
        if(flagTrancision >= 0) {
            //System.out.println(transiciones.get(flagTrancision));
            if (transiciones.get(flagTrancision) == 0) {

                if (flagTrancision > 0) {

                    presentacion.getChildren().remove(pila.remove(flagTrancision));
                    flagTrancision--;
                    flagTitulo--;
                    flagTransicionAux = transiciones.get(flagTrancision);
                }

                subpila = pila.get(flagTrancision);
                presentacion.getChildren().add(subpila);

                titulo.setText(titulos.get(flagTrancision));
                subtitulo.setText(subtitulos.get(flagTitulo));
                

            } else {
                if (flagTransicionAux <= transiciones.get(flagTrancision) && flagTransicionAux != 0) {
                    //
                    //
                    flagTransicionAux--;
                    flagTitulo--;
                    subpila.getChildren().remove(flagTransicionAux);
                    //presentacion.getChildren().get(ecu).getC;
                    subtitulo.setText(subtitulos.get(flagTitulo));

                    if (flagTransicionAux == 0 && flagTrancision != 0) {
                        if (flagTrancision > 0) {

                            presentacion.getChildren().remove(pila.remove(flagTrancision));
                            flagTrancision--;
                            flagTransicionAux = transiciones.get(flagTrancision);
                            subpila = pila.get(flagTrancision);
                            presentacion.getChildren().add(subpila);
                        }

                    }

                }
                /*else {
                    presentacion.getChildren().remove(pila.remove(flagTrancision));
                    flagTrancision--;
                    subpila=pila.get(flagTrancision);
                    presentacion.getChildren().add(subpila);
                    titulo.setText(titulos.get(flagTrancision));
                    flagTransicionAux = transiciones.get(flagTrancision)-1;


                    //flagTransicionAux=0;
                }*/
            }
        }
        }
    }

    protected void comenzar(){
        //System.out.println(pila);
        //System.out.println(pila.toString());

        if(flagTrancision<transiciones.size()){
            if(transiciones.get(flagTrancision)==0){
                titulo.setText(titulos.get(flagTrancision));
                subtitulo.setText(subtitulos.get(flagTitulo));
                //pila.add(subpila);
                presentacion.getChildren().remove(subpila);
                subpila = new VBox();
                pila.add(subpila);
                presentacion.getChildren().add(subpila);
                //flagTitulo++;
                flagTrancision++;
                flagTitulo++;
            }else {

                if (flagTransicionAux < transiciones.get(flagTrancision)) {
                    HBox ecu= new HBox();
                    titulo.setText(titulos.get(flagTrancision));
                    subtitulo.setText(subtitulos.get(flagTitulo));

                    llenarEcuacion(ecu,ecuaciones.get(flagTransicionAux));
                    subpila.getChildren().add(ecu);
                    ecu.setAlignment(Pos.CENTER);
                    ecu.autosize();
                    flagTransicionAux++;
                    flagTitulo++;

                }else
                if(flagTransicionAux == transiciones.get(flagTrancision)){
                    //titulo.setText(titulos.get(flagTrancision+1));
                    //subtitulo.setText(subtitulos.get(flagTitulo));
                    presentacion.getChildren().remove(subpila);
                    subpila = new VBox();
                    pila.add(subpila);
                    presentacion.getChildren().add(subpila);
                    //flagTitulo++;
                    flagTrancision++;
                    comenzar();
                }
                /*else {
                    //titulo.setText(titulos.get(flagTrancision));
                    subpila = new VBox();
                    pila.add(subpila);
                    presentacion.getChildren().add(subpila);
                    flagTrancision++;
                    flagTransicionAux=0;
                }*/
            }

        }
    }

    private void llenarEcuacion(HBox ecu,ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
            char[] a = list.get(i+1).toCharArray();
            //System.out.println(a);
            ecu.getChildren().add(Utiles.imagen(list.get(i),30 * Integer.parseInt(String.valueOf(a[1]))
                    ,30 * Integer.parseInt(String.valueOf(a[2]))  ));
            i++;
        }
    }

    private void redimension(Stage stage){
        instruccion.setFitWidth(stage.getWidth()*0.1);
        instruccion.setFitHeight(stage.getHeight()*0.1);
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

