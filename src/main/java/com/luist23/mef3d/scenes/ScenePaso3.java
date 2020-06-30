package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;

import java.util.ArrayList;

public class ScenePaso3 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso III";
        next=TypeScene.PASO4;
        preview=TypeScene.PASO2;
        fondo="background01";

        ArrayList<String[]> formulas = new ArrayList<>();
        ArrayList<String[]> dimensiones = new ArrayList<>();
        ArrayList<String[]> descripcion = new ArrayList<>();

        //Transicion 01 ------------------------------------------------------------------------------------------------
        transiciones.add(2);
        //Ecuacion 01*********************************
        formulas.add(new String[]{
                "x", "gradiente", "parentesis1", "a", "parentesis2",//x*gradiente(A)
                "mas",//+
                "x", "y", "gradiente2", "parentesis1", "b", "parentesis2",//xy*gradiente^2(B)
                "igual",//=
                "igualdad1"//78.4
        });
        dimensiones.add(new String[]{
                "11","11","11","11","11",
                "11",
                "11","11","11","11","11","11",
                "11",
                "14"

        });
        descripcion.add(new String[]{
                "0","0","0","0","0",
                "0",
                "0","0","0","0","0","0",
                "0",
                "0"
        });
        //*********************************************
        //Ecuacion 02**********************************
        formulas.add(new String[]{
                "y", "gradiente2", "parentesis1", "a","parentesis2",//y*gradiente^2(A)
                "mas",//+
                "x", "gradiente", "parentesis1", "b", "parentesis2",//x*gradiente(B)
                "igual",//=
                "igualdad2"//94.7
        });
        dimensiones.add(new String[]{
                "11","11","11","11","11",
                "11",
                "11","11","11","11","11",
                "11",
                "14"

        });
        descripcion.add(new String[]{
                "0","0","0","0","0",
                "0",
                "0","0","0","0","0","0",
                "0",
                "0"
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
        transiciones.add(2);
        //Ecuacion 01*********************************
        formulas.add(new String[]{
                "x", "gradiente", "parentesis1","mn", "ma", "parentesis2",//x*gradiente(NA)
                "mas",//+
                "x", "y", "gradiente2", "parentesis1","mn", "mb", "parentesis2",//xy*gradiente^2(NB)
                "igual",//=
                "igualdad1"//78.4
        });
        dimensiones.add(new String[]{
                "11","11","11","11","11","11",
                "11",
                "11","11","11","11","11","11","11",
                "11",
                "14"

        });
        descripcion.add(new String[]{
                "0","0","0","17ns","51as","0",
                "0",
                "0","0","0","0","17ns","51bs","0",
                "0",
                "0"
        });
        //*********************************************
        //Ecuacion 02**********************************
        formulas.add(new String[]{
                "y", "gradiente2", "parentesis1", "mn", "ma","parentesis2",//y*gradiente^2(NA)
                "mas",//+
                "x", "gradiente", "parentesis1", "mn", "mb", "parentesis2",//x*gradiente(NB)
                "igual",//=
                "igualdad2"//94.7
        });
        dimensiones.add(new String[]{
                "11","11","11","11","11","11",
                "11",
                "11","11","11","11","11","11",
                "11",
                "14"

        });
        descripcion.add(new String[]{
                "0","0","0","17ns","51as","0",
                "0",
                "0","0","0","17ns","51bs","0",
                "0",
                "0"
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
                "cero","igual",//0 =
                "menos",//-
                "x", "gradiente", "parentesis1", "mn", "ma","parentesis2",//x*gradiente(NA)
                "menos",//-
                "x", "y", "gradiente2", "parentesis1","mn", "mb", "parentesis2",//xy*gradiente^2(NB)
                "mas",//=
                "igualdad1"//78.4
        });
        dimensiones.add(new String[]{
                "11","11",//0=
                "11",//-
                "11","11","11","11","11","11",//x*gradiente(NA)
                "11",
                "11","11","11","11","11","11","11",
                "11",
                "14"

        });
        descripcion.add(new String[]{
                "0","0",//0=
                "0",//-
                "0","0","0","17ns","51as","0",//x*gradiente(NA)
                "0",
                "0","0","0","0","17ns","51bs","0",
                "0",
                "0"
        });
        //*********************************************
        //Ecuacion 02**********************************
        formulas.add(new String[]{
                "cero","igual",//0 =
                "menos",//-
                "y", "gradiente2", "parentesis1", "mn", "ma","parentesis2",//y*gradiente^2(NA)
                "menos",//-
                "x", "gradiente", "parentesis1", "mn", "mb", "parentesis2",//x*gradiente(NB)
                "mas",//=
                "igualdad2"//94.7
        });
        dimensiones.add(new String[]{
                "11","11",//0=
                "11",//-
                "11","11","11","11","11","11",
                "11",
                "11","11","11","11","11","11",
                "11",
                "14"

        });
        descripcion.add(new String[]{
                "0","0",//0=
                "0",//-
                "0","0","0","17ns","51as","0",
                "0",
                "0","0","0","17ns","51bs","0",
                "0",
                "0"
        });
        //*********************************************
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------



        //Transicion 04 ------------------------------------------------------------------------------------------------
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);
        //Ecuacion 01*********************************
        formulas.add(new String[]{
                "residuo1","igual",//0 =
                "menos",//-
                "x", "gradiente", "parentesis1", "mn", "ma","parentesis2",//x*gradiente(NA)
                "menos",//-
                "x", "y", "gradiente2", "parentesis1","mn", "mb", "parentesis2",//xy*gradiente^2(NB)
                "mas",//=
                "igualdad1"//78.4
        });
        dimensiones.add(new String[]{
                "11","11",//0=
                "11",//-
                "11","11","11","11","11","11",//x*gradiente(NA)
                "11",
                "11","11","11","11","11","11","11",
                "11",
                "14"

        });
        descripcion.add(new String[]{
                "0","0",//0=
                "0",//-
                "0","0","0","17ns","51as","0",//x*gradiente(NA)
                "0",
                "0","0","0","0","17ns","51bs","0",
                "0",
                "0"
        });
        //*********************************************
        //Ecuacion 02**********************************
        formulas.add(new String[]{
                "residuo2","igual",//0 =
                "menos",//-
                "y", "gradiente2", "parentesis1", "mn", "ma","parentesis2",//y*gradiente^2(NA)
                "menos",//-
                "x", "gradiente", "parentesis1", "mn", "mb", "parentesis2",//x*gradiente(NB)
                "mas",//=
                "igualdad2"//94.7
        });
        dimensiones.add(new String[]{
                "11","11",//0=
                "11",//-
                "11","11","11","11","11","11",
                "11",
                "11","11","11","11","11","11",
                "11",
                "14"

        });
        descripcion.add(new String[]{
                "0","0",//0=
                "0",//-
                "0","0","0","17ns","51as","0",
                "0",
                "0","0","0","17ns","51bs","0",
                "0",
                "0"
        });
        //*********************************************
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------




        subtitulos.add(new String[]{
                "Eq. 1",
                "Eq. 2"
        });
        subtitulos.add(new String[]{
                "Reemplazando A y B en Eq. 1",
                "Reemplazando A y B en Eq. 2"
        });
        subtitulos.add( new String []{
                "Igualando a cero Eq. 1",
                "Igualando a cero Eq. 2"
        });
        subtitulos.add( new String []{
                "Residuo Eq. 1",
                "Residuo Eq. 2"
        });


        titulos = new String[]{
                "Tomando Ecuaciones",
                "Reemplazando incognitas",
                "igualando a cero",
                "Obteniendo residuos"
        };

    }
    public ScenePaso3(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }
}
