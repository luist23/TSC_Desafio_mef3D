package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;

import java.util.ArrayList;

public class ScenePaso2 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso II";
        next=TypeScene.PASO3;
        preview=TypeScene.PASO1;
        fondo="background01";



        transiciones.add(4);
        transiciones.add(3);
        transiciones.add(2);

        String[] ecu1={"a","H11","noigual","H11","n1","H11","a1","H11","mas","H11","n2",
                "H11","a2","H11","mas","H11","n3","H11","a3","H11","mas","H11","n4","H11","a4","H11"};
        String[] ecu2={"b","H11","noigual","H11","n1","H11","b1","H11","mas","H11","n2",
                "H11","b2","H11","mas","H11","n3","H11","b3","H11","mas","H11","n4","H11","b4","H11"};
        String[] ecu3={"a","H11","igual","H11","ns","H18","as","H52"};
        String[] ecu4={"b","H11","igual","H11","ns","H18","bs","H52"};

        String[] ecu5={"mn","H11","igual","H11","ns","H17"};
        String[] ecu6={"ma","H11","igual","H11","as","H52"};
        String[] ecu7={"mb","H11","igual","H11","bs","H52"};

        String[] ecu8={"a","H11","igual","H11","mn","H11","ma","H11"};
        String[] ecu9={"b","H11","igual","H11","mn","H11","mb","H11"};


        String[] ecuacion =  {
                "Interpolamos las incognitas A de los 4 nodos con su funcion de forma",
                "Interpolamos las incognitas B de los 4 nodos con su funcion de forma",
                "A en forma matricial ",
                "B en forma matricial ",
        };

        String [] subtitulos2 ={
                "matriz N",
                "matriz A",
                "matriz B"
        };

        String [] subtitulos3 ={
                "por tanta A",
                "por tanto B"
        };

        String[] titu = {
                "Interpolación",
                "matrices",
                "Definimos A y B",
                "Definimos las funciones de forma: 2"
        };

        //transiciones
        llenar(titulos,titu);
        //llenarArray(subtitulos, new String[]{""});
        llenarArray(subtitulos,ecuacion);
        llenarArray(subtitulos,subtitulos2);
        llenarArray(subtitulos,subtitulos3);

        ArrayList<ArrayList<String>> a=new ArrayList<>();
        llenarArray(a,ecu1);
        llenarArray(a,ecu2);
        llenarArray(a,ecu3);
        llenarArray(a,ecu4);

        //ArrayList<ArrayList<String>> b=new ArrayList<>();
        ArrayList<ArrayList<String>> b=new ArrayList<>();
        llenarArray(b,ecu5);
        llenarArray(b,ecu6);
        llenarArray(b,ecu7);

        ArrayList<ArrayList<String>> c=new ArrayList<>();
        llenarArray(c,ecu8);
        llenarArray(c,ecu9);

        ecuaciones.add(a);
        ecuaciones.add(b);
        ecuaciones.add(c);

    }
    public ScenePaso2(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }
}
