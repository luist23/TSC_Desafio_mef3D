package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;

import java.util.ArrayList;

public class ScenePaso3 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso III";
        next=TypeScene.STAGE2;
        preview=TypeScene.STAGE2;
        fondo="background01";





        //formulas primer cuadro
        transiciones.add(2);
        ArrayList<ArrayList<String>> a=new ArrayList<>();
        String[] ecu1= {
                "x", "h11", "gradiente", "h11", "parentesis1", "h11", "a", "h11", "parentesis2", "h11",//x*gradiente(A)
                "mas", "h11",//+
                "x", "h11", "y", "h11", "gradiente2", "h11", "parentesis1", "h11", "b", "h11", "parentesis2", "h11",//xy*gradiente^2(B)
                "igual", "h11",//=
                "igualdad1", "h14"//78.4
        };
        String[] ecu2= {
                "y", "h11", "gradiente2", "h11", "parentesis1", "h11", "a", "h11", "parentesis2", "h11",//y*gradiente^2(A)
                "mas", "h11",//+
                "x", "h11", "gradiente", "h11", "parentesis1", "h11", "b", "h11", "parentesis2", "h11",//x*gradiente(B)
                "igual", "h11",//=
                "igualdad2", "h14"//94.7
        };
        llenarArray(a,ecu1);
        llenarArray(a,ecu2);
        ecuaciones.add(a);

        //formulas sgundocuadro
        transiciones.add(2);
        a=new ArrayList<>();
        ecu1= new String[]{
                "x", "h11", "gradiente", "h11", "parentesis1", "h11", "mn", "h11", "ma", "h11","parentesis2", "h11",//x*gradiente(NA)
                "mas", "h11",//+
                "x", "h11", "y", "h11", "gradiente2", "h11", "parentesis1", "h11", "mn", "h11", "mb", "h11", "parentesis2", "h11",//xy*gradiente^2(NB)
                "igual", "h11",//=
                "igualdad1", "h14"//78.4
        };
        ecu2= new String[]{
                "y", "h11", "gradiente2", "h11", "parentesis1", "h11","mn", "h11", "ma", "h11","parentesis2", "h11",//y*gradiente^2(NA)
                "mas", "h11",//+
                "x", "h11", "gradiente", "h11", "parentesis1", "h11", "mn", "h11", "mb", "h11","parentesis2", "h11",//x*gradiente(NB)
                "igual", "h11",//=
                "igualdad2", "h14"//94.7
        };
        llenarArray(a,ecu1);
        llenarArray(a,ecu2);
        ecuaciones.add(a);

        //formulas tercer cuadro
        transiciones.add(2);
        a=new ArrayList<>();
        ecu1= new String[]{
                "cero","h11","igual", "h11",//0 =
                "menos", "h11",//-
                "x", "h11", "gradiente", "h11", "parentesis1", "h11", "mn", "h11", "ma", "h11","parentesis2", "h11",//x*gradiente(NA)
                "menos", "h11",//-
                "x", "h11", "y", "h11", "gradiente2", "h11", "parentesis1", "h11", "mn", "h11", "mb", "h11", "parentesis2", "h11",//xy*gradiente^2(NB)
                "mas", "h11",//+
                "igualdad1", "h14"//78.4
        };
        ecu2= new String[]{
                "cero","h11","igual", "h11",//0 =
                "menos", "h11",//-
                "y", "h11", "gradiente2", "h11", "parentesis1", "h11","mn", "h11", "ma", "h11","parentesis2", "h11",//y*gradiente^2(NA)
                "menos", "h11",//-
                "x", "h11", "gradiente", "h11", "parentesis1", "h11", "mn", "h11", "mb", "h11","parentesis2", "h11",//x*gradiente(NB)
                "mas", "h11",//+
                "igualdad2", "h14"//94.7
        };
        llenarArray(a,ecu1);
        llenarArray(a,ecu2);
        ecuaciones.add(a);

        String[] ecu0={"b","H11","noigual","H11","n1","H11","b1","H11","mas","H11","n2",
                "H11","b2","H11","mas","H11","n3","H11","b3","H11","mas","H11","n4","H11","b4","H11"};
        String[] ecu3={"a","H11","igual","H11","ns","H18","as","H52"};
        String[] ecu4={"b","H11","igual","H11","ns","H18","bs","H52"};

        transiciones.add(3);
        String[] ecu5={"mn","H11","igual","H11","ns","H17"};
        String[] ecu6={"ma","H11","igual","H11","as","H52"};
        String[] ecu7={"mb","H11","igual","H11","bs","H52"};

        transiciones.add(2);
        String[] ecu8={"a","H11","igual","H11","mn","H11","ma","H11"};
        String[] ecu9={"b","H11","igual","H11","mn","H11","mb","H11"};


        String[] subtitulos1 =  {
                "Interpolamos las incognitas A de los 4 nodos con su funcion de forma",
                "Interpolamos las incognitas B de los 4 nodos con su funcion de forma",
                "A en forma matricial ",
                "B en forma matricial ",
        };
        llenarArray(subtitulos,subtitulos1);

        subtitulos1 = new String []{
                "matriz N",
                "matriz A",
                "matriz B"
        };
        llenarArray(subtitulos,subtitulos1);

        subtitulos1 = new String []{
                "por tanta A",
                "por tanto B"
        };
        llenarArray(subtitulos,subtitulos1);

        String[] titu = {
                "Interpolación",
                "matrices",
                "Definimos A y B",
                "Definimos las funciones de forma: 2"
        };

        //transiciones
        llenar(titulos,titu);
        //llenarArray(subtitulos, new String[]{""});



        //ArrayList<ArrayList<String>> b=new ArrayList<>();
        ArrayList<ArrayList<String>> b=new ArrayList<>();
        llenarArray(b,ecu5);
        llenarArray(b,ecu6);
        llenarArray(b,ecu7);

        ArrayList<ArrayList<String>> c=new ArrayList<>();
        llenarArray(c,ecu8);
        llenarArray(c,ecu9);


        ecuaciones.add(b);
        ecuaciones.add(c);

    }
    public ScenePaso3(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }
}
