package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;

import java.util.ArrayList;

public class ScenePaso1 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso I";
        next=TypeScene.STAGE2;
        preview=TypeScene.STAGE2;
        fondo="background01";



        transiciones.add(0);
        transiciones.add(4);
        transiciones.add(0);
        transiciones.add(0);
        transiciones.add(4);
        transiciones.add(0);

        String[] ecu1={"n1","H11","igual","H11","n1c","H17"};
        String[] ecu2={"n2","H11","igual","H11","n2c","H11"};
        String[] ecu3={"n3","H11","igual","H11","n3c","H11"};
        String[] ecu4={"n4","H11","igual","H11","n4c","H11"};
        String[] ecuacion =  {
                "Definimos N sub 1",
                "Definimos N sub 2",
                "Definimos N sub 3",
                "Definimos N sub 4"
        };
        String[] titu = {
                "Definimos las funciones de forma:0",
                "Definimos las funciones de forma:1",
                "Definimos las funciones de forma: 2","Definimos las funciones de forma:0",
                "Definimos las funciones de forma:1",
                "Definimos las funciones de forma: 2"
        };

        //transiciones
        llenar(titulos,titu);
        llenarArray(subtitulos, new String[]{""});
        llenarArray(subtitulos,ecuacion);
        llenarArray(subtitulos, new String[]{""});
        llenarArray(subtitulos, new String[]{""});
        llenarArray(subtitulos,ecuacion);
        llenarArray(subtitulos, new String[]{""});

        ArrayList<ArrayList<String>> a=new ArrayList<>();
        llenarArray(a,ecu1);
        llenarArray(a,ecu2);
        llenarArray(a,ecu3);
        llenarArray(a,ecu4);

        //ArrayList<ArrayList<String>> b=new ArrayList<>();
        ecuaciones.add(a);
        ecuaciones.add(a);
        ecuaciones.add(a);
        ecuaciones.add(a);
        ecuaciones.add(a);
        ecuaciones.add(a);

    }
    public ScenePaso1(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }
}
