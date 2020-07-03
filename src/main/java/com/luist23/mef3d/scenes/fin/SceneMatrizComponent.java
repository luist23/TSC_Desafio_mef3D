package main.java.com.luist23.mef3d.scenes.fin;

import javafx.stage.Stage;
import main.java.com.luist23.mef3d.scenes.model.SceneModel;
import main.java.com.luist23.mef3d.scenes.numeracion.TypeScene;
import main.java.com.luist23.mef3d.utils.FormulasUtil;
import main.java.com.luist23.mef3d.utils.MatricesUtil;

import java.util.ArrayList;

public class SceneMatrizComponent extends SceneModel {
    public void inicializar(){
        tituloVentana = "Componentes de las matrices";
        next= TypeScene.ENSAMBLAJE;
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



        //transicion 7
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(8);
        //Ecuacion 01*********************************tomamos k
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
        //Ecuacion 02*********************************mostramos condicion de transuetas
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //------------------
        m.siAlphaTrans(a,b,c);
        //-----------------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 03*********************************remplzamos conocidos en k
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.k(a,b,c);
        f.igual(a,b,c);
        f.integral(a,b,c);
        m.s2(a,b,c);
        m.alphaBeta(a,b,c);
        f.x(a,b,c);
        f.y(a,b,c);
        m.s2(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 04*********************************extraemos constantes
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.k(a,b,c);
        f.igual(a,b,c);
        m.sal2(a,b,c);
        f.integral(a,b,c);
        f.x(a,b,c);
        f.y(a,b,c);
        f.integral2(a,b,c);
        m.alphaBeta(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuacion 05*********************************integrando
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.integral(a,b,c);
        f.x(a,b,c);
        f.y(a,b,c);
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 06*********************************reemplazando xy
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //f.integral(a,b,c);
        m.xy(a,b,c);
        //f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 07********************************integrando y nombrando p
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.pigual(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 08*********************************fin K
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.k(a,b,c);
        f.igual(a,b,c);
        m.sal2(a,b,c);
        m.p(a,b,c);
        m.alphaBeta(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------
        subtitulos.add(new String[]{
                "Tomamos la funcion K",
                "definimos el gradiente epsilón de N transpuesta",
                "reemplazamos los gradientes",
                "extraemos las constantes",
                "trabajaremos la integral",
                "reemplazamos x, y",
                "solucion de integral y definición de p",
                "reemplzando nuevos componentes de K"
        });



        //transicion 8
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(7);
        //Ecuacion 01*********************************tomamos J
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
        //Ecuacion 02*********************************remplzamos conocidos en J
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.j(a,b,c);
        f.igual(a,b,c);
        f.integral(a,b,c);
        m.s2(a,b,c);
        m.alphaBeta(a,b,c);
        //f.x(a,b,c);
        f.y(a,b,c);
        m.s2(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 03*********************************extraemos constantes
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.j(a,b,c);
        f.igual(a,b,c);
        m.sal2(a,b,c);
        f.integral(a,b,c);
        //f.x(a,b,c);
        f.y(a,b,c);
        f.integral2(a,b,c);
        m.alphaBeta(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);

        //Ecuacion 04*********************************integrando
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.integral(a,b,c);
        //f.x(a,b,c);
        f.y(a,b,c);
        f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 05*********************************reemplazando y
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        //f.integral(a,b,c);
        m.yy(a,b,c);
        //f.integral2(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 06********************************solucion de integral
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.pJ(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuacion 07*********************************fin J
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.j(a,b,c);
        f.igual(a,b,c);
        m.sal2(a,b,c);
        m.pJ(a,b,c);
        m.alphaBeta(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------
        subtitulos.add(new String[]{
                "Tomamos la funcion J",
                //"definimos el gradiente epsilón de N transpuesta",
                "reemplazamos los gradientes",
                "extraemos las constantes",
                "trabajaremos la integral",
                "reemplazamos y",
                "solucion de integral",
                "reemplzando nuevos componentes de J"
        });




        //transicion 9
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(3);
        //Ecuancion 01******** // tomaNDO ECUACION G
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.g(a,b,c);
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
        //Ecuancion 02******** G = C
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.g(a,b,c);
        f.igual(a,b,c);
        f.c(a,b,c);
        //fin C
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 03******** reemplazando
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.g(a,b,c);
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
                "Operaremos la ecuacion G",
                "Notamos que: ",
                "por tanto",
        });

        //transicion 10
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(4);
        //Ecuancion 01******** // tomaNDO ECUACION f
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.f(a,b,c);
        f.igual(a,b,c);
        //f
        f.cons1(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        f.integral2(a,b,c);//dv
        //fin C
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 02******** integrando
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.f(a,b,c);
        f.igual(a,b,c);
        f.cons1(a,b,c);
        m.fh(a,b,c);
        //fin C
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 03******** // tomaNDO ECUACION h
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.h(a,b,c);
        f.igual(a,b,c);
        //f
        f.cons2(a,b,c);
        f.integral(a,b,c);//SS
        f.ntrasnpuesta(a,b,c);//nt
        f.integral2(a,b,c);//dv
        //fin C
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 04******** integrando h
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.h(a,b,c);
        f.igual(a,b,c);
        f.cons2(a,b,c);
        m.fh(a,b,c);
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
                "Operaremos la ecuacion f",
                "Integramos",
                "Operaremos la ecuacion h",
                "Integramos",
        });

        //transicion 11
        formulas=new ArrayList<>();
        dimensiones=new ArrayList<>();
        descripcion=new ArrayList<>();
        transiciones.add(7);
        //Ecuancion 01******** //ECUACION f
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.f(a,b,c);
        f.igual(a,b,c);
        f.cons1(a,b,c);
        m.fh(a,b,c);
        //fin C
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 02******** ecuacion h
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.h(a,b,c);
        f.igual(a,b,c);
        f.cons2(a,b,c);
        m.fh(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 03******** // ecuacion C
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.c(a,b,c);
        f.igual(a,b,c);
        m.s2(a,b,c);
        m.omega(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 04******** ecuacion k
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.k(a,b,c);
        f.igual(a,b,c);
        m.sal2(a,b,c);
        m.p(a,b,c);
        m.alphaBeta(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 05******** ecuacion j
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.j(a,b,c);
        f.igual(a,b,c);
        m.sal2(a,b,c);
        m.pJ(a,b,c);
        m.alphaBeta(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 06******** ecuacion G
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        f.g(a,b,c);
        f.igual(a,b,c);
        m.s2(a,b,c);
        m.omega(a,b,c);
        m.alpha(a,b,c);
        m.beta(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        //Ecuancion 07******** Matriz
        a=new ArrayList<>();
        b=new ArrayList<>();
        c=new ArrayList<>();
        m.finM(a,b,c);
        //-----------
        formulas.add(a);
        dimensiones.add(b);
        descripcion.add(c);
        formulasC.add(formulas);
        dimensionesC.add(dimensiones);
        descripcionC.add(descripcion);
        //--------------------------------------------------------------------------------------------------------------
        subtitulos.add(new String[]{
                "Matriz f",
                "Matriz h",
                "Matriz C",
                "Matriz K",
                "Matriz J",
                "Matriz G",
                "Matriz Final"
        });



        titulos = new String[]{
                "Convertinos el mundo x, y, z en el mundo épsilon, eta, psi",
                "Operamos primer componente",
                "Operamos segundo componente",
                "Operamos Inversa de segundo componente",
                "reemplazamos componentes en formula de conversion",

                "Operamos la matriz C",
                "Operamos la matriz K",
                "Operamos la matriz J",
                "Operamos la matriz G",
                "Operamos las matrices f y h",
                "Revisamos Matriz Final"


        };


    }
    public SceneMatrizComponent(Stage stage) {
        inicializar();
        lanzar(stage);
        //super(stage);
    }






}
