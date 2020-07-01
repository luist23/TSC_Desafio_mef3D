package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;
import main.java.com.luist23.mef3d.utils.FormulasUtil;

import java.util.ArrayList;

public class ScenePaso2 extends SceneModel {
    public void inicializar(){
        tituloVentana = "Paso II";
        next=TypeScene.PASO3;
        preview=TypeScene.PASO1;
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
        transiciones.add(4);
        //Ecuacion 01*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        //a == n1 a1 + n2 a2 + n3 a3 + n4 a4
        f.var1(a,b,c);
        f.noigual(a,b,c);
        f.n1(a,b,c);
        f.a1(a,b,c);
        f.mas(a,b,c);
        f.n2(a,b,c);
        f.a2(a,b,c);
        f.mas(a,b,c);
        f.n3(a,b,c);
        f.a3(a,b,c);
        f.mas(a,b,c);
        f.n4(a,b,c);
        f.a4(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        //b == n1 b1 + n2 b2 + n3 b3 + n4 b4
        f.var2(a,b,c);
        f.noigual(a,b,c);
        f.n1(a,b,c);
        f.b1(a,b,c);
        f.mas(a,b,c);
        f.n2(a,b,c);
        f.b2(a,b,c);
        f.mas(a,b,c);
        f.n3(a,b,c);
        f.b3(a,b,c);
        f.mas(a,b,c);
        f.n4(a,b,c);
        f.b4(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 03**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.var1(a,b,c);
        f.igual(a,b,c);
        f.mnC(a,b,c);
        f.maC(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 04**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.var2(a,b,c);
        f.igual(a,b,c);
        f.mnC(a,b,c);
        f.mbC(a,b,c);

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
        transiciones.add(3);
        //Ecuacion 01*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.mn(a,b,c);
        f.igual(a,b,c);
        f.mnC(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.ma(a,b,c);
        f.igual(a,b,c);
        f.maC(a,b,c);

        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 03**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.mb(a,b,c);
        f.igual(a,b,c);
        f.mbC(a,b,c);

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

        f.var1(a,b,c);
        f.igual(a,b,c);
        f.mn(a,b,c);
        f.ma(a,b,c);


        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //*********************************************
        //Ecuacion 02**********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        f.var2(a,b,c);
        f.igual(a,b,c);
        f.mn(a,b,c);
        f.mb(a,b,c);


        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
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
