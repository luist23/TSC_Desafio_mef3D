package main.java.com.luist23.mef3d.utils;

import main.java.com.luist23.mef3d.Main;

import java.util.ArrayList;

public class MatricesUtil {

    public MatricesUtil(){
    }

    public void gradienteXN(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteXdeN");
        b.add("13");
        c.add("0");
    }
    public void gradienteEN(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteEdeN");
        b.add("13");
        c.add("0");
    }
    public void betaMatriz(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/betaMatriz");
        b.add("47");
        c.add("0");
    }
    public void beta(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/beta");
        b.add("11");
        c.add("47matriz_component/betaMatriz");
    }
    public void gradienteENOpe(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteEdeNOperado1");
        b.add("77");
        c.add("0");
        a.add("matriz_component/gradienteEdeNOperado2");
        b.add("79");
        c.add("0");
    }
    public void gradienteEX(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteEdeX");
        b.add("13");
        c.add("0");
    }
    public void gradienteEXIn(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteEdeXInvertido");
        b.add("14");
        c.add("0");
    }
    public void gradienteX(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteX");
        b.add("11");
        c.add("0");
    }
    public void gradienteE(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteE");
        b.add("11");
        c.add("0");
    }
    public void x(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/Xmatriz");
        b.add("11");
        c.add("0");
    }
    public void xMatriz(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/XmatrizComponent");
        b.add("15");
        c.add("0");
    }
    public void gradienteEMatriz(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteEMatriz");
        b.add("71");
        c.add("0");
    }
    public void gradienteEXOperado(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteEdeXOperado");
        b.add("75");
        c.add("0");
    }
    public void gradienteEXResuelto(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteEdeXOperadoResuelto1");
        b.add("46");
        c.add("0");
        a.add("matriz_component/gradienteEdeXOperadoResuelto2");
        b.add("45");
        c.add("0");
    }
    public void gradienteEXResueltoSimplificado(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteEdeXOperadoResueltoSimplificado");
        b.add("59");
        c.add("0");
    }
    public void determinante(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/determinante");
        b.add("12");
        c.add("0");
    }
    public void determinante2(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/determinante2");
        b.add("32");
        c.add("0");
    }
    public void adjunta(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/adjunta");
        b.add("13");
        c.add("0");
    }
    public void determinanteR(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/determinanteResuelto");
        b.add("59");
        c.add("0");
    }
    public void s1(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/s1");
        b.add("59");
        c.add("0");
    }
    public void alphaMatriz(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/alphaMatriz");
        b.add("59");
        c.add("0");
    }
    public void s(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/s");
        b.add("11");
        c.add("0");
    }
    public void s2(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/1s");
        b.add("21");
        c.add("59matriz_component/s1");
    }

    public void sal2(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/1s2");
        b.add("21");
        c.add("59matriz_component/s2");
    }
    public void alphaBeta(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/betaAlphaTrans");
        b.add("12");
        c.add("0");
    }
    public void alpha(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/alpha");
        b.add("11");
        c.add("59matriz_component/alphaMatriz");
    }
    public void x1(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/x1");
        b.add("15");
        c.add("0");
    }
    public void x2(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/x2");
        b.add("15");
        c.add("0");
    }
    public void x3(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/x3");
        b.add("15");
        c.add("0");
    }
    public void integralC(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/integralC1");
        b.add("89");
        c.add("0");
        a.add("integrales/integralC2");
        b.add("89");
        c.add("0");
    }
    public void integralCv2(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/integralC1");
        b.add("89");
        c.add("0");
        a.add("integrales/integralC2v2");
        b.add("85");
        c.add("0");
    }
    public void integralCv3(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/integralCmatriz1");
        b.add("88");
        c.add("0");
        a.add("integrales/integralCmatriz2");
        b.add("18");
        c.add("0");
    }
    public void omegaMatriz(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/integralOmega");
        b.add("79");
        c.add("0");
    }
    public void p(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/p");
        b.add("11");
        c.add("29integrales/pContent");
    }
    public void pigual(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/pC1");
        b.add("49");
        c.add("0");
        a.add("integrales/pC2");
        b.add("48");
        c.add("0");
        a.add("integrales/pC3");
        b.add("43");
        c.add("0");
    }
    public void xy(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/xyMultiplicacion1");
        b.add("39");
        c.add("0");
        a.add("integrales/xyMultiplicacion2");
        b.add("39");
        c.add("0");
    }
    public void yy(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/integralY");
        b.add("19");
    }
    public void pJ(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/pJ");
        b.add("26");
    }
    public void siAlphaTrans(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("integrales/sialphaybeta");
        b.add("49");
        c.add("0");
    }
    public void omega(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/omega");
        b.add("11");
        c.add("79integrales/integralOmega");
    }


    public void x4(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("abreviaciones/x4");
        b.add("11");
        c.add("0");
    }

    public void gradienteXMatriz(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/gradienteXMatriz");
        b.add("71");
        c.add("0");
    }
    public void xyz(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c){
        a.add("matriz_component/xyzComponent1");
        b.add("42");
        c.add("0");
        a.add("matriz_component/xyzComponent2");
        b.add("48");
        c.add("0");
        a.add("matriz_component/xyzComponent3");
        b.add("46");
        c.add("0");
    }



}
