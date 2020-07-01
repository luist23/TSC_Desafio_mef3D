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


        //transicion 2
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
        //x  gradiente ( N B ) +
        f.x(a,b,c);
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


        //trancicion 3----sitribuyendo pesos (N^t)
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
        f.corchete1(a,b,c);
        f.menos(a,b,c);
        f.ntrasnpuesta(a,b,c);//nt
        //x gradiente( N A ) -
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.menos(a,b,c);
        f.ntrasnpuesta(a,b,c);//nt
        //x y gradiente^2 ( N B ) +
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);
        f.ntrasnpuesta(a,b,c);//nt
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
        f.corchete1(a,b,c);
        f.menos(a,b,c);
        f.ntrasnpuesta(a,b,c);//nt
        //y gradiente^2 ( N A ) -
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.menos(a,b,c);
        f.ntrasnpuesta(a,b,c);//nt
        //x  gradiente ( N B ) +
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.mas(a,b,c);
        f.ntrasnpuesta(a,b,c);//nt
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




        //trancicion 4----ditribuyendo integrales
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);

        //Ecuancion 01********
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //SSS nt [  -
        //f.corchete1(a,b,c);
        f.menos(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //x gradiente( N A ) -
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        f.menos(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //x y gradiente^2 ( N B ) +
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        f.mas(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        // 78.4  ] dv = 0
        f.cons1(a,b,c);
        //f.corchete2(a,b,c);
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
        //f.integral(a,b,c);
        //f.corchete1(a,b,c);
        f.menos(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //y gradiente^2 ( N A ) -
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);
        f.menos(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //x  gradiente ( N B ) +
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);
        f.mas(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        // 94.7  ] dv = 0
        f.cons2(a,b,c);
        //f.corchete2(a,b,c);
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




        //trancicion 5----volviendo a forma original
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);

        //Ecuancion 01********
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //SSS nt [  -
        //f.corchete1(a,b,c);
        //f.menos(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //x gradiente( N A ) -
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        f.mas(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //x y gradiente^2 ( N B ) +
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        f.igual(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        // 78.4  ] dv = 0
        f.cons1(a,b,c);
        //f.corchete2(a,b,c);
        f.integral2(a,b,c);
        //f.igual(a,b,c);
        //f.cero(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //SSS nt [  -
        //f.integral(a,b,c);
        //f.corchete1(a,b,c);
        //f.menos(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //y gradiente^2 ( N A ) -
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);
        f.mas(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //x  gradiente ( N B ) +
        f.x(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);
        f.igual(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        // 94.7  ] dv = 0
        f.cons2(a,b,c);
        //f.corchete2(a,b,c);
        f.integral2(a,b,c);
        //f.igual(a,b,c);
        //f.cero(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------



        //trancicion 6---- extrayendo A y B constantes
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);

        //Ecuancion 01********
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.corchete1(a,b,c);//[
        //C
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        f.x(a,b,c);//x gradiente( N A ) -
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        //fin C
        f.corchete2(a,b,c);//]
        f.ma(a,b,c);

        f.mas(a,b,c);

        f.corchete1(a,b,c);//[
        //D
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        f.x(a,b,c);//x y gradiente^2 ( N B ) +
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        //fin D
        f.corchete2(a,b,c);//]
        f.mb(a,b,c);

        f.igual(a,b,c);

        //f
        f.cons1(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        f.integral2(a,b,c);//dv
        //fin f

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.corchete1(a,b,c);//[
        //E
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        f.y(a,b,c);        //y gradiente^2 ( N A ) -
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        //fin E
        f.corchete2(a,b,c);//]
        f.ma(a,b,c);

        f.mas(a,b,c);

        f.corchete1(a,b,c);//[
        //G
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        f.x(a,b,c);//x  gradiente ( N B ) +
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        //fin G
        f.corchete2(a,b,c);//]
        f.mb(a,b,c);

        f.igual(a,b,c);//=

        //h
        f.cons2(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        f.integral2(a,b,c);//dv
        //fin h

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------


        //trancicion 7---- forma fuerte
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);

        //Ecuancion 01********
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.c(a,b,c);
        f.ma(a,b,c);
        f.mas(a,b,c);
        f.d(a,b,c);//D
        f.mb(a,b,c);
        f.igual(a,b,c);

        f.f(a,b,c);
        //f.cero(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.e(a,b,c);
        f.ma(a,b,c);
        f.mas(a,b,c);
        f.g(a,b,c);//D
        f.mb(a,b,c);
        f.igual(a,b,c);

        f.h(a,b,c);
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
        subtitulos.add(new String[]{
                "Distribuyendo en eq.1",
                "Distribuyendo en eq.2",
        });

        subtitulos.add(new String[]{
                "Distribuyendo en eq.1",
                "Distribuyendo en eq.2",
        });
        subtitulos.add(new String[]{
                "Aplicando en eq.1",
                "Aplicando en eq.2",
        });
        subtitulos.add(new String[]{
                "Aplicando en eq.1",
                "Aplicando en eq.2",
        });
        subtitulos.add(new String[]{
                "Renombrando integrales en eq.1",
                "Renombrando integrales en eq.2",
        });


        titulos = new String[]{
                "Para nuestros pesos no nos complicamos y tomamos la matriz N y la trasponemos",
                "Sustituimos los residuos",
                "Distibuyendo matriz N transpuesta",
                "Distribuyendo integrales",
                "Regresando a la foma original",
                "Extrayendo Constantes",
                "Construyendo la 'Forma fuerte'"
        };


    }
    public ScenePaso5(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }






}
