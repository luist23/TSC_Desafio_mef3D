package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;
import main.java.com.luist23.mef3d.utils.FormulasUtil;

import java.util.ArrayList;

public class ScenePaso6 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso VI";
        next=TypeScene.MATRICES;
        preview=TypeScene.PASO5;
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
        transiciones.add(6);

        //Ecuacion 01*********************************tomamos D
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.d(a,b,c);
        f.igual(a,b,c);
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
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************la vaca
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //------------------
        f.vaca(a,b,c);
        //-----------------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuacion 03*********************************definimos u
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.u(a,b,c);
        f.igual(a,b,c);
        f.ntrasnpuesta(a,b,c);//SS

        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 04*********************************definimos du
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.du(a,b,c);
        f.igual(a,b,c);
        f.gradiente(a,b,c);
        f.ntrasnpuesta(a,b,c);//SS
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuacion 05*********************************definimos dv
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.integral2(a,b,c);
        f.igual(a,b,c);
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.ntrasnpuesta(a,b,c);//SS
        f.parentesis2(a,b,c);
        f.parentesis2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuacion 06*********************************definimos v
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.v(a,b,c);
        f.igual(a,b,c);
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.ntrasnpuesta(a,b,c);//SS
        f.parentesis2(a,b,c);
        //-----------
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
        transiciones.add(4);

        //Ecuancion 01******** // d = vaca
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.d(a,b,c);
        f.igual(a,b,c);
        f.corchete1(a,b,c);
        f.ntrasnpuesta(a,b,c);

        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.corchete2(a,b,c);

        f.contorno(a,b,c);
        f.menos(a,b,c);
        f.integral(a,b,c);
        f.gradiente(a,b,c);
        f.ntrasnpuesta(a,b,c);
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************//phi
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.phi(a,b,c);
        f.igual(a,b,c);
        f.corchete1(a,b,c);
        f.ntrasnpuesta(a,b,c);

        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.corchete2(a,b,c);

        f.contorno(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuancion 03******** K
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.k(a,b,c);
        f.igual(a,b,c);
        f.integral(a,b,c);
        f.gradiente(a,b,c);
        f.ntrasnpuesta(a,b,c);
        f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuancion 04******** D = -k
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.d(a,b,c);
        f.igual(a,b,c);
        f.menos(a,b,c);
        f.k(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------



        //transicion 3
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(6);

        //Ecuacion 01*********************************tomamos E
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.e(a,b,c);
        f.igual(a,b,c);
        //D
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //f.x(a,b,c);//x y gradiente^2 ( N B ) +
        f.y(a,b,c);
        f.gradiente2(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);//dv
        //fin D
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************la vaca
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //------------------
        f.vaca(a,b,c);
        //-----------------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuacion 03*********************************definimos u
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.u(a,b,c);
        f.igual(a,b,c);
        f.ntrasnpuesta(a,b,c);//SS

        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 04*********************************definimos du
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.du(a,b,c);
        f.igual(a,b,c);
        f.gradiente(a,b,c);
        f.ntrasnpuesta(a,b,c);//SS
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuacion 05*********************************definimos dv
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.integral2(a,b,c);
        f.igual(a,b,c);
        //f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.ntrasnpuesta(a,b,c);//SS
        f.parentesis2(a,b,c);
        f.parentesis2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuacion 06*********************************definimos v
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.v(a,b,c);
        f.igual(a,b,c);
        //f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.ntrasnpuesta(a,b,c);//SS
        f.parentesis2(a,b,c);
        //-----------
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
        transiciones.add(4);

        //Ecuancion 01********
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.e(a,b,c);
        f.igual(a,b,c);
        f.corchete1(a,b,c);
        f.ntrasnpuesta(a,b,c);

        //f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.corchete2(a,b,c);

        f.contorno(a,b,c);
        f.menos(a,b,c);
        f.integral(a,b,c);
        f.gradiente(a,b,c);
        f.ntrasnpuesta(a,b,c);
        //f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************//phi
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.phi(a,b,c);
        f.igual(a,b,c);
        f.corchete1(a,b,c);
        f.ntrasnpuesta(a,b,c);

        //f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.corchete2(a,b,c);

        f.contorno(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuancion 03******** j
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.j(a,b,c);
        f.igual(a,b,c);
        f.integral(a,b,c);
        f.gradiente(a,b,c);
        f.ntrasnpuesta(a,b,c);
        //f.x(a,b,c);
        f.y(a,b,c);
        f.gradiente(a,b,c);
        f.parentesis1(a,b,c);
        f.mn(a,b,c);
        f.parentesis2(a,b,c);
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuancion 04******** D = -j
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.e(a,b,c);
        f.igual(a,b,c);
        f.menos(a,b,c);
        f.j(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------


        //trancicion 7---- forma debil
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
        f.menos(a,b,c);
        f.k(a,b,c);//D
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
        f.menos(a,b,c);
        f.j(a,b,c);
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

        //trancicion 8---- forma debilmatriz
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(2);

        //Ecuancion 01********//forma debil->matriz
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.corchete41(a,b,c);
        f.espacio(a,b,c);
        f.c(a,b,c);
        f.espacio(a,b,c);
        f.menos(a,b,c);
        f.k(a,b,c);//D
        f.corchete42(a,b,c);

        f.corchete41(a,b,c);
        f.ma(a,b,c);
        f.corchete42(a,b,c);

        f.igual(a,b,c);
        f.corchete41(a,b,c);
        f.f(a,b,c);
        f.corchete42(a,b,c);

        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.corchete43(a,b,c);
        f.menos(a,b,c);
        f.j(a,b,c);
        f.espacio(a,b,c);
        f.espacio(a,b,c);
        f.g(a,b,c);
        f.corchete44(a,b,c);

        f.corchete43(a,b,c);
        f.mb(a,b,c);
        f.corchete44(a,b,c);

        f.espacio(a,b,c);
        f.corchete43(a,b,c);
        f.h(a,b,c);
        f.corchete44(a,b,c);

        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------



        subtitulos.add(new String[]{
                "tomamos la ecuacion D",
                "Recordamos la formula de integración por partes ('la vaca')",
                "Tomanos u",
                "derivamos u",
                "Tomanos dv",
                "Integramos dv",
        });

        subtitulos.add(new String[]{
                "sustituyendo Derivacion por partes",
                "Definiendo Phi",
                "Definiendo K",
                "Phi constituye el contorno por lo que lo descartaremos, por tanto:"
        });

        subtitulos.add(new String[]{
                "tomamos la ecuacion E",
                "Recordamos la formula de integración por partes ('la vaca')",
                "Tomanos u",
                "derivamos u",
                "Tomanos dv",
                "Integramos dv",
        });

        subtitulos.add(new String[]{
                "sustituyendo Derivacion por partes",
                "Definiendo Phi",
                "Definiendo J",
                "Phi constituye el contorno por lo que lo descartaremos, por tanto:"
        });

        subtitulos.add(new String[]{
                "remplazando D",
                "remplazando E"
        });

        subtitulos.add(new String[]{
                "Construimos forma matricial fila 1",
                "Construimos forma matricial fila 1",
        });

        titulos = new String[]{
                "Eliminando la doble derivación Matriz D",
                "Eliminando la doble derivación Matriz D",
                "Eliminando la doble derivación Matriz E",
                "Eliminando la doble derivación Matriz E",
                "Construyendo la 'Forma debil'",
                "Construyendo la matriz de la'Forma debil'",
        };


    }
    public ScenePaso6(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }






}
