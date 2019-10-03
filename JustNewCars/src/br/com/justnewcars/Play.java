package br.com.justnewcars;

//<editor-fold defaultstate="collapsed" desc="imports...">
import br.com.justnewcars.classe.TipoVeiculo;
import br.com.justnewcars.classe.Veiculo;
import static java.lang.Double.parseDouble;
import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showInputDialog;

//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="documentation...">
/**
 * Objective: ...
 * 
 * Description: ...
 * 
 * @version 1.0.0
 * @author paulo.machados, 28 de set de 2019, 18:47:06
 * Last update: -
 *///</editor-fold>
public class Play {
    
    //<editor-fold defaultstate="collapsed" desc="static attributes...">
    
    //</editor-fold>
    
    //<editor-fold desc="executable method...">
    public static void main(String[] args) {
        
        Veiculo veiculo1 = new Veiculo();
        Veiculo veiculo2 = new Veiculo();
          
        
        
        TipoVeiculo tipo = TipoVeiculo.SEDAN;
        System.out.println(tipo.getTexto());
        
        System.out.println(Calendar.YEAR);
        System.out.println(Veiculo.getAnoLimiteMax());
    }//main
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="static and auxiliary methods...">
    
    //</editor-fold>
    
}//class
