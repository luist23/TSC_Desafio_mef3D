package main.java.com.luist23.mef3d.scenes.pasos;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.numeracion.TypeScene;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;
import main.java.com.luist23.mef3d.utils.FormulasUtil;

import java.util.ArrayList;

public class ScenePaso1 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso I";
        next= TypeScene.PASO2;
        preview=TypeScene.MODELO;
        fondo="imagenes/pizarra";

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
        transiciones.add(4);
        //Ecuacion 01*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.n1(a,b,c);
        f.igual(a,b,c);
        f.n1C(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.n2(a,b,c);
        f.igual(a,b,c);
        f.n2C(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 03**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.n3(a,b,c);
        f.igual(a,b,c);
        f.n3C(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 04**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.n4(a,b,c);
        f.igual(a,b,c);
        f.n4C(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
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
