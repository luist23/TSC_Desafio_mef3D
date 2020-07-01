package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;
import main.java.com.luist23.mef3d.utils.FormulasUtil;

import java.util.ArrayList;

public class ScenePaso4 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso IV";
        next=TypeScene.PASO5;
        preview=TypeScene.PASO3;
        fondo="background01";

        FormulasUtil f= new FormulasUtil();
        ArrayList<ArrayList<String>> formulas;
        ArrayList<ArrayList<String>> dimensiones;
        ArrayList<ArrayList<String>> descripcion;
        ArrayList<String> a;
        ArrayList<String> b;
        ArrayList<String> c;



        //Transicion 01 ------------------------------------------------------------------------------------------------
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);
        //Ecuacion 01*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        //SSS W R1 dv = 0
        f.integral(a,b,c);
        f.peso(a,b,c);
        f.residuo1(a,b,c);
        f.integral2(a,b,c);
        f.igual(a,b,c);
        f.cero(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        //SSS W R2 dv = 0
        f.integral(a,b,c);
        f.peso(a,b,c);
        f.residuo2(a,b,c);
        f.integral2(a,b,c);
        f.igual(a,b,c);
        f.cero(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
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
