package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;
import main.java.com.luist23.mef3d.utils.FormulasUtil;

import java.util.ArrayList;

public class ScenePaso3 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso III";
        next=TypeScene.PASO4;
        preview=TypeScene.PASO2;
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

        //x gradiente ( a ) +
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.var1(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);

        //x y gradiente^2 ( b ) = 78.4
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.var2(a,b,c);
        f.parentesis2(a,b,c);
        f.igual(a,b,c);
        f.cons1(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        //y gradiente^2 ( a ) +
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.var1(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);

        //x gradiente ( b ) = 94.7
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.var2(a,b,c);
        f.parentesis2(a,b,c);
        f.igual(a,b,c);
        f.cons2(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
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
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        //x gradiente ( N A ) +
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);

        //x y gradiente^2 ( N B ) = 78.4
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.igual(a,b,c);
        f.cons1(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        //y gradiente^2 ( N A ) +
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);

        //x gradiente ( N B ) = 94.7
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.igual(a,b,c);
        f.cons2(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
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
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.cero(a,b,c);
        f.igual(a,b,c);
        f.menos(a,b,c);
        //x gradiente ( N A ) -
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.menos(a,b,c);

        //x y gradiente^2 ( N B ) + 78.4
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);
        f.cons1(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.cero(a,b,c);
        f.igual(a,b,c);
        f.menos(a,b,c);
        //y gradiente^2 ( N A ) -
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.menos(a,b,c);

        //x gradiente ( N B ) + 94.7
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);
        f.cons2(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
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
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.residuo1(a,b,c);
        f.igual(a,b,c);
        f.menos(a,b,c);
        //x gradiente ( N A ) -
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.menos(a,b,c);

        //x y gradiente^2 ( N B ) + 78.4
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);
        f.cons1(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.residuo2(a,b,c);
        f.igual(a,b,c);
        f.menos(a,b,c);
        //y gradiente^2 ( N A ) -
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.menos(a,b,c);

        //x gradiente ( N B ) + 94.7
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);
        f.cons2(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
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
