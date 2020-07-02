package main.java.com.luist23.mef3d.scenes;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;
import main.java.com.luist23.mef3d.utils.FormulasUtil;
import main.java.com.luist23.mef3d.utils.MatricesUtil;

import java.util.ArrayList;

public class SceneMatrizComponent extends SceneModel {
    public void inicializar(){
        tituloVentana = "Matrices";
        next=TypeScene.ENSAMBLAJE;
        preview=TypeScene.PASO6;
        fondo="background01";

        FormulasUtil f= new FormulasUtil();
        MatricesUtil m= new MatricesUtil();
        ArrayList<ArrayList<String>> formulas;
        ArrayList<ArrayList<String>> dimensiones;
        ArrayList<ArrayList<String>> descripcion;
        ArrayList<String> a;
        ArrayList<String> b;
        ArrayList<String> c;


        //Transaccion 01
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(3);
        //Ecuacion 01*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //------------
        m.gradienteXN(a,b,c);
        f.igual(a,b,c);
        m.gradienteEXIn(a,b,c);
        m.gradienteEN(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //------------------
        m.gradienteX(a,b,c);
        f.igual(a,b,c);
        m.gradienteXMatriz(a,b,c);
        f.espacio(a,b,c);
        f.espacio(a,b,c);
        //----------
        m.gradienteE(a,b,c);
        f.igual(a,b,c);
        m.gradienteEMatriz(a,b,c);
        f.espacio(a,b,c);
        f.espacio(a,b,c);
        //-----------
        m.x(a,b,c);
        f.igual(a,b,c);
        m.xMatriz(a,b,c);
        //-----------------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 03*********************************
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //----------
        m.xyz(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        subtitulos.add(new String[]{
                "formula a emplear",
                "definimas las componentes",
                "definimos nuestras nuevas x, y, z",
        });




        //transaccion 2
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(5);
        //Ecuacion 01*********************************//seleccionamos primer componente
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //---------
        m.gradienteEN(a,b,c);
        f.igual(a,b,c);
        m.gradienteEMatriz(a,b,c);
        f.mnC(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************//sustituimos las componentes de N
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //-------------
        m.gradienteEN(a,b,c);
        f.igual(a,b,c);
        m.gradienteEMatriz(a,b,c);
        f.corchete1(a,b,c);
        f.n1C(a,b,c);
        f.espacio(a,b,c);
        f.n2C(a,b,c);
        f.espacio(a,b,c);
        f.n3C(a,b,c);
        f.espacio(a,b,c);
        f.n4C(a,b,c);
        f.corchete2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 03*********************************operamos componentes
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //------------------
        m.gradienteEN(a,b,c);
        f.igual(a,b,c);
        m.gradienteENOpe(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 04*********************************optenemos resultado final
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //-----------------
        m.gradienteEN(a,b,c);
        f.igual(a,b,c);
        m.betaMatriz(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 05*********************************optenemos beta
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //-----------
        m.beta(a,b,c);
        f.igual(a,b,c);
        m.betaMatriz(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //-------------
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------
        subtitulos.add(new String[]{
                "seleccionamos nuestra primer componente a operar",
                "sustituimos los componentes de N",
                "operamos las matrices",
                "derivamos los componentes",
                "nombramos una nueva matriz beta"
        });





        //transaccion 3
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(4);
        //Ecuacion 01*********************************//seleccionamos segunda componente
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //--------------
        m.gradienteEX(a,b,c);
        f.igual(a,b,c);
        m.gradienteEMatriz(a,b,c);
        m.xMatriz(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************//Operamos
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //-----------------
        m.gradienteEX(a,b,c);
        f.igual(a,b,c);
        m.gradienteEXOperado(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 03*********************************Resolvemos matriz
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //--------------------
        m.gradienteEX(a,b,c);
        f.igual(a,b,c);
        m.gradienteEXResuelto(a,b,c);//resuelto
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 04*********************************optenemos resultado final simplificado
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //-------------------
        m.gradienteEX(a,b,c);
        f.igual(a,b,c);
        m.gradienteEXResueltoSimplificado(a,b,c);//resuelto
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //---------------
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------
        subtitulos.add(new String[]{
                "seleccionamos nuestra segunda componente a operar",
                "operamos las matrices",
                "derivamos los componentes",
                "simplificamos los resultados"
        });




        //transaccion 4
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(4);
        //Ecuacion 01*********************************//Inversa de segunda componnte
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.gradienteEXIn(a,b,c);
        f.igual(a,b,c);
        m.determinante2(a,b,c);
        m.adjunta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************//operando el determinante y definiendo S
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.determinante(a,b,c);
        f.igual(a,b,c);
        m.determinanteR(a,b,c);
        f.igual(a,b,c);
        m.s(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 03*********************************operando adjunta y opteniendo alpha
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.adjunta(a,b,c);
        f.igual(a,b,c);
        m.alphaMatriz(a,b,c);
        f.igual(a,b,c);
        m.alpha(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 04*********************************reemplazando inversa
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.gradienteEXIn(a,b,c);
        f.igual(a,b,c);
        m.determinante2(a,b,c);
        m.adjunta(a,b,c);
        f.igual(a,b,c);
        m.s2(a,b,c);
        m.alpha(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------
        subtitulos.add(new String[]{
                "definimos inversa a la segunda componete",
                "Operando el determinante y obteniendo S",
                "Operando la adjunta y obteniendo alpha",
                "reemplazando operandos en nuestra componete"
        });




        //transaccion 5
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(1);
        //Ecuacion 01*********************************// volviendo al la rimera ecaucion
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.gradienteXN(a,b,c);
        f.igual(a,b,c);
        m.gradienteEXIn(a,b,c);
        m.gradienteEN(a,b,c);
        f.igual(a,b,c);
        m.s2(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        subtitulos.add(new String[]{
                "Operando nuestra ecuación"
        });





        //transicion 6
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(9);
        //Ecuancion 01******** // tomaNDO ECUACION C
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.c(a,b,c);
        f.igual(a,b,c);
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
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 02*********************************//sustituyendo C
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.c(a,b,c);
        f.igual(a,b,c);
        //C
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //---
        f.corchete1(a,b,c);
        m.x1(a,b,c);
        f.mas(a,b,c);
        m.x2(a,b,c);
        f.mas(a,b,c);
        m.x3(a,b,c);
        f.mas(a,b,c);
        m.x4(a,b,c);
        f.corchete2(a,b,c);
        //
        m.s2(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        f.integral2(a,b,c);
        //fin C
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 03******** extrayendo constantes
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.c(a,b,c);
        f.igual(a,b,c);
        m.s2(a,b,c);
        //C
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //---
        f.corchete1(a,b,c);
        m.x1(a,b,c);
        f.mas(a,b,c);
        m.x2(a,b,c);
        f.mas(a,b,c);
        m.x3(a,b,c);
        f.mas(a,b,c);
        m.x4(a,b,c);
        f.corchete2(a,b,c);
        //
        f.integral2(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //fin C
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 04******** Integrando
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        //---
        f.corchete1(a,b,c);
        m.x1(a,b,c);
        f.mas(a,b,c);
        m.x2(a,b,c);
        f.mas(a,b,c);
        m.x3(a,b,c);
        f.mas(a,b,c);
        m.x4(a,b,c);
        f.corchete2(a,b,c);
        //
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 05******** Resolviendo Integrando
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.integralC(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuancion 06******** Resolviendo Integrando sumando 2 matrices
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.integralCv2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 07******** suma matricial
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();

        m.integralCv3(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 08******** suma matricial definiendo omega
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.omegaMatriz(a,b,c);
        f.igual(a,b,c);
        m.omega(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 09******** reemplazando omega
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.c(a,b,c);
        f.igual(a,b,c);
        m.s2(a,b,c);
        m.omega(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //fin C
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------
        subtitulos.add(new String[]{
                "Operaremos la ecuacion C",
                "sustituimos las varibles modificadas",
                "extraemos las constantes",
                "trabajando integral",
                "solución de la integral",
                "sumaremos dos de las matrices resultantes",
                "representaremos la suma en forma matricial",
                "modificaremos la segunda matriz y definimos matriz omega 4x3",
                "reemplazando nuevos valores en C"
        });



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
                "Construimos forma matricial fila 1",
                "Construimos forma matricial fila 1",
        });

        titulos = new String[]{
                "Convertinos el mundo x, y, z en el mundo épsilon, eta, psi",
                "Operamos primer componente",


                "Representación en mundo épsilon, eta, psi",
                "Eliminando la doble derivación Matriz D",
                "Eliminando la doble derivación Matriz E",
                "Eliminando la doble derivación Matriz E",
                "Construyendo la 'Forma debil'",
                "Construyendo la matriz de la'Forma debil'",
        };


    }
    public SceneMatrizComponent(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }






}
