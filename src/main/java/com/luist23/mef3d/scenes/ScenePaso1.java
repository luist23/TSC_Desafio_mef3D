package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;

import java.util.ArrayList;

public class ScenePaso1 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso I";
        next=TypeScene.PASO2;
        preview=TypeScene.MODELO;
        fondo="background01";



        transiciones.add(4);

        String[] ecu1={"n1","H11","igual","H11","n1c","H17"};
        String[] ecu2={"n2","H11","igual","H11","n2c","H11"};
        String[] ecu3={"n3","H11","igual","H11","n3c","H11"};
        String[] ecu4={"n4","H11","igual","H11","n4c","H11"};



        //titulos
        String[] titu = {
                "Definimos las funciones de forma:"
        };
        llenar(titulos,titu);

        //subtitulos
        String[] sub =  {
                "Definimos N sub 1",
                "Definimos N sub 2",
                "Definimos N sub 3",
                "Definimos N sub 4"
        };
        llenarArray(subtitulos,sub);

        //ecuaciones
        ArrayList<ArrayList<String>> a=new ArrayList<>();
        llenarArray(a,ecu1);
        llenarArray(a,ecu2);
        llenarArray(a,ecu3);
        llenarArray(a,ecu4);
        ecuaciones.add(a);

    }
    public ScenePaso1(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }
}
