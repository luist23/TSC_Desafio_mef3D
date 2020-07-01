package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;

import java.util.ArrayList;

public class ScenePaso4 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso IV";
        next=TypeScene.PASO5;
        preview=TypeScene.PASO3;
        fondo="background01";

        ArrayList<String[]> formulas = new ArrayList<>();
        ArrayList<String[]> dimensiones = new ArrayList<>();
        ArrayList<String[]> descripcion = new ArrayList<>();



        //Transicion 01 ------------------------------------------------------------------------------------------------
        transiciones.add(2);
        //Ecuacion 01*********************************
        formulas.add(new String[]{
                "integral","peso","residuo1","derivada","igual","cero"
        });
        dimensiones.add(new String[]{
                "21","11","11","12","11","11"
        });
        descripcion.add(new String[]{
                "0","0","0","0","0","0"
        });
        //*********************************************
        //Ecuacion 02**********************************
        formulas.add(new String[]{
                "integral","peso","residuo2","derivada","igual","cero"
        });
        dimensiones.add(new String[]{
                "21","11","11","12","11","11"
        });
        descripcion.add(new String[]{
                "0","0","0","0","0","0"
        });
        //*********************************************
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------







        subtitulos.add(new String[]{
                "colocando peso al residuo 1",
                "colocando peso al residuo 1",
        });

        titulos = new String[]{
                "Definición de las integrales"
        };


    }
    public ScenePaso4(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }
}
