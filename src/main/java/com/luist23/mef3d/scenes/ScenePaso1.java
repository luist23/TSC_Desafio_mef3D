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

        ArrayList<String[]> formulas = new ArrayList<>();
        ArrayList<String[]> dimensiones = new ArrayList<>();
        ArrayList<String[]> descripcion = new ArrayList<>();

        //Transicion 01 ------------------------------------------------------------------------------------------------
        transiciones.add(4);
        //Ecuacion 01*********************************
        formulas.add(new String[]{
                "n1","igual","n1c"
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
                "n2","igual","n2c"
        });
        dimensiones.add(new String[]{
                "11","11","11"
        });
        descripcion.add(new String[]{
                "0","0","0"
        });
        //*********************************************
        //Ecuacion 03**********************************
        formulas.add(new String[]{
                "n3","igual","n3c"
        });
        dimensiones.add(new String[]{
                "11","11","11"
        });
        descripcion.add(new String[]{
                "0","0","0"
        });
        //*********************************************
        //Ecuacion 04**********************************
        formulas.add(new String[]{
                "n4","igual","n4c"
        });
        dimensiones.add(new String[]{
                "11","11","11"
        });
        descripcion.add(new String[]{
                "0","0","0"
        });
        //*********************************************
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------


        //titulos
        titulos = new String[]{
                "Definimos las funciones de forma:"
        };
        subtitulos.add(new String[]{
                "Definimos N sub 1",
                "Definimos N sub 2",
                "Definimos N sub 3",
                "Definimos N sub 4"
        });

    }
    public ScenePaso1(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }
}
