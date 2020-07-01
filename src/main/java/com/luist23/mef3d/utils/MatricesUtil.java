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
