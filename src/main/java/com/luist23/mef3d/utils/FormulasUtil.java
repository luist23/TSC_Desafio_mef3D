package main.java.com.luist23.mef3d.utils;

import java.util.ArrayList;

public class FormulasUtil {
    public FormulasUtil(){
    }

    public void ntrasnpuesta(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("matriz/nt");
        b.add("11");
        c.add("52matriz/nt");
    }
    public void integral(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("agrupador/integral");
        b.add("21");
        c.add("0");
    }
    public void residuo1(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("residuo1");
        b.add("11");
        c.add("0");
    }
    public void residuo2(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("residuo2");
        b.add("11");
        c.add("0");
    }
    public void integral2(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("agrupador/derivada");
        b.add("12");
        c.add("0");
    }
    public void igual(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("operador/igual");
        b.add("11");
        c.add("0");
    }
    public void menos(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("operador/menos");
        b.add("11");
        c.add("0");
    }
    public void mas(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("operador/mas");
        b.add("11");
        c.add("0");
    }
    public void x(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("x");
        b.add("11");
        c.add("0");
    }
    public void y(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("y");
        b.add("11");
        c.add("0");
    }
    public void gradiente(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("gradiente");
        b.add("11");
        c.add("0");
    }
    public void cons1(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("igualdad1");
        b.add("14");
        c.add("0");
    }
    public void cons2(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("igualdad1");
        b.add("14");
        c.add("0");
    }
    public void gradiente2(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("gradiente2");
        b.add("11");
        c.add("0");
    }
    public void cero(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("operador/cero");
        b.add("11");
        c.add("0");
    }

    public void corchete1(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("agrupador/corchete1");
        b.add("11");
        c.add("0");
    }
    public void corchete2(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("agrupador/corchete2");
        b.add("11");
        c.add("0");
    }

    public void parentesis1(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("agrupador/parentesis1");
        b.add("11");
        c.add("0");
    }
    public void parentesis2(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("agrupador/parentesis2");
        b.add("11");
        c.add("0");
    }

    public void mn(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("mn");
        b.add("11");
        c.add("17ns");
    }
    public void ma(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("ma");
        b.add("11");
        c.add("51as");
    }
    public void mb(ArrayList<String> a,ArrayList<String> b,ArrayList<String> c){
        a.add("mb");
        b.add("11");
        c.add("51as");
    }






}
