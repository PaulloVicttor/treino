package br.com.justnewcars.classe;

//<editor-fold defaultstate="collapsed" desc="imports...">
//import ...
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author paulo.machados, 28 de set de 2019, 20:49:42
 * Last update: -
 *///</editor-fold>
public enum TipoVeiculo {
    
    //<editor-fold defaultstate="collapsed" desc="constants...">
    //Hatch, sedã, Picape, Minivan, Perua e SUV
    //0              1              2                 3                   4               5
    HATCH("Hatch"), SEDAN("Sedã"), PICAPE("Picape"), MINIVAN("Minivan"), PERUA("Perua"), SUV("SUV");
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="auxiliary attributes...">
    private String texto;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="constructor...">
    private TipoVeiculo(String texto){
        this.texto = texto;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getter methods...">
    public String getTexto(){
        return texto;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static methods...">
    
    //</editor-fold>
    
}
