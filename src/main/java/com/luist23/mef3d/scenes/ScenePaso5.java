package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;
import main.java.com.luist23.mef3d.utils.FormulasUtil;

import java.util.ArrayList;

public class ScenePaso5 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso V";
        next=TypeScene.PASO6;
        preview=TypeScene.PASO4;
        fondo="background01";

        FormulasUtil f= new FormulasUtil();
        ArrayList<ArrayList<String>> formulas;
        ArrayList<ArrayList<String>> dimensiones;
        ArrayList<ArrayList<String>> descripcion;
        ArrayList<String> a;
        ArrayList<String> b;
        ArrayList<String> c;

        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);

        //Ecuacion 01*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.integral(a,b,c);
        f.ntrasnpuesta(a,b,c);
        f.residuo1(a,b,c);
        f.integral2(a,b,c);
        f.igual(a,b,c);
        f.cero(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //------------------
        f.integral(a,b,c);
        f.ntrasnpuesta(a,b,c);
        f.residuo2(a,b,c);
        f.integral2(a,b,c);
        f.igual(a,b,c);
        f.cero(a,b,c);
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------



        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);

        //Ecuancion 01********
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //SSS nt [  -
        f.integral(a,b,c);
        f.ntrasnpuesta(a,b,c);
        f.corchete1(a,b,c);
        f.menos(a,b,c);
        //x gradiente( N A ) -
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.menos(a,b,c);
        //x y gradiente^2 ( N B ) +
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);
        // 78.4  ] dv = 0
        f.cons1(a,b,c);
        f.corchete2(a,b,c);
        f.integral2(a,b,c);
        f.igual(a,b,c);
        f.cero(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //SSS nt [  -
        f.integral(a,b,c);
        f.ntrasnpuesta(a,b,c);
        f.corchete1(a,b,c);
        f.menos(a,b,c);
        //y gradiente^2 ( N A ) -
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.menos(a,b,c);
        //x y gradiente ( N B ) +
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);
        // 94.7  ] dv = 0
        f.cons2(a,b,c);
        f.corchete2(a,b,c);
        f.integral2(a,b,c);
        f.igual(a,b,c);
        f.cero(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------


        subtitulos.add(new String[]{
                "sustituyendo peso al residuo 1",
                "sustituyendo peso al residuo 2",
        });

        subtitulos.add(new String[]{
                "sustituyendo residuo 1",
                "sustituyendo residuo 2",
        });


        titulos = new String[]{
                "Para nuestros pesos no nos complicamos y tomamos la matriz N y la trasponemos",
                "Sustituimos los residuos"
        };


    }
    public ScenePaso5(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }






}
