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

        ArrayList<String[]> formulas = new ArrayList<>();
        ArrayList<String[]> dimensiones = new ArrayList<>();
        ArrayList<String[]> descripcion = new ArrayList<>();





        //Transicion 01 ------------------------------------------------------------------------------------------------
        transiciones.add(4);
        //Ecuacion 01*********************************
        formulas.add(new String[]{
                "a","noigual","n1","a1","mas","n2",
                "a2","mas","n3","a3","mas","n4","a4"
        });
        dimensiones.add(new String[]{
                "11","11","11","11","11","11",
                "11","11","11","11","11","11","11"
        });
        descripcion.add(new String[]{
                "0","0","0","0","0","0",
                "0","0","0","0","0","0","0"
        });
        //*********************************************
        //Ecuacion 02**********************************
        formulas.add(new String[]{
                "b","noigual","n1","b1","mas","n2",
                "b2","mas","n3","b3","mas","n4","b4"
        });
        dimensiones.add(new String[]{
                "11","11","11","11","11","11",
                "11","11","11","11","11","11","11"
        });
        descripcion.add(new String[]{
                "0","0","0","0","0","0",
                "0","0","0","0","0","0","0"
        });
        //*********************************************
        //Ecuacion 03**********************************
        formulas.add(new String[]{
                "a","igual","ns","as"
        });
        dimensiones.add(new String[]{
                "11","11","18","52"
        });
        descripcion.add(new String[]{
                "0","0","0","0"
        });
        //*********************************************
        //Ecuacion 04**********************************
        formulas.add(new String[]{
                "b","igual","ns","bs"
        });
        dimensiones.add(new String[]{
                "11","11","18","52"
        });
        descripcion.add(new String[]{
                "0","0","0","0"
        });
        //*********************************************
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------











        //Transicion 02 ------------------------------------------------------------------------------------------------
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(3);
        //Ecuacion 01*********************************
        formulas.add(new String[]{
                "mn","igual","ns"
        });
        dimensiones.add(new String[]{
                "11","11","17"
        });
        descripcion.add(new String[]{
                "0","0","0"
        });
        //*********************************************
        //Ecuacion 02**********************************
        formulas.add(new String[]{
                "ma","igual","as"
        });
        dimensiones.add(new String[]{
                "11","11","52"
        });
        descripcion.add(new String[]{
                "0","0","0"
        });
        //*********************************************
        //Ecuacion 03**********************************
        formulas.add(new String[]{
                "mb","igual","bs"
        });
        dimensiones.add(new String[]{
                "11","11","52"
        });
        descripcion.add(new String[]{
                "0","0","0"
        });
        //*********************************************
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------







        //Transicion 03 ------------------------------------------------------------------------------------------------
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);
        //Ecuacion 01*********************************
        formulas.add(new String[]{
                "a","igual","mn","ma"
        });
        dimensiones.add(new String[]{
                "11","11","11","11"
        });
        descripcion.add(new String[]{
                "0","0","17ns","51as"
        });
        //*********************************************
        //Ecuacion 02**********************************
        formulas.add(new String[]{
                "b","igual","mn","mb"
        });
        dimensiones.add(new String[]{
                "11","11","11","11"
        });
        descripcion.add(new String[]{
                "0","0","17ns","51bs"
        });
        //*********************************************
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------







        subtitulos.add(new String[]{
                "Interpolamos las incognitas A de los 4 nodos con su funcion de forma",
                "Interpolamos las incognitas B de los 4 nodos con su funcion de forma",
                "A en forma matricial ",
                "B en forma matricial ",
        });

        subtitulos.add(new String[]{
                "matriz N",
                "matriz A",
                "matriz B"
        });

        subtitulos.add(new String[]{
                "por tanta A",
                "por tanto B"
        });

        titulos = new String[]{
                "Interpolación",
                "matrices",
                "Definimos A y B"
        };


    }
    public ScenePaso2(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }
}
