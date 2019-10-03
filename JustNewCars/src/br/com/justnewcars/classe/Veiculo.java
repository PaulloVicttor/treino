package br.com.justnewcars.classe;

//<editor-fold defaultstate="collapsed" desc="imports...">
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: Respresentar um veiculo no sistema
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author paulo.machados, 28 de set de 2019, 19:07:24
 * Last update: -
 *///</editor-fold>
public class Veiculo extends Object {
    
    //<editor-fold defaultstate="collapsed" desc="attributes...">
    
    //<editor-fold defaultstate="collapsed" desc="main attributes...">
    private String marca; //20
    private String modelo;
    private TipoVeiculo tipo;
    private int ano; // > 1940 <atual + 1
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constants attributes...">
    public static final int QTD_CHAR_MARCA = 20;
    public static final int QTD_CHAR_MODELO = 30;
    public static final int ANO_LIMITE_MIN = 1940;
//    public static final int ANO_LIMITE_MAX = ? ANO ATUAL + 1;
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    
    //</editor-fold>
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="constructors...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="methods...">
    
    //<editor-fold defaultstate="collapsed" desc="getter and setter methods...">
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        //remove espaços em branco
        marca = marca.trim();
        //trnaformar tudo para maiusculo
        marca = marca.toUpperCase();
        //limitar em 20 chars
        if (marca.length() > 20) {
            
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="override methods...">
    
    //</editor-fold>    
    
    //<editor-fold defaultstate="collapsed" desc="auxiliary methods...">
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="static methods...">
    public static int getAnoLimiteMax(){
        return Calendar.getInstance().get(Calendar.YEAR);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="main methods...">
    
    //</editor-fold>
    
    //</editor-fold>

    
        
}//class
